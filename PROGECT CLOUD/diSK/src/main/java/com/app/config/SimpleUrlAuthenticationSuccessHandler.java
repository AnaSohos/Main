package com.app.config;

import java.io.IOException;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;


//Эта реализация будет определять URL-адрес для перенаправления изера после входа в
// систему на основе роли юзера

public class SimpleUrlAuthenticationSuccessHandler  implements AuthenticationSuccessHandler{
     private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
 

     // Вызывает метод родительского
     // класса handle()для переадресации или перенаправления на целевой URL-адрес,
     // а затем сlearAuthenticationAttributes()удаление любых оставшихся данных сеанса
     //request - запрос, вызвавший успешную аутентификацию
     //response - ответ
     //authentication- объект аутентификации, который был создан в процессе аутентификации
    public void onAuthenticationSuccess(HttpServletRequest request, 
      HttpServletResponse response, Authentication authentication)
      throws IOException {
  
        handle(request, response, authentication);
        clearAuthenticationAttributes(request);
    }

    protected void handle(HttpServletRequest request, 
      HttpServletResponse response, Authentication authentication)
      throws IOException {
  
        String targetUrl = determineTargetUrl(authentication);
 
        if (response.isCommitted()) {
            return;
        }
 
        redirectStrategy.sendRedirect(request, response, targetUrl);
    }
 //Создает целевой URL-адрес в соответствии с логикой, определенной в основном классе Javadoc
    protected String determineTargetUrl(Authentication authentication) {
        
        boolean isUser = false;
        boolean isAdmin = false;
        Collection<? extends GrantedAuthority> authorities
         = authentication.getAuthorities();
        for (GrantedAuthority grantedAuthority : authorities) {
            if (grantedAuthority.getAuthority().equals("ROLE_USER")) {
                isUser = true;
                break;
            } else if (grantedAuthority.getAuthority().equals("ROLE_ADMIN")) {
                isAdmin = true;
                break;
            }
        }
 
        
        if (isUser) {
            return "/cabinet";
        } else if (isAdmin){
            return "/admin/";
        } else{
          return "/";
        }
        
    }
 
    protected void clearAuthenticationAttributes(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return;
        }
        session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
    }
 
    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.redirectStrategy = redirectStrategy;
    }
    protected RedirectStrategy getRedirectStrategy() {
        return redirectStrategy;
    }

}

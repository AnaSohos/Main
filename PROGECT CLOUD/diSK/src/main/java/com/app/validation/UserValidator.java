/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.validation;
import com.app.entity.Users;
import com.app.form.UserForm;
import com.app.repos.UsersRepository;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
/**
 *
 * @author Root
 */
//валидация пользователя
@Component
public class UserValidator implements Validator{
    @Autowired
    UsersRepository repository;
     private  final String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";
     private final String EMAIL_PATTERN = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
     private final String USERNAME_PATTERN = "^[a-z0-9_@]{3,25}$";
    Pattern pattern;
     Matcher matcher;
    
     // The classes are supported by this validator.
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz == UserForm.class;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserForm userForm = (UserForm) target;
        

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "login", "NotEmpty.userForm.login");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.userForm.password");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "NotEmpty.userForm.confirmPassword");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.userForm.name");
        
        if (!userForm.getLogin().isEmpty()){
            Users users = repository.findByLogin(userForm.getLogin().toLowerCase());
             if (users != null) {
                // Email has been used by another account.
                errors.rejectValue("login", "Duplicate.userForm.login");
            }
        
        
	   if (!validate(EMAIL_PATTERN, userForm.getLogin())){
                errors.rejectValue("login", "Match.userForm.email");
           }
        }
         if (!errors.hasErrors()) {
            if (!userForm.getConfirmPassword().equals(userForm.getPassword())) {
                errors.rejectValue("confirmPassword", "Match.userForm.confirmPassword");
            }
        }
           if (!userForm.getPassword().isEmpty() && !validate(PASSWORD_PATTERN, userForm.getPassword())){
              // errors.rejectValue("confirmPassword", "Match.userForm.password");
           }
         
    }
    private boolean validate(String pat, String str){
        pattern = Pattern.compile(pat);
        matcher = pattern.matcher(str);
         return matcher.matches();
    }
    
}



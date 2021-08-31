/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

import com.app.entity.Users;
import com.app.repos.UsersRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
/**
 *
 * @author Root
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UsersRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepository.findByLogin(username);
           if (user == null) {
            System.out.println("User not found! " + username);
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
       System.out.println("Found User: " + user.getName());
       String role = user.getRole().getRoleName();
        List<GrantedAuthority> grantList = new ArrayList<>();
            GrantedAuthority authority = new SimpleGrantedAuthority(role);
            grantList.add(authority);
        UserDetails  details = (UserDetails) new User(user.getLogin(),user.getPassword(),grantList);
        return details;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

import com.app.entity.Roles;
import com.app.entity.Users;
import com.app.repos.RolesRepository;
import com.app.repos.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Root
 */
@Service
public class UsersService implements UserServiceInter {
    @Autowired UsersRepository usersRepository;
    @Autowired private RolesRepository roleRepository;
    @Autowired private PasswordEncoder passwordEncoder;

    // создание пользователя
    @Override
    public String createUser(String login, String name, String password) {
        String error=null;
        Users newUser = null;
        try {
            newUser = new Users();
            newUser.setLogin(login);
            newUser.setName(name);
            newUser.setPassword(passwordEncoder.encode(password));
            Roles role = roleRepository.findByRoleName("ROLE_USER");
            newUser.setRole(role);
            newUser = usersRepository.save(newUser);
        } // Other error!!
        catch (Exception e) {
            error = e.getMessage();
        }
        return error;
    }


    // сброс пароля пользователя
    @Override
    public String resetPassword(String login, String password) {
        String error=null;
        Users user = null;
        try {
            user = usersRepository.findByLogin(login);
            if (user != null) {
                user.setPassword(passwordEncoder.encode(password));
                user = usersRepository.save(user);
            }
        } // Other error!!
        catch (Exception e) {
            error = e.getMessage();
        } // Other error!!
        return error;
    }
    }





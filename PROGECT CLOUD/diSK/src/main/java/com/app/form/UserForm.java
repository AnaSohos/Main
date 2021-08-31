/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.form;

/**
 *
 * @author Root
 */
// форма для создания пользователя
public class UserForm {
    private String name;
    private String login;
    private String password;
    private String confirmPassword;
    private String role;

    public UserForm(String name, String login, String password, String confirmPassword,  String role) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;

        this.role = role;
    }

    public UserForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

 
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    
}

package com.app.service;

public interface UserServiceInter {

    String createUser(String login,String name,String password);

    String resetPassword(String login,String password);

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.repos;

import com.app.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Root
 */
public interface UsersRepository  extends JpaRepository<Users, String>{
    Users findByLogin(String userLogin);

}

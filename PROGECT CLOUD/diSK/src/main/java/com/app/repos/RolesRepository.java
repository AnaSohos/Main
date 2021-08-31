/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.repos;

import com.app.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Root
 */
public interface RolesRepository  extends JpaRepository<Roles, String>{
     Roles findByRoleName(String roleName);

}

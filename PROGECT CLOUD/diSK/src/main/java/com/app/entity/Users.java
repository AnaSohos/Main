/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Root
 */
@Entity
@Table(name = "users")
@Getter
@Setter
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(name = "user_name",nullable = false,length = 250)
    private String name;
    @Id
    @Column(name = "user_login",nullable = false,length = 50)
    private String login;
    @Column(name = "user_password",nullable = false,length = 128)
    private String password;
    
    
    @ManyToOne
    @JoinColumn(name = "role_name",nullable = false)
    private Roles role;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    List<UserFiles> files;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    List<Links> links;

    public Users() {
    }

      
}

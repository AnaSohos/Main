/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Roles implements Serializable {

    private static final long serialVersionUID = 11L;
    @Id
    @Column(name = "role_name",nullable = false,length = 50)
    private String roleName;
    @Column(name="name",nullable = false,length = 50)
    private String name;
    

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
    List<Users> users = new ArrayList<>();
    public Roles() {
    }

    public Roles(String roleName, String name) {
        this.roleName = roleName;
        this.name = name;
    }

    
    

   

   
    
}

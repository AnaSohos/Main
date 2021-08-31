/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entity;


import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author Root
 */
@Entity
@Getter
@Setter
public class Links {
    @Id
    String uuid;
    
    String link;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="file_id")
    UserFiles file;
    
   
    
    LocalDateTime createTime;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_login")
    Users user;

    public Links() {
        this.createTime=LocalDateTime.now();
    }

    public Links(String uuid) {
        this.uuid = uuid;
        this.createTime=LocalDateTime.now();
    }
    
    
    
    
}

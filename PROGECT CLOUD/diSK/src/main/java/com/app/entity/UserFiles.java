/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
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

@Entity
@Table(name = "files")
@Getter
@Setter
public class UserFiles implements Serializable {

    private static final long serialVersionUID = 11L;
    @Id
    @Column(name = "uuid",nullable = false,length = 50)
    private String uuid;
    
    @Column(name="name",nullable = false,length = 500)
    private String name;
    @Column(name="path",nullable = false,length = 1000)
    private String path;
    
    @Column(name="file_count")
    private int fileCount=1;
    
    @Column(name="file_size")
    private long fileSize=0;
    
    @Column(name="create_date",nullable = false)
    private LocalDateTime createDate;
    

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_login")
    Users user;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "file")
    List<Links> links = new ArrayList<>();
    
    
    public UserFiles() {
        this.fileCount=1;
        this.createDate=LocalDateTime.now();
    }

    public UserFiles(String uuid, String name, Users user) {
        this.uuid = uuid;
        this.name = name;
        this.user = user;
        this.createDate=LocalDateTime.now();
        this.fileCount=1;
    }
    

    
    
}

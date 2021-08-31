/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.repos;

import com.app.entity.Links;
import com.app.entity.Users;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Root
 */
public interface LinksRepository  extends PagingAndSortingRepository<Links, String>{
    List<Links> findAllByUser(Users user, Pageable pageable);
}

package com.AcmeFresh.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.AcmeFresh.project.Model.Cart;

@Repository
public interface Cart_Repo extends JpaRepository<Cart, Integer> {

}

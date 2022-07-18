package com.AcmeFresh.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AcmeFresh.project.Model.Modern_Techniques;

@Repository
public interface Modern_Tech_Repo extends JpaRepository<Modern_Techniques, Integer>{

}

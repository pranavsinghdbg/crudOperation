package com.project.repoI;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.customer;

public interface customerRepo extends JpaRepository<customer, Integer>{

}

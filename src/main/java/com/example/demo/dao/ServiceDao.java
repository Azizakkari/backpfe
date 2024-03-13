package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Service;

@Repository
public interface ServiceDao extends JpaRepository<Service, Integer> {

}

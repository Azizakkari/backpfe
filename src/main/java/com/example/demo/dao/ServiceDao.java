package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Service;

public interface ServiceDao extends JpaRepository<Service, Integer> {

}

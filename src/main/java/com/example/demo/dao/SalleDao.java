package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Salle;

public interface SalleDao extends JpaRepository<Salle, Integer> {
	

}

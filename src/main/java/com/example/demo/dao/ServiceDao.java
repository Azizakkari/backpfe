package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Leservice;


@Repository
public interface ServiceDao extends JpaRepository<Leservice, Integer> {
	Leservice findByNom(String nom);
}

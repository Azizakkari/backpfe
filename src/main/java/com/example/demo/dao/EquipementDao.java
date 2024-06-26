package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Equipement;

@Repository
public interface EquipementDao extends JpaRepository<Equipement, Integer>{
	Equipement findByconfiguration(String configuration);
}

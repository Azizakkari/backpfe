package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Integer> {

}

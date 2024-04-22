package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Categorie;


@Repository
public interface CategorieDao extends JpaRepository<Categorie, Integer> {
Categorie findByNom(String nom);
}

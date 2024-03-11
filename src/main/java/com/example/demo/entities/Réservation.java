package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Réservation implements Serializable {
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private Date date_du_résrvation   ;
	@ManyToOne
	private Salle salle;
	@ManyToOne
	private  Utilisateur utilisateur;

	
}
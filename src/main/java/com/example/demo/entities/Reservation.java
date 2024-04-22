package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

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
public class Reservation implements Serializable {
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private String typemeeting;
	private Date date_du_resrvation;
	private Date date_fin;
	@ManyToOne
	private Salle salle;
	@ManyToOne
	private  Utilisateur utilisateur;

	
}
package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
public class Demande  implements Serializable{
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	private Date date_acquisition;
	private String configuration;
	private String etat;
	@ManyToOne
	@JsonBackReference("user-demande")
	private  Utilisateur utilisateur;
	@ManyToOne
	@JsonBackReference("demande-equip")
	private  Equipement equipement;
}

package com.example.demo.DTO;

import java.sql.Date;

import com.example.demo.entities.Equipement;
import com.example.demo.entities.Salle;
import com.example.demo.entities.Utilisateur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemandeResponseDto {
	private int id;
	private Date date_acquisition;
	private String configuration;
	private String etat;
	
	private  Utilisateur utilisateur;

	private  Equipement equipement;
}

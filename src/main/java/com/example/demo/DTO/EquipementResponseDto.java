package com.example.demo.DTO;

import java.sql.Date;
import java.util.List;

import com.example.demo.entities.Categorie;
import com.example.demo.entities.Reservation;
import com.example.demo.entities.Utilisateur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipementResponseDto {
	private int id;
	private Date date_acquisition;
	private String configuration;
	private String etat;
	private boolean reservable;


	private Reservation reservation;
	private  Utilisateur utilisateur;
	private  Categorie categorie;
}

package com.example.demo.DTO;

import java.util.List;



import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurRequestDto {
	
	
	private String nom;
	private String prenom;
	private Integer cin;
	private String matricule;
	private String poste;
	private String email;
	private String adresse;
	private Integer telephone;	
	

}

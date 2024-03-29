package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Service implements Serializable {
	
	
	@Id  @GeneratedValue (strategy=GenerationType.IDENTITY)
	
	private int id; 
	private String nom;
	@ManyToOne
	private Direction direction;
	@OneToMany(mappedBy = "service", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Utilisateur> utilisateur;

}

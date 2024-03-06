package com.example.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class utilisateurs implements Serializable {
	@Id @GeneratedValue
	private Integer id;
	private String nom;
	private String mail;
	@ManyToOne
	private Service service;
	

}

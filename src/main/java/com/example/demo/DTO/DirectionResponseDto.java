package com.example.demo.DTO;

import java.util.List;

import com.example.demo.entities.Leservice;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirectionResponseDto {
	private int id;
	private String nom;
	private String description;
	
	private List<Leservice> lesservices;
}

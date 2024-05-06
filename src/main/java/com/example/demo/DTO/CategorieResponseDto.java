package com.example.demo.DTO;

import java.util.List;

import com.example.demo.entities.Equipement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategorieResponseDto {
	private int id;
	private String nom;
	private List<Equipement> equipement;
}

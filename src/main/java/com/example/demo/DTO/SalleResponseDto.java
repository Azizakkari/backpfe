package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalleResponseDto {
	
	private int id; 
	private String nom;
	private Integer nombre_de_salle; 
	
}


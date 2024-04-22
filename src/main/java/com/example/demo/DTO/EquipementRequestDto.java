package com.example.demo.DTO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipementRequestDto {
	
	private Date date_acquisition;
	private String configuration;
	private String etat;
	private boolean reservable;
}

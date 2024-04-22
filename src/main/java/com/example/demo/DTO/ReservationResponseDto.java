package com.example.demo.DTO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationResponseDto {
	private int id;
	private String typemeeting;
	private Date date_du_resrvation;
	private Date date_fin;
}

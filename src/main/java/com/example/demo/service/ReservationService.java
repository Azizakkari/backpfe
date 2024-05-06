package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.ReservationRequestDto;
import com.example.demo.DTO.ReservationResponseDto;
import com.example.demo.DTO.UtilisateurRequestDto;
import com.example.demo.DTO.UtilisateurResponseDto;

public interface ReservationService {
	ReservationResponseDto ajouterReservation(ReservationRequestDto reservationRequestDto);
	List<ReservationResponseDto>findall();
	void delete(Integer id);
	ReservationResponseDto LoadReservationById(Integer id);
	ReservationResponseDto updateReservation(ReservationRequestDto reservationRequestDto, Integer id);
}


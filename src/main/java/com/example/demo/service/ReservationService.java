package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.ReservationRequestDto;
import com.example.demo.DTO.ReservationResponseDto;

public interface ReservationService {
	ReservationResponseDto ajouterReservation(ReservationRequestDto reservationRequestDto);
	List<ReservationResponseDto>findall();
	void delete(Integer id);
}


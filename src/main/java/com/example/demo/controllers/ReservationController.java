package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.DTO.ReservationRequestDto;
import com.example.demo.DTO.ReservationResponseDto;
import com.example.demo.service.ReservationService;

@RestController
@RequestMapping("reservation")
@CrossOrigin("*")
public class ReservationController {

	ReservationService reservationService;

	public ReservationController(ReservationService reservationService) {
		super();
		this.reservationService = reservationService;
	}

	@PostMapping()
	public ReservationResponseDto ajouterReservation(@RequestBody() ReservationRequestDto reservationRequestDto) {
		return reservationService.ajouterReservation(reservationRequestDto);

	}

	@GetMapping()
	public List<ReservationResponseDto> getreservation() {
		return reservationService.findall();

	}
	
	@DeleteMapping("/id/{id}")
	public void delete(@PathVariable() Integer id) {
		reservationService.delete(id);
		System.out.println("Controler contacter");
	}

	

}

package com.example.demo.controllers;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.DemandeRequestDto;
import com.example.demo.DTO.DemandeResponseDto;

import com.example.demo.service.DemandeService;

@RestController
@RequestMapping("demande")
@CrossOrigin("origins = \"*\", allowedHeaders = \"*\"")
public class DemandeController {
	DemandeService demandeService;

	public DemandeController(DemandeService demandeService) {
		super();
		this.demandeService = demandeService;
	}
	@PostMapping()
	@PreAuthorize("hasAuthority('SCOPE_USER')")
	public DemandeResponseDto ajouterDemande(@RequestBody() DemandeRequestDto demandeRequestDto) {
		return demandeService.ajouterDemande(demandeRequestDto);

	}
	
	@GetMapping()
	@PreAuthorize("hasAuthority('SCOPE_USER')")
	public List<DemandeResponseDto> listdemande() {
		return demandeService.findall();

	}
	

}

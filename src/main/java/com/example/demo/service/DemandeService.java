package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.DemandeRequestDto;
import com.example.demo.DTO.DemandeResponseDto;


public interface DemandeService {
	DemandeResponseDto ajouterDemande(DemandeRequestDto demandeRequestDto);
	List<DemandeResponseDto>findall();
}

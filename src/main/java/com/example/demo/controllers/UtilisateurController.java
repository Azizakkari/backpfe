package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UtilisateurRequestDto;
import com.example.demo.DTO.UtilisateurResponseDto;
import com.example.demo.service.UtilisateurService;

@RestController
@RequestMapping("users")

public class UtilisateurController {
	UtilisateurService utilisateurService;

	public UtilisateurController(UtilisateurService utilisateurService) {
		super();
		this.utilisateurService = utilisateurService;
	}
    @GetMapping()
	public List<UtilisateurResponseDto> getusers() {
		return utilisateurService.findall();
		
	}
	
	@PostMapping()
	public UtilisateurResponseDto AjouterUser(@RequestBody()UtilisateurRequestDto utilisateurRequestDto) {
	return utilisateurService.Ajouteruser(utilisateurRequestDto);
			
	}
}

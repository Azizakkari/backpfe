package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.DTO.EquipementRequestDto;
import com.example.demo.DTO.EquipementResponseDto;
import com.example.demo.DTO.UtilisateurRequestDto;
import com.example.demo.DTO.UtilisateurResponseDto;
import com.example.demo.service.EquipementService;

@RestController
@RequestMapping("equipement")
@CrossOrigin("origins = \"*\", allowedHeaders = \"*\"")
public class EquipementController {

	
	EquipementService equipementService;

	public EquipementController(EquipementService equipementService) {
		super();
		this.equipementService = equipementService;
	}

	@PostMapping()
	public EquipementResponseDto ajouterEquipement(@RequestBody() EquipementRequestDto equipementRequestDto) {
		return equipementService.ajouterEquipement(equipementRequestDto);

	}

	@GetMapping()
	public List<EquipementResponseDto> getequipement() {
		return equipementService.findall();

	}
	
	@DeleteMapping("/id/{id}")
	public void delete(@PathVariable() Integer id) {
		equipementService.delete(id);
		System.out.println("Controler contacter");
	}
	@GetMapping("{id}")
	public EquipementResponseDto LoadequipById(@PathVariable("id") Integer id) {
		return equipementService.LoadequipById(id);
		
	}
	@PutMapping("/majequip/{id}")
	public EquipementResponseDto updateEquip(@PathVariable("id") Integer id, @RequestBody EquipementRequestDto equipementRequestDto) {
		  System.out.println("Controller contacté");
	
		return equipementService.updateEquip(equipementRequestDto ,id);
	}	
}

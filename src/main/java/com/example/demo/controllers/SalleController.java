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


import com.example.demo.DTO.SalleRequestDto;
import com.example.demo.DTO.SalleResponseDto;
import com.example.demo.service.SalleService;

@RestController
@RequestMapping("salles")
@CrossOrigin("*")
public class SalleController {
SalleService salleService;

public SalleController(SalleService salleService) {
	super();
	this.salleService = salleService;
}

@PostMapping()
public SalleResponseDto ajouterSalle(@RequestBody() SalleRequestDto salleRequestDto) {
	return salleService.ajouterSalle(salleRequestDto);

}

@GetMapping()
public List<SalleResponseDto> getsalle() {
	return salleService.findall();

}

@DeleteMapping("/id/{id}")
public void delete(@PathVariable() Integer id) {
	salleService.delete(id);
	System.out.println("Controler contacter");
}



}

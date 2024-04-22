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

import com.example.demo.DTO.CategorieRequestDto;
import com.example.demo.DTO.CategorieResponseDto;

import com.example.demo.service.CategorieService;


@RestController
@RequestMapping("categorie")
@CrossOrigin("*")
public class CategorieController {
	CategorieService categorieService;

	public CategorieController(CategorieService categorieService) {
		super();
		this.categorieService = categorieService;
	}

	@PostMapping()
	public CategorieResponseDto ajouterCategorie(@RequestBody() CategorieRequestDto categorieRequestDto) {
		return categorieService.ajouterCategorie(categorieRequestDto);

	}

	@GetMapping()
	public List<CategorieResponseDto> getcategorie() {
		return categorieService.findall();

	}
	
	@DeleteMapping("/id/{id}")
	public void delete(@PathVariable() Integer id) {
		categorieService.delete(id);
		System.out.println("Controler contacter");
	}
}

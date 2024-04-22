package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.CategorieRequestDto;
import com.example.demo.DTO.CategorieResponseDto;


public interface CategorieService {
	CategorieResponseDto ajouterCategorie(CategorieRequestDto categorieRequestDto);
	List<CategorieResponseDto>findall();
	void delete(Integer id);
}

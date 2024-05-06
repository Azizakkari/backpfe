package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.CategorieRequestDto;
import com.example.demo.DTO.CategorieResponseDto;
import com.example.demo.DTO.DirectionRequestDto;
import com.example.demo.DTO.DirectionResponseDto;


public interface CategorieService {
	CategorieResponseDto ajouterCategorie(CategorieRequestDto categorieRequestDto);
	List<CategorieResponseDto>findall();
	void delete(Integer id);
	CategorieResponseDto LoadCategorieById(Integer id);
	CategorieResponseDto updateCategorie(CategorieRequestDto categorieRequestDto, Integer id);
}

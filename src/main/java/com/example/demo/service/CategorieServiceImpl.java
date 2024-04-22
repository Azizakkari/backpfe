package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.CategorieRequestDto;
import com.example.demo.DTO.CategorieResponseDto;

import com.example.demo.dao.CategorieDao;

import com.example.demo.entities.Categorie;

@Service
public class CategorieServiceImpl implements CategorieService{
	
	private CategorieDao categorieDao;
	private ModelMapper modelMapper;

	public CategorieServiceImpl(CategorieDao categorieDao, ModelMapper modelMapper) {
		super();
		this.categorieDao = categorieDao;
		this.modelMapper = modelMapper;
	}

	@Override
	public CategorieResponseDto ajouterCategorie(CategorieRequestDto categorieRequestDto) {
		Categorie categ=modelMapper.map(categorieRequestDto, Categorie.class);
		Categorie categoriesaved=categorieDao.save(categ);
		return modelMapper.map(categoriesaved, CategorieResponseDto.class);
	}
	public List<CategorieResponseDto> findall() {
		List<CategorieResponseDto> DirectionResponseDto =categorieDao.findAll().stream().map(el->modelMapper.map(el,CategorieResponseDto.class)).collect(Collectors.toList());
		return DirectionResponseDto;
		 
	}
	@Override
	public void delete(Integer id) {
		System.out.println("controleur contacté");
		categorieDao.deleteById(id);
		
	}

}



package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import com.example.demo.DTO.EquipementRequestDto;
import com.example.demo.DTO.EquipementResponseDto;

import com.example.demo.dao.EquipementDao;

import com.example.demo.entities.Equipement;

@Service
public class EquipementServiceImpl implements EquipementService {
	private EquipementDao equipementDao;
	private ModelMapper modelMapper;

	public EquipementServiceImpl(EquipementDao equipementDao, ModelMapper modelMapper) {
		super();
		this.equipementDao = equipementDao;
		this.modelMapper = modelMapper;
	}

	@Override
	public EquipementResponseDto ajouterEquipement(EquipementRequestDto equipementRequestDto) {
		Equipement Equip=modelMapper.map(equipementRequestDto, Equipement.class);
		Equipement equipsaved=equipementDao.save(Equip);
		return modelMapper.map(equipsaved, EquipementResponseDto.class);
	}
	public List<EquipementResponseDto> findall() {
		List<EquipementResponseDto> EquipementResponseDto =equipementDao.findAll().stream().map(el->modelMapper.map(el,EquipementResponseDto.class)).collect(Collectors.toList());
		return EquipementResponseDto;
		 
	}
	@Override
	public void delete(Integer id) {
		System.out.println("controleur contacté");
		equipementDao.deleteById(id);
		
	}
}

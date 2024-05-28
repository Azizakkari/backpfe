package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.DemandeRequestDto;
import com.example.demo.DTO.DemandeResponseDto;
import com.example.demo.DTO.EquipementResponseDto;
import com.example.demo.dao.DemandeDao;

import com.example.demo.entities.Demande;



@Service
public class DemandeServiceImpl  implements DemandeService{
	private DemandeDao demandeDao;
	private ModelMapper modelMapper;

	public DemandeServiceImpl(DemandeDao demandeDao, ModelMapper modelMapper) {
		super();
		this.demandeDao = demandeDao;
		this.modelMapper = modelMapper;
		
	}
	
	@Override
	public DemandeResponseDto ajouterDemande(DemandeRequestDto demandeRequestDto) {
		Demande demande=modelMapper.map(demandeRequestDto, Demande.class);
		Demande demandesaved=demandeDao.save(demande);
		return modelMapper.map(demandesaved, DemandeResponseDto.class);
	}

	@Override
	public List<DemandeResponseDto> findall() {
		List<DemandeResponseDto> DemandeResponseDto =demandeDao.findAll().stream().map(el->modelMapper.map(el,DemandeResponseDto.class)).collect(Collectors.toList());
		return DemandeResponseDto;
	}


}

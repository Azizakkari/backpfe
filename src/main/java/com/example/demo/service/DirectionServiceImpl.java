package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.DirectionRequestDto;
import com.example.demo.DTO.DirectionResponseDto;
import com.example.demo.dao.DirectionDao;
import com.example.demo.entities.Direction;

@Service
public class DirectionServiceImpl implements DirectionService{
	
	private DirectionDao directionDao;
	private ModelMapper modelMapper;

	public DirectionServiceImpl(DirectionDao directionDao, ModelMapper modelMapper) {
		super();
		this.directionDao = directionDao;
		this.modelMapper = modelMapper;
	}

	@Override
	public DirectionResponseDto AjouterDirection(DirectionRequestDto directionRequestDto) {
		Direction direction=modelMapper.map(directionRequestDto, Direction.class);
		Direction directionsaved=directionDao.save(direction);
		return modelMapper.map(directionsaved, DirectionResponseDto.class);
	}
	public List<DirectionResponseDto> findall() {
		List<DirectionResponseDto> DirectionResponseDto =directionDao.findAll().stream().map(el->modelMapper.map(el,DirectionResponseDto.class)).collect(Collectors.toList());
		return DirectionResponseDto;
		 
	}
	@Override
	public void delete(Integer id) {
		System.out.println("controleur contacté");
		directionDao.deleteById(id);
		
	}

}

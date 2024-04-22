package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.DirectionRequestDto;
import com.example.demo.DTO.DirectionResponseDto;


public interface DirectionService {
	DirectionResponseDto AjouterDirection(DirectionRequestDto directionRequestDto);
	List<DirectionResponseDto>findall();
	void delete(Integer id);
}

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

import com.example.demo.DTO.DirectionRequestDto;
import com.example.demo.DTO.DirectionResponseDto;
import com.example.demo.service.DirectionService;

@RestController
@RequestMapping("directions")
@CrossOrigin("*")
public class DirectionController {
	DirectionService directionService;

	public DirectionController(DirectionService directionService) {
		super();
		this.directionService = directionService;
	}

	@PostMapping()
	public DirectionResponseDto AjouterDirection(@RequestBody() DirectionRequestDto directionRequestDto) {
		return directionService.AjouterDirection(directionRequestDto);

	}

	@GetMapping()
	public List<DirectionResponseDto> getdirection() {
		return directionService.findall();

	}
	
	@DeleteMapping("/id/{id}")
	public void delete(@PathVariable() Integer id) {
		directionService.delete(id);
		System.out.println("Controler contacter");
	}

}

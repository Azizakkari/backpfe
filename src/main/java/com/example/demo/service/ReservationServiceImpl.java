package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import com.example.demo.DTO.ReservationRequestDto;
import com.example.demo.DTO.ReservationResponseDto;
import com.example.demo.dao.ReservationDao;
import com.example.demo.entities.Reservation;
@Service
public class ReservationServiceImpl implements ReservationService{
	private ReservationDao reservationDao;
	private ModelMapper modelMapper;

	public ReservationServiceImpl(ReservationDao reservationDao, ModelMapper modelMapper) {
		super();
		this.reservationDao = reservationDao;
		this.modelMapper = modelMapper;
	}

	@Override
	public ReservationResponseDto ajouterReservation(ReservationRequestDto reservationRequestDto) {
		Reservation reserv=modelMapper.map(reservationRequestDto, Reservation.class);
		Reservation reservationsaved=reservationDao.save(reserv);
		return modelMapper.map(reservationsaved, ReservationResponseDto.class);
	}
	public List<ReservationResponseDto> findall() {
		List<ReservationResponseDto> ReservationResponseDto =reservationDao.findAll().stream().map(el->modelMapper.map(el,ReservationResponseDto.class)).collect(Collectors.toList());
		return ReservationResponseDto;
		 
	}
	@Override
	public void delete(Integer id) {
		System.out.println("controleur contacté");
		reservationDao.deleteById(id);
		
	}
}

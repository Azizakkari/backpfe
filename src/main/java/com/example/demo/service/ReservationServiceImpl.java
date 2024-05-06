package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import com.example.demo.DTO.ReservationRequestDto;
import com.example.demo.DTO.ReservationResponseDto;
import com.example.demo.DTO.UtilisateurRequestDto;
import com.example.demo.DTO.UtilisateurResponseDto;
import com.example.demo.dao.ReservationDao;
import com.example.demo.entities.Reservation;
import com.example.demo.entities.Utilisateur;
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
	@Override
	public ReservationResponseDto LoadReservationById(Integer id) {
		Optional<Reservation> optionalreservation = reservationDao.findById(id);
		Reservation util= optionalreservation.get();
        return modelMapper.map(util, ReservationResponseDto.class);
	}
	@Override
	public ReservationResponseDto updateReservation(ReservationRequestDto reservationRequestDto , Integer id){
	Optional<Reservation>reservationoptional =reservationDao.findById(id);
	Reservation reservationmodifie=modelMapper.map(reservationRequestDto, Reservation.class);
		if (reservationoptional.isPresent()) {
			Reservation reservation =modelMapper.map(reservationRequestDto, Reservation.class);
		reservation.setId(id);
		Reservation update=reservationDao.save(reservation);
		return modelMapper.map(update, ReservationResponseDto.class);
		}	
		else { 
			
			return modelMapper.map(reservationmodifie, ReservationResponseDto.class);
		}
				

	}
}

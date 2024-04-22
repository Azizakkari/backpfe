package com.example.demo.dao;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Reservation;


@Repository
public interface ReservationDao extends JpaRepository<Reservation, Integer>{
	Reservation findBytypemeeting(String typemeeting);

}

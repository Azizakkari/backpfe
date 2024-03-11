package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Direction;


public interface DirectionDao extends JpaRepository<Direction, Integer> {

}

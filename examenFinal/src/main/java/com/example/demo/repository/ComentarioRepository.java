package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ComentarioModel;

public interface ComentarioRepository extends JpaRepository<ComentarioModel, Long> {

}

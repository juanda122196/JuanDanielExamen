package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.publicacionModel;

public interface PublicacionRepository extends JpaRepository<publicacionModel, Long> {

}

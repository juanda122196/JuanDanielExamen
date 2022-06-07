package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.publicacionModel;
import com.example.demo.repository.PublicacionRepository;

@Service
public class PublicacionService {

	@Autowired
	PublicacionRepository publicacionRepository;
	
	public publicacionModel create (publicacionModel p) {
		return publicacionRepository.save(p);
	}
	
	public Optional<publicacionModel> findById(Long idPublicacion){
		return publicacionRepository.findById(idPublicacion);
	}
}

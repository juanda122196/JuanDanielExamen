package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	public persona create (persona p) {
		return personaRepository.save(p);
	}
	
	public List<persona> getAllPersona(){
		return personaRepository.findAll();
	}
	
	public Optional<persona> findById(Long id){
		return personaRepository.findById(id);
	}
	
}

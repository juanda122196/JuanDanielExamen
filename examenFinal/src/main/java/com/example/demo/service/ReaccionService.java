package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ReaccionModel;
import com.example.demo.repository.ReaccionRepository;

@Service
public class ReaccionService {

	@Autowired
	ReaccionRepository reaccionRepository;
	
	public ReaccionModel create (ReaccionModel r) {
		return reaccionRepository.save(r);
	}
	
	public Optional<ReaccionModel> findById(Long idReaccion){
		return reaccionRepository.findById(idReaccion);
	}
}

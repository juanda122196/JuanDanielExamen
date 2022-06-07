package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ComentarioModel;
import com.example.demo.repository.ComentarioRepository;

@Service
public class ComentariosService {

	@Autowired
	ComentarioRepository comentarioRepository;
	
	public ComentarioModel create (ComentarioModel c) {
		return comentarioRepository.save(c);
	}
	
	public Optional<ComentarioModel> findById(Long idComentario){
		return comentarioRepository.findById(idComentario);
	}
}

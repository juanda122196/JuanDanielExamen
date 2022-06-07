package com.example.demo.rest;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ComentarioModel;

import com.example.demo.service.ComentariosService;

@RestController
@RequestMapping("/comentario")
public class comentarioRest {

	@Autowired
	private ComentariosService comentarioService;
	
	@PostMapping
	private ResponseEntity<ComentarioModel> save(@RequestBody ComentarioModel c ){
		ComentarioModel comen = comentarioService.create(c);
		
		try {
			return ResponseEntity.created(new URI("/comentario" + comen.getIdComentario())).body(comen);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<ComentarioModel>> getById(@PathVariable("id") Long id){

		return ResponseEntity.ok(comentarioService.findById(id));
		
	}
	
}

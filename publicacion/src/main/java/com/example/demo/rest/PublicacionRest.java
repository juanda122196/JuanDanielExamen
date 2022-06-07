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

import com.example.demo.model.publicacionModel;
import com.example.demo.service.PublicacionService;


@RestController
@RequestMapping("/publicacion")
public class PublicacionRest {

	@Autowired
	private PublicacionService publicacionService;
	
	@PostMapping
	private ResponseEntity<publicacionModel> save(@RequestBody publicacionModel p ){
		publicacionModel publi = publicacionService.create(p);
		
		try {
			return ResponseEntity.created(new URI("/publicacion" + publi.getIdPublicacion())).body(publi);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<publicacionModel>> getById(@PathVariable("id") Long id){

		return ResponseEntity.ok(publicacionService.findById(id));
		
	}
}

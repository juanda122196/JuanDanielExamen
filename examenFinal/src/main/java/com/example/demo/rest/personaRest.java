package com.example.demo.rest;

import java.net.URI;
import java.util.List;
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

import com.example.demo.model.persona;
import com.example.demo.service.PersonaService;

@RestController
@RequestMapping("/persona/")
public class personaRest {
	
	@Autowired
	private PersonaService personaService;
	
	@PostMapping
	private ResponseEntity<persona> save(@RequestBody persona persona){
		persona p = personaService.create(persona);
		
		try {
			return ResponseEntity.created(new URI("/persona" + p.getId())).body(p);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping
	private ResponseEntity<List<persona>> getAll(){

		return ResponseEntity.ok(personaService.getAllPersona());
		
	}
	
	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<persona>> getById(@PathVariable("id") Long id){

		return ResponseEntity.ok(personaService.findById(id));
		
	}
	

}

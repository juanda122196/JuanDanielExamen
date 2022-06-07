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

import com.example.demo.model.ReaccionModel;
import com.example.demo.service.ReaccionService;


@RestController
@RequestMapping("/reaccion")
public class reaccionRest {
	
	@Autowired
	private ReaccionService reaccionService;
	
	@PostMapping
	private ResponseEntity<ReaccionModel> save(@RequestBody ReaccionModel c ){
		ReaccionModel reaccion = reaccionService.create(c);
		
		try {
			return ResponseEntity.created(new URI("/reaccion" + reaccion.getIdReaccion())).body(reaccion);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping(value = "{id}")
	private ResponseEntity<Optional<ReaccionModel>> getById(@PathVariable("id") Long id){

		return ResponseEntity.ok(reaccionService.findById(id));
		
	}

}

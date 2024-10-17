package com.examen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import com.examen.entity.Grado;
import com.examen.service.GradoService;

@RestController
@RequestMapping("/api/grado")
public class GradoController {
	@Autowired
	private GradoService gradoService;
	
	@GetMapping
	public ResponseEntity<List<Grado>> readAll(){
		try {
			List<Grado> libros = gradoService.readAll();
			if(libros.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(libros, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Grado> crear(@Valid @RequestBody Grado cat){
		try {
			Grado c = gradoService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Grado> getLibroId(@PathVariable("id") Long id){
		try {
			Grado c = gradoService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Grado> delLibro(@PathVariable("id") Long id){
		try {
			gradoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateLibro(@PathVariable("id") Long id, @Valid @RequestBody Grado cat){

			Optional<Grado> c = gradoService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(gradoService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}

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

import com.examen.entity.Matricula;
import com.examen.service.MatriculaService;

@RestController
@RequestMapping("/api/matricula")
public class MatriculaController {
	@Autowired
	private MatriculaService matriculaService;
	
	@GetMapping
	public ResponseEntity<List<Matricula>> readAll(){
		try {
			List<Matricula> matriculas = matriculaService.readAll();
			if(matriculas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(matriculas, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Matricula> crear(@Valid @RequestBody Matricula cat){
		try {
			Matricula c = matriculaService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Matricula> getLibroId(@PathVariable("id") Long id){
		try {
			Matricula c = matriculaService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Matricula> delLibro(@PathVariable("id") Long id){
		try {
			matriculaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateLibro(@PathVariable("id") Long id, @Valid @RequestBody Matricula cat){

			Optional<Matricula> c = matriculaService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(matriculaService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}


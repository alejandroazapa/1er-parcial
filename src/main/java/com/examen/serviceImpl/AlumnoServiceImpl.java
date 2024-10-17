package com.examen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.Alumno;
import com.examen.repository.AlumnoRepository;
import com.examen.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	
	@Override
	public Alumno create(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(a);
	}

	@Override
	public Alumno update(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		alumnoRepository.deleteById(id);

	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

}

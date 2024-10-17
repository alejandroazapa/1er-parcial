package com.examen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.Matricula;
import com.examen.repository.MatriculaRepository;
import com.examen.service.MatriculaService;

@Service
public class MatriculaServiceImpl implements MatriculaService{
	@Autowired
	private MatriculaRepository MatriculaRepository;
	
	
	@Override
	public Matricula create(Matricula a) {
		// TODO Auto-generated method stub
		return MatriculaRepository.save(a);
	}

	@Override
	public Matricula update(Matricula a) {
		// TODO Auto-generated method stub
		return MatriculaRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		MatriculaRepository.deleteById(id);

	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return MatriculaRepository.findById(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return MatriculaRepository.findAll();
	}

}


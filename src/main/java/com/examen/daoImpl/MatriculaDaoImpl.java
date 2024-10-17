package com.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen.dao.MatriculaDAO;
import com.examen.entity.Matricula;
import com.examen.repository.MatriculaRepository;
@Component
public class MatriculaDaoImpl implements MatriculaDAO{

	@Autowired
	private MatriculaRepository repository;
	
	@Override
	public Matricula create(Matricula a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Matricula update(Matricula a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Matricula> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Matricula> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}

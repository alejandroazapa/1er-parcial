package com.examen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.Grado;
import com.examen.repository.GradoRepository;
import com.examen.service.GradoService;
@Service
public class GradoServiceImpl implements GradoService{
	@Autowired
	private GradoRepository GradoRepository;
	
	
	@Override
	public Grado create(Grado a) {
		// TODO Auto-generated method stub
		return GradoRepository.save(a);
	}

	@Override
	public Grado update(Grado a) {
		// TODO Auto-generated method stub
		return GradoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		GradoRepository.deleteById(id);

	}

	@Override
	public Optional<Grado> read(Long id) {
		// TODO Auto-generated method stub
		return GradoRepository.findById(id);
	}

	@Override
	public List<Grado> readAll() {
		// TODO Auto-generated method stub
		return GradoRepository.findAll();
	}

}


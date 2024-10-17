package com.examen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.Empleado;
import com.examen.repository.EmpleadoRepository;
import com.examen.service.EmpleadoService;
@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	@Autowired
	private EmpleadoRepository EmpleadoRepository;
	
	
	@Override
	public Empleado create(Empleado a) {
		// TODO Auto-generated method stub
		return EmpleadoRepository.save(a);
	}

	@Override
	public Empleado update(Empleado a) {
		// TODO Auto-generated method stub
		return EmpleadoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		EmpleadoRepository.deleteById(id);

	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return EmpleadoRepository.findById(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return EmpleadoRepository.findAll();
	}

}


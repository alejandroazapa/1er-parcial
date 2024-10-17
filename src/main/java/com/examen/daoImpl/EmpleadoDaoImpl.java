package com.examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examen.dao.EmpleadoDAO;
import com.examen.entity.Empleado;
import com.examen.repository.EmpleadoRepository;
@Component
public class EmpleadoDaoImpl implements EmpleadoDAO{

	@Autowired
	private EmpleadoRepository repository;
	
	@Override
	public Empleado create(Empleado a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Empleado update(Empleado a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}

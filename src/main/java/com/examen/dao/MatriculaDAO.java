package com.examen.dao;

import java.util.List;
import java.util.Optional;

import com.examen.entity.Matricula;

public interface MatriculaDAO {

	Matricula create(Matricula a);
	Matricula update(Matricula a);
	void delete(Long id);
	Optional<Matricula> read(Long id);
	List<Matricula> readAll();
}

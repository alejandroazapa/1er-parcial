package com.examen.dao;

import java.util.List;
import java.util.Optional;

import com.examen.entity.Grado;

public interface GradoDAO {

	Grado create(Grado a);
	Grado update(Grado a);
	void delete(Long id);
	Optional<Grado> read(Long id);
	List<Grado> readAll();
}
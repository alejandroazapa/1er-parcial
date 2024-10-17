package com.examen.entity;

import java.math.BigInteger;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "matriculas")
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "horas")
	private BigInteger horas;
	
	@Column(name = "nivel")
	private String nivel;
	
	@Column(name = "fecha_mat")	
	@Temporal(TemporalType.DATE) 
	private Date fecha_mat;
	
	@ManyToOne
	@JoinColumn(name = "empleado_id", nullable = false)
	private Empleado empleado;
	
	@ManyToOne
	@JoinColumn(name = "pelicula_id", nullable = false)
	private Alumno alumno;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Grado grado;
}

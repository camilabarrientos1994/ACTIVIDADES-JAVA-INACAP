package com.example.registro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id
	@Column(name="run")
	private String rut;
	
	@Column(name="name",length=50)
	private String nombre;
	
	@Column(name = "age")
	private int edad;
}

package com.keepcoding.intro.app.service;

import java.util.List;

import com.keepcoding.intro.app.entity.Persona;

/*
 * Aquí definimos los métodos que vamos a "obligar" a tener, por eso todos serán métodos abstractos
 * */
public interface PersonaService {

	// Métodos Abstractos
	// Método que devuelva listado de objetos persona
	List<Persona> listaPersona();

	// Método que inserta
	void insertaPersona();

}

package com.keepcoding.intro.app.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.intro.app.entity.Persona;
import com.keepcoding.intro.app.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	Persona persona;
	// Declaro una lista de persona
	List<Persona> lista = new ArrayList<>();

	@Override
	public List<Persona> listaPersona() {

		if (lista.size() == 0 || lista.size() == 1) {
			Persona objPersona = new Persona("Carlos", "Perez", "12341234t", "cperez@gmail.com", 123412341);
			Persona objPersona2 = new Persona("Maria", "Ortiz", "12341234t", "cperez@gmail.com", 123412341);
			Persona objPersona3 = new Persona("Pepe", "Ramirez", "12341234t", "cperez@gmail.com", 123412341);
			lista.add(objPersona);
			lista.add(objPersona2);
			lista.add(objPersona3);
		}
		return lista;
	}

	@Override
	public void insertaPersona() {
		// TODO Auto-generated method stub
		
		persona.setNombre("Luisa");
		persona.setApellido("Lopez");
		persona.setDni("1234234R");
		persona.setEmail("asdñflkj@añslkdf");
		persona.setTelefono(123412344);
		lista.add(persona);

	}

}

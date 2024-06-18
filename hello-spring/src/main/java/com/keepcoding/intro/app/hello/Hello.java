package com.keepcoding.intro.app.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keepcoding.intro.app.entity.Persona;

@RestController
public class Hello {
	
	@Autowired
	// @Autowired sirve para poder inyectar instancias de una clase que ha sido preparada con el decorador @Component
	Persona persona;

	@GetMapping("/saludar")
	// @GetMapping, es un decorador, que permite indicar qué método será llamado, lleva la barra /saludar, porque así se enlaca en las url del navegador
	public List<Persona> saludar() {
//		Persona objPersona = new Persona("Carlos", "Perez", "12341234t","cperez@gmail.com",123412341);
//		Persona objPersona2 = new Persona("Carlos", "Perez", "12341234t","cperez@gmail.com",123412341);
//		Persona objPersona3 = new Persona("Carlos", "Perez", "12341234t","cperez@gmail.com",123412341);
		List listaPersona=new ArrayList<>();
		persona.setNombre("Ramon");
		persona.setApellido("Perez");
		persona.setDni("00000000T");
		persona.setEmail("asdf@asdf.com");
		persona.setTelefono(987765467);
		listaPersona.add(persona);
//		listaPersona.add(objPersona);
//		listaPersona.add(objPersona2);
//		listaPersona.add(objPersona3);
		
		
		return listaPersona;
	}
}

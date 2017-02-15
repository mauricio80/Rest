package com.tata.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tata.entidades.Asociado;

@Controller
@RequestMapping(value = "/pagina")
public class PrimerControllador {

	@RequestMapping(method = RequestMethod.GET, value = "/{cedula}/{nombre}")
	public @ResponseBody String primerRecursoRest(@PathVariable String cedula, @PathVariable String nombre) {

		return "Fui invocado a través de REST, llamado con la cedula " + cedula;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/guardar")
	public void guardarData(@RequestBody Asociado asociado) {
		System.out.println("Estoy guardando al asociado " + asociado);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/obtenerAsociado")
	public @ResponseBody List<Asociado> metodoConObjectos() {
		Asociado asociado = new Asociado();
		asociado.setNombre("Vanessa");
		asociado.setNumEmpleado(1234567);

		Asociado asociado2 = new Asociado();
		asociado2.setNombre("Guille");
		asociado2.setNumEmpleado(87654);

		List<Asociado> asociados = new ArrayList<>();
		asociados.add(asociado);
		asociados.add(asociado2);
		return asociados;
	}
}

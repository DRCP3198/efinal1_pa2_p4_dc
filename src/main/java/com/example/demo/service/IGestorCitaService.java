package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.demo.modelo.CitaMedica;

public interface IGestorCitaService {
	
	//funcionalidad 3
	public void agendarCita(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita, String cedulaDoctor,
			String cedulaPaciente);
	//funcionalidad 4
	public void actualizar(String numeroCita,String diagnostico,String receta,LocalDateTime fechaProximaCita);

}

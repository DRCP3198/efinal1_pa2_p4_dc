package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CitaMedica;
import com.example.demo.modelo.Doctor;
import com.example.demo.modelo.Paciente;
import com.example.demo.repository.ICitaMedicaRepo;
import com.example.demo.repository.IDoctorRepository;

@Service

public class GestoCitaServiceImpl implements IGestorCitaService{
	
	@Autowired
	private IDoctorRepository iDoctorRepo;
	
	@Autowired
	private IPacienteService iPacienteRepo;
	
	@Autowired
	private ICitaMedicaRepo icitaMedicaRepo;
	



	@Override
	public void agendarCita(String numeroCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setLugarCita(lugarCita);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setValorCita(valorCita);
		citaMedica.setNumeroCita(numeroCita);
		
		Doctor doctor = this.iDoctorRepo.buscarCedula(cedulaDoctor);
		Paciente paciente= this.iPacienteRepo.encontrarCedula(cedulaPaciente);
		citaMedica.setDoctor(doctor);
		citaMedica.setPaciente(paciente);
		this.icitaMedicaRepo.insertar(citaMedica);
		
	}

	@Override
	public void actualizar(String numeroCita, String diagnostico, String receta, LocalDateTime fechaProximaCita) {
		// TODO Auto-generated method stub
		
		CitaMedica cita = this.icitaMedicaRepo.buscar(numeroCita);
		cita.setDiagnostico(diagnostico);
		cita.setReceta(receta);
		cita.setFechaProximaCita(fechaProximaCita);
		this.icitaMedicaRepo.actualizar(cita);

	}

}

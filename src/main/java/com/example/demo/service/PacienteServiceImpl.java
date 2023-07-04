package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Paciente;
import com.example.demo.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Override
	public void agregar(Paciente paciente) {
		this.iPacienteRepository.ingresar(paciente);
		
	}

	@Override
	public void modificar(Paciente paciente) {
		this.iPacienteRepository.actualizar(paciente);
		
	}

	@Override
	public Paciente encontrarCedula(String cedula) {
		
		return this.iPacienteRepository.buscarCedula(cedula);
	}

}

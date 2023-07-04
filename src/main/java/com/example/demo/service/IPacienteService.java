package com.example.demo.service;

import com.example.demo.modelo.Paciente;

public interface IPacienteService {
	
	public void agregar(Paciente paciente);
	public void modificar(Paciente paciente);
	public Paciente encontrarCedula(String cedula);

}

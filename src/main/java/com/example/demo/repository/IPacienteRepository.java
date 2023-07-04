package com.example.demo.repository;

import com.example.demo.modelo.Paciente;

public interface IPacienteRepository {
	
	public void ingresar(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente buscarCedula(String cedula);

}

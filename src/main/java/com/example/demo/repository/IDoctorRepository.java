package com.example.demo.repository;

import com.example.demo.modelo.Doctor;

public interface IDoctorRepository {
	
	public void insertar(Doctor doctor);
	public void actualizar(Doctor  doctor);
	public Doctor buscarCedula(String cedula);
	public void eliminar(String cedula);

}

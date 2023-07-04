package com.example.demo.service;

import com.example.demo.modelo.Doctor;

public interface IDoctorService {
	
	public void agregar(Doctor doctor);
	public void modificar(Doctor  doctor);
	public Doctor encontrarPorCedula(String cedula);
	public void borrar(String cedula);


}

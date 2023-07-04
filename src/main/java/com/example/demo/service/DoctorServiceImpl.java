package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Doctor;
import com.example.demo.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService{
	
	@Autowired
	private IDoctorRepository iDoctorRepository;

	@Override
	public void agregar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.iDoctorRepository.insertar(doctor);
	}

	@Override
	public void modificar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.iDoctorRepository.actualizar(doctor);
	}

	@Override
	public Doctor encontrarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iDoctorRepository.buscarCedula(cedula);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.iDoctorRepository.eliminar(cedula);
	}
	

}

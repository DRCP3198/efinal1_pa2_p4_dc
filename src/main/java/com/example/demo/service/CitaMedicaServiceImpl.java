package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CitaMedica;
import com.example.demo.repository.ICitaMedicaRepo;


@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{

	@Autowired
	private ICitaMedicaRepo citaMedicaRepo;

	@Override
	public void agregar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepo.insertar(citaMedica);
	}
	
	

}

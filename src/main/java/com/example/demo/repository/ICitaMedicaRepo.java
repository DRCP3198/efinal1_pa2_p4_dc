package com.example.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.modelo.CitaMedica;


public interface ICitaMedicaRepo {
	
    public void insertar(CitaMedica citaMedica);
    public void actualizar(CitaMedica citaMedica);
    public CitaMedica buscar(String numeroCita);
    public void eliminar(String numeroCita);

}

package com.example.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public CitaMedica buscar(String numeroCita) {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedica> typedQuery = this.entityManager
				.createQuery("select e from CitaMedica e where e.numeroCita = :datoTurno ", CitaMedica.class);
		typedQuery.setParameter("datoTurno", numeroCita);
		return typedQuery.getSingleResult();
	}

	@Override
	public void eliminar(String numeroCita) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(numeroCita));
	}



}

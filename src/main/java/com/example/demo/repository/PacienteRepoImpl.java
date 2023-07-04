package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}


	@Override
	public Paciente buscarCedula(String cedula) {
		// TODO Auto-generated method stub

		TypedQuery<Paciente> query = this.entityManager
				.createQuery("select p from Paciente p where p.cedula =:datoCedula", Paciente.class);
		query.setParameter("datoCedula", cedula);
		return query.getSingleResult();
	}

	

}

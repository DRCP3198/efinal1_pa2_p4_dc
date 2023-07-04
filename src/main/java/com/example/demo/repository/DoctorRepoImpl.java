package com.example.demo.repository;


import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DoctorRepoImpl implements IDoctorRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
	}

	@Override
	public Doctor buscarCedula(String cedula) {
		// TODO Auto-generated method stub

		TypedQuery<Doctor> typedQuery = this.entityManager
				.createQuery("select d from Doctor d where d.cedula =:datoCedula", Doctor.class);
		typedQuery.setParameter("datoCedula", cedula);
		return typedQuery.getSingleResult();
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
      this.entityManager.remove(this.buscarCedula(cedula));
	}

}

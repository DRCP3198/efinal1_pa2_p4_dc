package com.example.demo.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name ="paciente")
@Entity
public class Paciente {
	
	@Id
	@SequenceGenerator(name = "seq_paci",sequenceName = "seq_paci",allocationSize = 1)
	@GeneratedValue(generator = "seq_paci", strategy = GenerationType.SEQUENCE)
	@Column(name = "paci_id")
	private Integer id;
	
	@Column(name = "paci_cedula")
	private String cedula;
	
	@Column(name = "paci_nombre")
	private String nombre;
	
	@Column(name = "paci_apellido")
	private String apellido;
	
	@Column(name = "paci_fecha_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@Column(name = "paci_codigo_seguro")
	private String codSeguro;
	
	@Column(name = "paci_estatura")
	private String estatura;
	
	@Column(name = "paci_peso")
	private String peso;
	
	@Column(name = "paci_genero")
	private String genero;
	
	
	@OneToMany(mappedBy = "paciente")
	private List<CitaMedica>citaMedicas;

	
	//SET y GET

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getCodIess() {
		return codSeguro;
	}


	public void setCodIess(String codSeguro) {
		this.codSeguro = codSeguro;
	}


	public String getEstatura() {
		return estatura;
	}


	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public List<CitaMedica> getCitaMedicas() {
		return citaMedicas;
	}


	public void setCitaMedicas(List<CitaMedica> citaMedicas) {
		this.citaMedicas = citaMedicas;
	}


	@Override
	public String toString() {
		return "Paciente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", codSeguro=" + codSeguro+ ", estatura=" + estatura + ", peso="
				+ peso + ", genero=" + genero + ", citaMedicas=" + citaMedicas + "]";
	}
	
	
	

}

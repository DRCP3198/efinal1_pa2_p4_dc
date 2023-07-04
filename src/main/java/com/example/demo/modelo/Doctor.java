package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
	@Id
	@SequenceGenerator(name = "seq_doc",sequenceName = "seq_doc",allocationSize = 1)
	@GeneratedValue(generator = "seq_doc", strategy = GenerationType.SEQUENCE)
	@Column(name = "doc_id")
	private Integer id;
	
	@Column(name = "doc_cedula")
	private String cedula;
	
	@Column(name = "doc_nombre")
	private String nombre;
	
	@Column(name = "doc_apellido")
	private String apellido;
	
	@Column(name = "doc_nacimiento")
	private LocalDateTime fechaNacimiento;
	
	@Column(name = "doc_numero_consultorio")
	private String numeroConsultorio;
	
	@Column(name = "doc_cod_senecyt")
	private String codSenecyt;
	
	@Column(name = "doc_genero")
	private String genero;
	
	@OneToMany(mappedBy ="doctor")
	private List<CitaMedica> citas;

	
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

	public String getNumeroConsultorio() {
		return numeroConsultorio;
	}

	public void setNumeroConsultorio(String numeroConsultorio) {
		this.numeroConsultorio = numeroConsultorio;
	}

	public String getCodSenecyt() {
		return codSenecyt;
	}

	public void setCodSenecyt(String codSenecyt) {
		this.codSenecyt = codSenecyt;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<CitaMedica> getCitas() {
		return citas;
	}

	public void setCitas(List<CitaMedica> citas) {
		this.citas = citas;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", numeroConsultorio=" + numeroConsultorio + ", codSenecyt="
				+ codSenecyt + ", genero=" + genero + ", citas=" + citas + "]";
	}



	

}

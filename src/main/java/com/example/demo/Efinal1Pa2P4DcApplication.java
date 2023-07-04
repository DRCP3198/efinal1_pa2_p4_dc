package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Doctor;
import com.example.demo.modelo.Paciente;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IGestorCitaService;
import com.example.demo.service.IPacienteService;

@SpringBootApplication
public class Efinal1Pa2P4DcApplication implements CommandLineRunner {
	
	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IGestorCitaService citaService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Doctor doctor = new Doctor();
		doctor.setApellido("Coloma");
		doctor.setNombre("Dillan");
		doctor.setCedula("1725247645");
		doctor.setGenero("Masculino");
		doctor.setCodSenecyt("1478");
		doctor.setFechaNacimiento(LocalDateTime.of(1989, 8, 31, 15, 25));
		doctor.setNumeroConsultorio("A25");
		
		//this.doctorService.agregar(doctor);
		
		Paciente paciente = new Paciente();
		paciente.setApellido("Amely");
		paciente.setNombre("Coloma");
		paciente.setCodIess("156");
		paciente.setEstatura("1.52 m");
		paciente.setPeso("44kg");
		paciente.setFechaNacimiento(LocalDateTime.of(2001, 10, 30, 23, 49));
		paciente.setGenero("Femenino");
		paciente.setCedula("1751457191");
	    //this.iPacienteService.agregar(paciente);
		
		//this.citaService.agendarCita("1212", LocalDateTime.now(), new BigDecimal(65), "Tumbaco", "1725247645", "1751457191");
		this.citaService.actualizar("1212", "epilepcia", "Leveracikam", LocalDateTime.of(2023, 8, 31, 15, 45));
	}

}

package com.rec.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Candidate implements Comparable<Candidate>{

	/* ======================= ATRIBUTOS ======================= */
	private LocalDate dateOfBirth;
	private LocalDateTime startDate;
	private String dni;
	private String name;
	private String surname;
	private ContractType ct;
	private boolean inProyect;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final int EDAD_MINIMA_PARA_TRABAJAR = 18;
	private static final int LONGITUD_DNI = 9;
	protected static final double SUBIDA_SUELDO_POR_ANYO_EXPERIENCIA = 1.05;		//Es 5%
	protected static final double PORCENTAJE_REDUCCION_SUELDO_PARCIAL = 0.66;		//Es 33%
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Candidate (LocalDate dateOfBirth, LocalDateTime startDate, String dni, 
			String name, String surname, ContractType ct, boolean inProyect) throws Exception {
		
		if ((dateOfBirth != null) 
				&& ((LocalDate.now().getYear() - dateOfBirth.getYear() >= EDAD_MINIMA_PARA_TRABAJAR) 
				&& (startDate != null) && (dni != null) && (!dni.trim().isBlank()) 
				&& (dni.length() == LONGITUD_DNI) && (Character.isAlphabetic(dni.charAt(8)) 
				&& (surname != null) && (!surname.trim().isBlank()) && (ct != null))
				&& (name != null) && (!name.trim().isBlank()))) {
			
			this.dateOfBirth = dateOfBirth;
			this.startDate = startDate;
			this.dni = dni;
			this.name = name;
			this.surname = surname;
			this.ct = ct;
			this.inProyect = inProyect;
		
		}else {
			throw new Exception ("Algún dato no es válido.");
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función computeGrossSalary () ------------ */
	public abstract double computeGrossSalary ();
	
	
	
	/* --------- Función calcularTiempoTrabajado () ---------- */
	public int calcularTiempoTrabajado () {
		return (LocalDateTime.now().getYear() - this.startDate.getYear());
	}

	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public LocalDateTime getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public ContractType getCt() {
		return ct;
	}


	public void setCt(ContractType ct) {
		this.ct = ct;
	}


	public boolean isInProyect() {
		return inProyect;
	}


	public void setInProyect(boolean inProyect) {
		this.inProyect = inProyect;
	}
	
	
		
	/* ===================== COMPARE TO() ====================== */
	@Override
	public int compareTo (Candidate c) {
		
		int resultado = 0;
		
		
		if (c == null) {
			resultado = -1;
			
		}else {
			resultado = this.startDate.compareTo(c.getStartDate());
		}
		
		
		return (resultado);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString () {
	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaNacimiento = this.getDateOfBirth().format(formatter);
        String fechaEntrada = this.getStartDate().format(formatter2);
        
        String estaEnProyecto = (this.inProyect == false)
        						? "No"
        						: "Sí";
        
        
		return String.format(" - Empleado %s \n"
						   + " - Fecha de nacimiento: %s \n"
						   + " - Empezó a trabajar el día: %s \n"
						   + " - DNI: %s \n"
						   + " - Nombre: %s \n"
						   + " - Apellido: %s \n"
						   + " - Tipo de contrato: %s \n"
						   + " - Trabaja en un proyecto: %s",
						   
						   this.getClass().getSimpleName(),
						   fechaNacimiento,
						   fechaEntrada,
						   this.dni,
						   this.name,
						   this.surname,
						   this.ct,
						   estaEnProyecto);
	}

}

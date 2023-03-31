package com.rec.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FullStackDeveloper extends Candidate implements Frontend, Backend {
	
	/* ===================== CONSTRUCTORES ===================== */
	public FullStackDeveloper (LocalDate dateOfBirth, LocalDateTime startDate, String dni, 
			String name, String surname, ContractType ct, boolean inProyect) throws Exception {
		
		super(dateOfBirth, startDate, dni, name, surname, ct, inProyect);
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función maintenanceCost () ------------ */
	@Override
	public double maintenanceCost() {
		return (BE_MAINTENANCE_COST);
	}

	
	
	/* ---- Función createWebAPIAndDBConnectionCost () ---- */
	@Override
	public double createWebAPIAndDBConnectionCost() {
		
		double coste = 0;
		
		
		if (getClass().getSimpleName().equalsIgnoreCase("WEBDESIGNER") 
				|| getClass().getSimpleName().equalsIgnoreCase("FULLSTACKDEVELOPER")) {
			
			coste += WEB_INTERFACE_DESIGN_COST;
		}
		
		
		if (getClass().getSimpleName().equalsIgnoreCase("BACKENDPROGRAMMER") 
				|| getClass().getSimpleName().equalsIgnoreCase("FULLSTACKDEVELOPER")) {
			
			coste += WEB_API_DB_COST;
		}
			
			
		return (coste);
	}

	
	
	/* -------- Función computeFEMaintenanceCost () ------- */
	@Override
	public double computeFEMaintenanceCost() {
		return (FE_MAINTENANCE_COST);
	}

	
	
	/* ----------- Función computeGrossSalary () ---------- */
	@Override
	public double computeGrossSalary() {
		
		double total = computeFEMaintenanceCost() + createWebAPIAndDBConnectionCost() 
					 + maintenanceCost();
		
		
		//Calcular subida de sueldo por años de experiencia
		for (int i = calcularTiempoTrabajado(); i >= 0; i--) {
			total *= Candidate.SUBIDA_SUELDO_POR_ANYO_EXPERIENCIA;
		}
				
				
		//Aplicar la reduccion si el contrato es PARTIAL
		if (getCt().equals(ContractType.PARTIAL)) {
			total *= PORCENTAJE_REDUCCION_SUELDO_PARCIAL;
		}
				
				
		return (total);
	}

	
}

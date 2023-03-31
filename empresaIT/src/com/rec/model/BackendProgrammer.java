package com.rec.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BackendProgrammer extends Candidate implements Backend {

	/* ===================== CONSTRUCTORES ===================== */
	public BackendProgrammer (LocalDate dateOfBirth, LocalDateTime startDate, String dni, 
			String name, String surname, ContractType ct, boolean inProyect) throws Exception {
		
		super(dateOfBirth, startDate, dni, name, surname, ct, inProyect);
	}

	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------ Función createWebAPIAndDBConnectionCost () ------ */
	@Override
	public double createWebAPIAndDBConnectionCost() {
		return (WEB_API_DB_COST);
	}
	
	
	
	/* --------- Función maintenanceCost () ---------- */
	@Override
	public double maintenanceCost() {
		return (BE_MAINTENANCE_COST);
	}
	
	
	
	/* ------------- Función computeGrossSalary () ------------ */
	@Override
	public double computeGrossSalary() {
		
		double total = maintenanceCost() + createWebAPIAndDBConnectionCost();

		
		//Calcular subida de sueldo por años de experiencia
		for (int i = calcularTiempoTrabajado(); i >= 0; i--) {
			total *= SUBIDA_SUELDO_POR_ANYO_EXPERIENCIA;
		}
				
				
		//Aplicar la reduccion si el contrato es PARTIAL
		if (getCt().equals(ContractType.PARTIAL)) {
			total *= PORCENTAJE_REDUCCION_SUELDO_PARCIAL;
		}
	
	
		return (total);	
	}



	



	

}

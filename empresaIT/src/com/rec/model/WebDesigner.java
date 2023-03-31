package com.rec.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WebDesigner extends Candidate implements Frontend {

	/* ===================== CONSTRUCTORES ===================== */
	public WebDesigner (LocalDate dateOfBirth, LocalDateTime startDate, String dni, 
			String name, String surname, ContractType ct, boolean inProyect) throws Exception {
		
		super(dateOfBirth, startDate, dni, name, surname, ct, inProyect);
	}

	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------ Función createWebAPIAndDBConnectionCost () ------ */
	@Override
	public double createWebAPIAndDBConnectionCost() {
		return (WEB_INTERFACE_DESIGN_COST);
	}
	
	
	
	/* --------- Función computeFEMaintenanceCost () ---------- */
	@Override
	public double computeFEMaintenanceCost() {
		return (FE_MAINTENANCE_COST);
	}
	
	
	
	/* ------------- Función computeGrossSalary () ------------ */
	@Override
	public double computeGrossSalary() {
		
		double total = computeFEMaintenanceCost() + createWebAPIAndDBConnectionCost();

		
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

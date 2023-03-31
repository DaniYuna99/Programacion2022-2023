package com.rec.model;

public interface Frontend {
	
	/* ======================= ATRIBUTOS ======================= */
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	public static final double WEB_INTERFACE_DESIGN_COST = 2100;
	public static final double FE_MAINTENANCE_COST = 700.00;
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------- Función createWebAPIAndDBConnectionCost() ------ */
	public double createWebAPIAndDBConnectionCost();
		

	/* ---------- Función computeFEMaintenanceCost() ---------- */
	public double computeFEMaintenanceCost();

}

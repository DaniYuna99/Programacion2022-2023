package com.rec.model;

public interface Backend {
	
	/* ======================= ATRIBUTOS ======================= */
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	public static final double WEB_API_DB_COST = 2200;
	public static final double BE_MAINTENANCE_COST = 500.00;
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------- Función createWebAPIAndDBConnectionCost () ------ */
	public double createWebAPIAndDBConnectionCost ();

	
	/* --------------- Función maintenanceCost () -------------- */
	public double maintenanceCost ();

	
	
}

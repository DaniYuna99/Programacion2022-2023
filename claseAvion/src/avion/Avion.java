package avion;

public class Avion {

	/* ================== ATRIBUTOS ================== */
	private String idAvion;
	private int capacidad;
	private int numVuelos;
	private double kmVolados;
	private String compannia;
	
	
	
	/* ================ CONSTRUCTORES ================ */
	public Avion () {}
	
	public Avion (String idAvion, int capacidad) {
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		this.numVuelos = 0;
		this.kmVolados = 0.0;
		this.compannia = "Sin compañía";
	}
	
	
	public Avion (String idAvion, int capacidad, String compannia) {
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		this.numVuelos = 0;
		this.kmVolados = 0.0;
		this.compannia = compannia;
	}


	
	/* =================== MÉTODOS =================== */
	
	//APARTADO A: ASIGNARVUELO()
	public boolean asignarVuelo (int numAsientos, double kmVolados) {
		
		boolean seHaAsignado = false;
		
		if ((this.capacidad >= numAsientos)
				&& (numAsientos > 0) && (kmVolados > 0)) {
			this.kmVolados += kmVolados;
			this.numVuelos++;
			seHaAsignado = true;
		}
		
		
		return (seHaAsignado);
	}
	
	
	//APARTADO B: OBTENER EL NÚMERO DE VUELOS
	public int obtenerNumVuelos () {
		return (getNumVuelos());
	}
	
	
	//APARTADO C: OBTENER EL NÚMERO DE KILÓMETROS
	public double numKmVolados () {
		return (getKmVolados());
	}
	
	
	//APARTADO D: OBTENER LA MEDIA DE KILÓMETROS POR VUELO
	public double obtenerMediaKmVolados () {
		return (this.numVuelos != 0
				? (this.kmVolados / this.numVuelos)
				: 0.0);
	}
	
	
	//APARTADO E: CAMBIO DE COMPAÑIA
	public boolean cambiarCompannia(String nuevaCompannia) {
		boolean seHaCambiado = false;
		
		if ((nuevaCompannia != null) && (!nuevaCompannia.isEmpty())) {
			setCompannia(nuevaCompannia);
			seHaCambiado = true;
		}
		
	
		return (seHaCambiado);
	}
	
	
	//APARTADO F: MOSTRAR INFORMACIÓN DE AVIÓN
	public void mostrarInformacionAvion () {
		
		System.out.println("Avión con id: " + "'" + (this.idAvion) + "'" + " de la compañía " + "'" 
						  + (this.compannia) + "', con capacidad máxima de " + getCapacidad() 
						  + " asientos, ha realizado " + this.numVuelos + " vuelo(s), con un total de " + (this.kmVolados) 
						  + " km y una media de " + obtenerMediaKmVolados() + " km por vuelo.");
	}
	
	
	
	/* =============== GETTERS/SETTERS =============== */
	public String getIdAvion() {
		return idAvion;
	}
	
	
	public int getCapacidad() {
		return capacidad;
	}
	
	
	public int getNumVuelos() {
		return numVuelos;
	}
	
	
	public double getKmVolados() {
		return kmVolados;
	}


	public String getCompannia() {
		return compannia;
	}
	
	
	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}

}

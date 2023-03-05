package ej4_futbol;

public class Partido {

	/* ======================= ATRIBUTOS ======================= */
	private int jornada;
	private String equipoLocal;
	private String equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	private String estadio;
	private String ciudad;
	private char resultadoQuiniela = 'O';
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Partido(int jornada, String equipoLocal, String equipoVisitante, 
			String estadio, String ciudad) throws Exception {
		
		if ((jornada >= 1) && (jornada <= 38)
				&& (!equipoLocal.equals(equipoVisitante))) {
			this.jornada = jornada;
			this.equipoLocal = equipoLocal;
			this.equipoVisitante = equipoVisitante;
			this.estadio = estadio;
			this.ciudad = ciudad;
			
		}else {
			throw new Exception ("Algún o algunos campos son inválidos.");
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ---------- Función ponerResultado () ---------- */
	public boolean ponerResultado (String resultadoPartido) {
		
		boolean isAssigned = false;
		char resultadoLocal = resultadoPartido.charAt(0);
		char resultadoVisitante = resultadoPartido.charAt(2);
		
		
		if (Character.isDigit(resultadoLocal) && Character.isDigit(resultadoVisitante)) {
			
			this.golesLocal = Character.getNumericValue(resultadoLocal);
			this.golesVisitante = Character.getNumericValue(resultadoVisitante);
			
			if (resultadoLocal > resultadoVisitante) {
				resultadoQuiniela = '1';
				
			}else if (resultadoLocal == resultadoVisitante) {
				resultadoQuiniela = 'X';
			
			}else {
				resultadoQuiniela = '2';
			}
			
			isAssigned = true;
		}
		
		
		return (isAssigned);
	}
	
	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public int getJornada() {
		return jornada;
	}



	public void setJornada(int jornada) {
		this.jornada = jornada;
	}



	public String getEquipoLocal() {
		return equipoLocal;
	}



	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}



	public String getEquipoVisitante() {
		return equipoVisitante;
	}



	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}



	public int getGolesLocal() {
		return golesLocal;
	}



	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}



	public int getGolesVisitante() {
		return golesVisitante;
	}



	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}



	public char getResultadoQuiniela() {
		return resultadoQuiniela;
	}



	public void setResultadoQuiniela(char resultadoQuiniela) {
		this.resultadoQuiniela = resultadoQuiniela;
	}
	
	
		
	/* ======================= TOSTRING() ====================== */
	public String getEstadio() {
		return estadio;
	}



	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}



	public String getCiudad() {
		return ciudad;
	}



	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}



	@Override
	public String toString() {
		
		String informacion = "";
		
		if (resultadoQuiniela == 'O') {
			informacion = "Partido entre equipo local " + equipoLocal 
					     + " y equipo visitante " + equipoVisitante 
					     + " todavía no se ha jugado.";
			
		}else {
			informacion = "Partido entre equipo local " + equipoLocal 
						 + " y equipo visitante " + equipoVisitante 
						 + " jugado en el estadio " + estadio 
						 + " de la ciudad " + ciudad 
						 + " ha finalizado con " + golesLocal
						 + " goles de equipo local y " + golesVisitante
						 + " goles de equipo visitante."
						 + " Resultado quiniela = " + resultadoQuiniela + ".";
		}
		
		
		return (informacion);
	}
}

package ej4;

public class Fecha {

	/* ======================= ATRIBUTOS ======================= */
	private int dia;
	private int mes;
	private int anyo;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Fecha(int dia, int mes, int anyo) throws Exception {
		
		if (esFechaValida(dia, mes, anyo) == true) {
			this.dia = dia;
			this.mes = mes;
			this.anyo = anyo;
			
		}else {
			throw new Exception("La fecha no es válida.");
		}
		
	}
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ============== Función diaDeLaSemana () =============== */
	/**
	 * Este método devuelve el día de la semana 
	 * que fue la fecha que le pases (aproximadamente)<br><br>
	 * 
	 * Si devuelve 0, fue Domingo, 1 si fue Lunes,... hasta 6.
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public int diaDeLaSemana (int year, int month, int day) {
		int a = (14 - month) / 12;
		int y = year - a;
		int m = month + 12 * a - 2;
		
		return (day + y + (y / 4) - (y / 100) + (y / 400) + (31 * m) / 12) % 7;
	}
	
	
	
	/* ============== Función esFechaValida () =============== */
	public boolean esFechaValida (int dia, int mes, int anyo) {
		
		boolean esValida = false;
		
		
		if ( ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) 
				|| (mes == 8) || (mes == 10) || (mes == 12) 
				&& ((dia >= 1) && (dia <= 31)))
					
				|| ((mes == 2) && (esAnyoBisiesto(anyo) == false) 
				&& (dia >= 1) && (dia <= 28))
				|| ((mes == 2) && (esAnyoBisiesto(anyo) == true) 
				&& ((dia >= 1) && (dia <= 29)))
			
				|| ((mes == 4)) || (mes == 6) || (mes == 9) || (mes == 11) 
				&& ((dia >= 1) && (dia <= 30))
		
				&& ((mes >= 1) && (mes <= 12))) {
			
			esValida = true;
		}
		
		
		return (esValida);
	}
	
	/*Enero tiene 31 días, febrero 29 días, marzo 31, 
	 * abril 30, mayo 31, junio 30, julio 31, agosto 31, 
	 * septiembre 30, octubre 31, noviembre 30 y diciembre 31 días*/
	
	
	/* ============== Función esAnyoBisiesto () =============== */
	public boolean esAnyoBisiesto (int anyo) {
		
		boolean esBisiesto = false;
		
		if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))) {
			esBisiesto = true;
		}
		
		
		return (esBisiesto);
	}

	
	
	/* ============== Función pasarAFormatoLargo () =============== */
	public String pasarAFormatoLargo() {
		
		StringBuilder fechaLarga = new StringBuilder("La fecha en formato largo es ");
		String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miércoles", 
								"Jueves", "Viernes", "Sábado"};
		
		String[] mesesDelAnyo = {"Enero", "Febrero", "Marzo", "Abril", 
								"Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", 
								"Noviembre", "Diciembre"};
		
		fechaLarga.append("'" + diasSemana[diaDeLaSemana(this.anyo, this.mes, this.dia)]);
		fechaLarga.append(" " + String.valueOf(dia) + " de ");
		fechaLarga.append(mesesDelAnyo[this.mes - 1]);
		fechaLarga.append(" de " + this.anyo + "'.");
		
	
		return (fechaLarga.toString());
	}

	
	/* ==================== GETTERS/SETTERS ==================== */
	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAnyo() {
		return anyo;
	}


	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	
	
	/* ======================= EQUALS() ======================== */
	
	/* ======================= TOSTRING() ====================== */
	
	/* //////// CONSTANTES \\\\\\\\ */
	
}

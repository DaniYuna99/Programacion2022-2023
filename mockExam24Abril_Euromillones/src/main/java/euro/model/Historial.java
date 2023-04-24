package main.java.euro.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {

	/* ======================= ATRIBUTOS ======================= */
	private Map<LocalDate, Combinacion> sorteos;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Historial () {
		this.sorteos = new HashMap<LocalDate, Combinacion>();
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función addSorteo [SOBRECARGADO] () ------------ */
	
	//1er método con LocalDate para la fecha
	public boolean addSorteo (LocalDate fecha, Combinacion combinacion) 
			throws HistorialException {
		
		boolean isAdded = false;
		
		
		if ((sorteos.containsKey(fecha))) {
			throw new HistorialException ("Ya hay un sorteo asignado a esa fecha.");
		
		}else {
			sorteos.put(fecha, combinacion);
			isAdded = true;
		}
		
		
		return (isAdded);
	}
	
	
	
	//2º método con 3 int para el dia, mes y año para la fecha
	public boolean addSorteo (int dia, int mes, int anyo, 
			Combinacion combinacion) throws HistorialException {
		
		boolean isAdded = false;
		
		/* 31 días: enero, marzo, mayo, julio, agosto, octubre y diciembre. 
		 * 30 días o menos: abril, junio, septiembre, noviembre, 
		 * 28 o 29 días: febrero*/
		
		if ((dia >= 1 && dia <= 31) && ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)
				|| (dia >= 1 && dia <= 30) && (mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)
				|| (dia >= 1 && dia <= 29) && (esAnyoBisiesto(anyo) == true) && (mes == 2)
				|| (dia >= 1 && dia <= 28) && (esAnyoBisiesto(anyo) == false))) {
			
			LocalDate fecha = LocalDate.of(anyo, mes, dia);

			
			if ((sorteos.containsKey(fecha))) {
				throw new HistorialException ("Ya hay un sorteo asignado a esa fecha.");
				
			}else {
				sorteos.put(fecha, combinacion);
				isAdded = true;
			}
			
			
		}else {
			throw new HistorialException ("La fecha no es válida.");
		}
		
		
		return (isAdded);
	}
	
	
	
	/* ---------------- Función esAnyoBisiesto () ---------------- */
	public boolean esAnyoBisiesto (int anyo) {
		return ((anyo % 4 == 0) && (anyo % 100 != 0) || (anyo % 400 == 0));
	}
	
	
	
	/* ------------ Función actualizarSorteo () [SOBRECARGADO] ------------ */
	
	//1er método con LocalDate para la fecha
	public boolean actualizarSorteo (LocalDate fecha, Combinacion combinacion)
			throws HistorialException {
		
		boolean isUpdated = false;
		
		
		if (sorteos.containsKey(fecha)) {
			sorteos.put(fecha, combinacion);
			isUpdated = true;
		
		}else {
			throw new HistorialException ("No hay ningún sorteo en esta fecha, por lo que no se puede actualizar.");
		}
		
		
		return (isUpdated);
	}
	
	
	//2º método con 3 int para el dia, mes y año para la fecha
	public boolean actualizarSorteo (int dia, int mes, int anyo, 
			Combinacion combinacion) throws HistorialException {
		
		boolean isUpdated = false;
		
		
		if ((dia >= 1 && dia <= 31) && ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)
				|| (dia >= 1 && dia <= 30) && (mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)
				|| (dia >= 1 && dia <= 29) && (esAnyoBisiesto(anyo) == true) && (mes == 2)
				|| (dia >= 1 && dia <= 28) && (esAnyoBisiesto(anyo) == false))) {
			
			LocalDate fecha = LocalDate.of(anyo, mes, dia);
			
			
			if (sorteos.containsKey(fecha)) {
				sorteos.put(fecha, combinacion);
				isUpdated = true;
			
			}else {
				throw new HistorialException ("No hay ningún sorteo en esta fecha, por lo que no se puede actualizar.");
			}
		
		}else {
			throw new HistorialException ("La fecha no es válida.");
		}
		
		
		return (isUpdated);
	}

	
	
	/* ------------ Función borrarSorteo () ------------ */
	public boolean borrarSorteo (LocalDate fechaABorrar) 
		throws HistorialException {
		
		boolean isDeleted = false;
		
		
		if (sorteos.containsKey(fechaABorrar)) {
			sorteos.remove(fechaABorrar);
			isDeleted = true;
		
		}else {
			throw new HistorialException ("No hay ningún sorteo en esa fecha.");
		}
		
		
		return (isDeleted);
	}
	
	
	
	/* ------------ Función listarSorteosDesdeFecha () ------------ */
	public List<String> listarSorteosDesdeFecha (LocalDate fechaAMostrar) 
		throws HistorialException {
		
		List<String> listaSorteos = new ArrayList<>();
		
		
		if (sorteos.containsKey(fechaAMostrar)) {
			listaSorteos.add(sorteos.get(fechaAMostrar).toString());
			
		}else {
			throw new HistorialException ("No hay ningún sorteo en esa fecha.");
		}
		
		
		return (listaSorteos);
	}
	
	
	
	/* ------------ Función mostrarHistorico () ------------ */
	public List<String> mostrarHistorico () throws HistorialException {
			
		List<String> listaSorteos = new ArrayList<>();
		StringBuilder resultado = new StringBuilder();
		//StringBuilder fechaString = new StringBuilder();
		
		
		if (!sorteos.isEmpty()) {
			
			for (Map.Entry<LocalDate, Combinacion> entrada : sorteos.entrySet()) {
				
				//fechaString.delete(0, fechaString.toString().length());
				resultado.delete(0, resultado.toString().length());
				//fechaString.append(entrada.getKey().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
				resultado.append("Día " /*+ fechaString + " "*/ + entrada.toString() + "\n");
				listaSorteos.add(resultado.toString());
			}
		
		}else {
			throw new HistorialException ("No hay ningún sorteo registrado ahora mismo.");
		}
		
			
		return (listaSorteos);
	}
	
	
	
	/* ------------ Función comprobarAciertos () ------------ */
	public Map<String, Integer> comprobarAciertos (LocalDate fechaSorteo, 
			Combinacion combinacionAComprobar) throws HistorialException {
		
		Map<String, Integer> mapaAciertos = new HashMap<>();
		
		
		if (sorteos.containsKey(fechaSorteo)) {
			
			Combinacion combinacionGanadora = sorteos.get(fechaSorteo);
			
			List<Integer> numerosAComprobar = (List<Integer>) combinacionAComprobar.getNumeros();
			List<Integer> numerosGanadores = (List<Integer>) combinacionGanadora.getNumeros();
			List<Integer> estrellasAComprobar = (List<Integer>) combinacionAComprobar.getEstrellas();
			List<Integer> estrellasGanadoras = (List<Integer>) combinacionGanadora.getEstrellas();
			mapaAciertos.put("Números", 0);
			mapaAciertos.put("Estrellas", 0);


			
			//Comprobacion números
			for (int i = 0; i < combinacionAComprobar.getNumeros().size(); i++) {
				
				if (numerosAComprobar.get(i).equals(numerosGanadores.get(i))) {
					mapaAciertos.put("Números", mapaAciertos.get("Números") + 1);
				}
			}
			
			
			//Comprobacion estrellas
			for (int j = 0; j < combinacionAComprobar.getEstrellas().size(); j++) {
				
				if (estrellasAComprobar.get(j).equals(estrellasGanadoras.get(j))) {
					mapaAciertos.put("Estrellas", mapaAciertos.get("Estrellas") + 1);
				}
			}
			
			
		}else {
			throw new HistorialException ("No hay ningún sorteo en esa fecha.");
		}
		
		
		return (mapaAciertos);
	}

}

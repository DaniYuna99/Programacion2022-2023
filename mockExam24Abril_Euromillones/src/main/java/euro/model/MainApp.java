package main.java.euro.model;

import java.time.LocalDate;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		try {
			
			//Combinacion
			Combinacion c1 = new Combinacion (1,2,3,4,5,6,7);
			Combinacion c3 = new Combinacion (1,2,3,4,5,6,7);
			
			int[] numbers = {2,1,3,4,5};
			int[] stars = {7,6};
			Combinacion c2 = new Combinacion (numbers, stars);
			
			
			//Historial
			Historial historial = new Historial();
			
			try {
				
				System.out.println(historial.addSorteo(LocalDate.of(1999, 10, 30), c1));
				System.out.println(historial.addSorteo(28, 2, 2000, c2));
				//Exception
				//System.out.println(historial.addSorteo(LocalDate.of(1999, 10, 30), c2));

				
				//System.out.println(historial.actualizarSorteo(LocalDate.of(1999, 10, 30), c3));
				//System.out.println(historial.actualizarSorteo(31, 10, 1999, c3));
				//Exception
				//System.out.println(historial.actualizarSorteo(LocalDate.of(1997, 10, 30), c3));
				//System.out.println(historial.actualizarSorteo(32, 10, 1999, c3));
				
				//System.out.println(historial.mostrarHistorico());
				//System.out.println(historial.borrarSorteo(LocalDate.of(1999, 10, 30)));
				//System.out.println(historial.mostrarHistorico());
				//System.out.println(historial.listarSorteosDesdeFecha(LocalDate.of(1999, 10, 30)));
				
				/*System.out.println(historial.comprobarAciertos(LocalDate.of(1999, 10, 30), c3));	//5 numeros, 2 estrellas
				System.out.println(historial.comprobarAciertos(LocalDate.of(1999, 10, 30), c2));	//3 numeros, 0 estrellas
				//Exception
				System.out.println(historial.comprobarAciertos(LocalDate.of(1990, 10, 30), c2));
				*/

			} catch (HistorialException e) {
				e.printStackTrace();
			}

			
			
			/*System.out.println(c1);
			System.out.println(c2);
			System.out.println(c1.equals(c2));	
			System.out.println(c1.equals(c3));*/

			
		} catch (CombinacionException e) {
			e.printStackTrace();
		}
	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	
	/* ------------ Función comoSeLlameLaFuncion () ------------ */

}

package com.jacaranda;

import java.time.LocalDateTime;

import com.jacaranda.bloc.Bloc;
import com.jacaranda.bloc.BlocException;
import com.jacaranda.notas.Nota;
import com.jacaranda.notas.NotaAlarma;

public class MainBloc {
	

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	/*El ejercicio no indicaba que hiciéramos un menú, por lo que he puesto 
	 * un par de pruebas y ya*/
	
	public static void main(String[] args) {
	
		Bloc bloc = null;
		
		try {
			
			bloc = new Bloc("Compra");
		
		}catch (BlocException e) {
			System.out.println(e.getMessage());
		}
		
		
		Nota nota1 = new Nota("Macarrones");
		Nota nota2 = new Nota("Tomate frito");
		Nota nota3 = new Nota("Atún");
		NotaAlarma nota4 = new NotaAlarma("Salsa boloñesa", LocalDateTime.now().plusDays(4));
		bloc.anadirNota(nota1);
		bloc.anadirNota(nota2);
		bloc.anadirNota(nota3);
		bloc.anadirNota(nota4);
		

		System.out.println(bloc.toString());
		
		
		bloc.borrarNota(2);
		System.out.println(bloc.toString());
		bloc.borrarNota(4);
		System.out.println(bloc.toString());
		
		try {
			bloc.updateNota(3, "Espaguetis");
		} catch (BlocException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(bloc.toString());



	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	
	/* ------------ Función mostrarEmpleado () ------------ */

}

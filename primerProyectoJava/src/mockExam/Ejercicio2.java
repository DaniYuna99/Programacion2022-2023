package mockExam;

import java.util.Scanner;

public class Ejercicio2 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	/* ===== CONSTANTES ===== */
	public static final int NUMERO_PARA_FCM = 220;
	
	
	public static void main(String[] args) {
		
		/*La frecuencia cardíaca máxima recomendada durante la 
		 *realización de práctica deportiva tipo cardio no debe 
		 *exceder el 85% de la frecuencia cardíaca máxima (FCM). 
		 *Esta última se calcula restando la edad de la persona 
		 *a 220. Elabora una función o método que reciba un 
		 *valor entero que será el año actual y una cadena con 
		 *la fecha de nacimiento de una persona (formato dd/mm/yyyy) 
		 *y devuelva un número real que será la frecuencia 
		 *cardíaca máxima recomendada durante un ejercicio de 
		 *tipo cardio (para el cálculo de la edad no se contempla 
		 *ni el mes ni el día, es decir, si alguién nació en el 
		 *2000 y estamos en el año 2022, consideraremos que tiene 
		 *22 años). Realizar un programa principal que solicite 
		 *el año actual y la fecha de nacimiento en el formato 
		 *especificado y que muestre la frecuencia cardíaca 
		 *máxima por pantalla. NO es necesario validar los datos, 
		 *pensamos que el usuario siempre lo introduce como debe.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la fecha de nacimiento en formato 'dd/mm/yyyy': ");
		String fecha = String.valueOf(sc.nextLine());
		
		System.out.println("Dime el año actual: ");
		int anyoActual = Integer.valueOf(sc.nextLine());
		
		System.out.println("La frecuencia cardíaca máxima de esa persona es " + fcm(anyoActual, fecha)
							+ ", y la frecuencia cardíaca recomendada es " + obtenerFCR(fcm(anyoActual, fecha))
							+ ".");
		
		sc.close();
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ======================= Función fcm () ======================= */
	public static int fcm (int anyoActual, String fechaNacimiento) {
		
		int anyoFecha = Integer.valueOf(fechaNacimiento.substring(6));
		int anyosPersona = anyoFecha - anyoActual;
		
		
		if (anyosPersona < 0) {
			anyosPersona = -anyosPersona;
		}
		
		
		return (NUMERO_PARA_FCM - anyosPersona);
	}
	
	
	
	/* ======================= Función obtenerFCR () ======================= */
	public static double obtenerFCR (int fcm) {
		
		return (fcm * 0.85);
	}
	 
	
	
}

package boletin2_IntroduccionJava;

public class Ejercicio1 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*1. Realizar un método llamado numeroSolucionesEcuacionSegundoGrado 
		 * que reciba los coeficientes de una ecuación de segundo grado y 
		 * devuelva el número de soluciones que tiene. Si los argumentos 
		 * no son válidos (el primer coeficiente tiene que ser distinto de 
		 * cero) debe devolver un -1.*/
		
		
		System.out.println(numeroSolucionesEcuacionSegundoGrado(3,5,1));	//2
		System.out.println(numeroSolucionesEcuacionSegundoGrado(1,1,1));	//0
		System.out.println(numeroSolucionesEcuacionSegundoGrado(1,-4,4));	//1
		System.out.println(numeroSolucionesEcuacionSegundoGrado(1,3,2));	//2
		
	}

	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	
	/* ============ Función numeroSolucionesEcuacionSegundoGrado () ============ */
	public static int numeroSolucionesEcuacionSegundoGrado (int a, int b, int c) {
		
		int numeroSoluciones = 0;
		double parteRaizCuadrada = ((b * b) - (4 * a * c));
		
		
		if (parteRaizCuadrada > 0) {
			numeroSoluciones = 2;
			
		}else if (parteRaizCuadrada == 0) {
			numeroSoluciones = 1;
			
		}else if (parteRaizCuadrada < 0) {
			numeroSoluciones = 0;
			
		}
		
		
		return (numeroSoluciones);
		
	}
	
	
	//Esto era una ecuación que calculaba ecuaciones, y lo hice porque leí mal.
	
	/* ============ Función numeroSolucionesEcuacionSegundoGrado () ============ */
	/*public static int numeroSolucionesEcuacionSegundoGrado (int co1, int co2, int co3) {
		
		int numeroSoluciones = (co1 > 0) 
								? 0
								: -1;
		double primeraSolucion = 0.0, segundaSolucion = 0.0;
		
		
		if (numeroSoluciones != -1) {
			
			primeraSolucion = (-co2 + (Math.sqrt(Math.pow(co2, 2) - (4 * co1 * co3))) 
							  / (2 * co1));
			segundaSolucion = (-co2 - (Math.sqrt(Math.pow(co2, 2) - (4 * co1 * co3))) 
					  / (2 * co1));
		}
		
		
		System.out.println(primeraSolucion);
		System.out.println(segundaSolucion);
		
		
		return (numeroSoluciones);
		
	}*/
	
}





























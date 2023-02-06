package boletin2_IntroduccionJava;

public class Ejercicio7 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*7. Realizar un método llamado segundosEntre que recibirá seis 
		 * valores enteros, los tres primeros representarán la hora, 
		 * minuto y segundos de la primera hora y los otros tres de la 
		 * segunda hora. Se deberá devolver el número de segundos que hay 
		 * entre la primera hora y la segunda (el valor debe ser siempre 
		 * en positivo). Si los datos no son correctos se deberá devolver 
		 * -1000.*/
		
		
		System.out.println(segundosEntre(3,2,2, 2,2,2));		//3600
		System.out.println(segundosEntre(69,59,59, 69,59,59));	//0
		System.out.println(segundosEntre(20,59,59, 24,0,0));	//10801
		System.out.println(segundosEntre(5,-1,59, 5,0,0));		//-1000
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ======================= Función segundosEntre () ======================= */
	public static int segundosEntre (int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		
		int resultado = -1000;
		
		
		if ((min1 < 60) && (min2 < 60) && (seg1 < 60) && (seg2 < 60)
			&& (min1 >= 0) && (min2 >= 0) && (seg1 >= 0) && (seg2 >= 0)) {
			
			int hora1EnSegundos = ( (hora1 * 3600) + (min1 * 60) + seg1 );
			int hora2EnSegundos = ( (hora2 * 3600) + (min2 * 60) + seg2 );
			
			resultado = (hora1EnSegundos - hora2EnSegundos); 
			
			
			if (resultado <= 0) {
				resultado = -resultado;
			}
			
		}
		
		
		return (resultado);
		
	}
}

package boletin2_IntroduccionJava;

public class Ejercicio6 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*6. Realizar un método llamado horaMayor que recibirá seis 
		 * valores enteros, los tres primeros representarán la hora, 
		 * minuto y segundos de la primera hora y los otros tres de 
		 * la segunda hora. Se deberá devolver un 1 si la primera hora 
		 * es mayor que la segunda, un 2 si la segunda hora es mayor que 
		 * la primera, un 0 si son iguales y un -1000 si los datos no 
		 * son correctos.*/
		
		System.out.println(horaMayor(2,2,2, 2,2,2));		//0
		System.out.println(horaMayor(69,59,59, 69,59,59));	//0
		
		System.out.println(horaMayor(3,2,2, 2,50,19));		//1
		System.out.println(horaMayor(9,43,1, 9,43,0));		//1
		
		System.out.println(horaMayor(2,2,2, 10,49,0));		//2
		System.out.println(horaMayor(13,59,58, 13,59,59));	//2
		
		System.out.println(horaMayor(2,60,2, 2,2,2));		//-1000
		System.out.println(horaMayor(2,3,2, 2,2,-35));		//-1000
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ======================= Función horaMayor () ======================= */
	public static int horaMayor (int hora1, int min1, int seg1, int hora2, int min2, int seg2) {
		
		int resultado = -1000;
		
		
		if ((min1 < 60) && (min2 < 60) && (seg1 < 60) && (seg2 < 60)
			&& (min1 >= 0) && (min2 >= 0) && (seg1 >= 0) && (seg2 >= 0)) {
			
			int hora1EnSegundos = ( (hora1 * 3600) + (min1 * 60) + seg1 );
			int hora2EnSegundos = ( (hora2 * 3600) + (min2 * 60) + seg2 );
			
			
			if (hora1EnSegundos > hora2EnSegundos) {
				resultado = 1;
				
			}else if (hora1EnSegundos == hora2EnSegundos) {
				resultado = 0;
				
			}else if (hora1EnSegundos < hora2EnSegundos) {
				resultado = 2;
				
			}
			
		}
		
		
		return (resultado);
		
	}
	
}

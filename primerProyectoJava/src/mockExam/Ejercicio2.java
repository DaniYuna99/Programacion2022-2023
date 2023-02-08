package mockExam;

public class Ejercicio2 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

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
		
		
		System.out.println(fcm(2023, "10/05/2000"));
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ======================= Función fcm () ======================= */
	public static int fcm (int anyoActual, String fechaNacimiento) {
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 6; i < fechaNacimiento.length(); i++) {
			sb.append(fechaNacimiento.charAt(i));
		}
		
		
		int anyoFecha = Integer.valueOf(sb.toString());
		
		
		return (anyoActual - anyoFecha);
	}
	 
	
	
}

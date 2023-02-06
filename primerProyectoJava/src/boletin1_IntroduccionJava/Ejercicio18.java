package boletin1_IntroduccionJava;

public class Ejercicio18 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*18. Realizar un método llamado calcularAreaCirculo que devuelva 
		 * el área de un círculo y otro llamado calcularLongitudCirculo 
		 * que devuelva su longitud.*/

		
		System.out.println(calcularAreaCirculo(8));	//201.06
		System.out.println(calcularLongitudCirculo(8));	//50.26
		
	}
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/

	/* ==================== Función calcularAreaCirculo () ====================== */
	public static double calcularAreaCirculo (double radio) {
		return (Math.PI * (radio * radio));
	}
	
	
	/* ==================== Función calcularLongitudCirculo () ====================== */
	public static double calcularLongitudCirculo (double radio) {
		return ((Math.PI * 2) * radio);
	}
}

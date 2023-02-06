package boletin1_IntroduccionJava;

public class Ejercicio7 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*7. Codifica las siguientes secuencias numéricas haciendo uso 
		* de estructuras: i) for, ii) while, iii) do-while en cada una 
		* de ellas:
		* 		a. Crea un método que muestre los números del 1 al 100
		* 		b. Repite el ejercicio anterior, pero en formato descendente, 
		* 	  	   es decir, del 100 al 1.
		* 		c. Crea un programa que calcule y escriba los números múltiplos 
		* 	  	   de 5 de 0 a 100.
		* 		d. Escribe los números del 320 al 160, contando de 20 en 20 
		*    	   hacia atrás.*/

		
		//mostrarNumeros1Al100();
		//mostrarNumeros100Al1();
		//mostrarMultiplosDe5();
		//mostrarDel320Al160();
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ============== Función mostrarNumeros1Al100 () =============== */
	
	//APARTADO A
	public static void mostrarNumeros1Al100 () {
		
		System.out.println("Con bucle For: ");
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("Con bucle While: ");
		int contador = 1; 
		
		while (contador <= 100) {
			System.out.println(contador);
			contador++;
		}
		
		
		System.out.println("Con bucle Do-While: ");
		contador = 1;
		
		do {
			System.out.println(contador);
			contador++;
		
		}while (contador <= 100);
		
	}
	
	
	
	/* ============== Función mostrarNumeros100Al1 () =============== */
	
	//APARTADO B
	public static void mostrarNumeros100Al1 () {
		
		System.out.println("Con bucle For: ");
		
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
			
		}
		
		
		System.out.println("Con bucle While: ");
		int contador = 100; 
		
		while (contador >= 1) {
			System.out.println(contador);
			contador--;
		}
		
		
		System.out.println("Con bucle Do-While: ");
		contador = 100;
		
		do {
			System.out.println(contador);
			contador--;
		
		}while (contador >= 1);
		
	}
	
	
	
	/* =============== Función mostrarMultiplosDe5 () =============== */
	
	//APARTADO C
	public static void mostrarMultiplosDe5 () {
				
		System.out.println("Con bucle For: ");
		
		for (int i = 0; i <= 100; i += 5) {
			System.out.println(i);			
		}
		
		
		System.out.println("Con bucle While: ");
		int contador = 5; 
		
		while (contador <= 100) {
			System.out.println(contador);
			contador += 5;
		}
		
		
		System.out.println("Con bucle Do-While: ");
		contador = 5;
		
		do {
			System.out.println(contador);
			contador += 5;
		
		}while (contador <= 100);
				
	}
	
	
	
	/* ================ Función mostrarDel320Al160 () =============== */
	
	//APARTADO D
	public static void mostrarDel320Al160 () {
		
		System.out.println("Con bucle For: ");
		
		for (int i = 320; i >= 160; i -= 20) {
			System.out.println(i);		
		}
		
		
		System.out.println("Con bucle While: ");
		int contador = 320; 
		
		while (contador >= 160) {
			System.out.println(contador);
			contador -= 20;
		}
		
		
		System.out.println("Con bucle Do-While: ");
		contador = 320;
		
		do {
			System.out.println(contador);
			contador -= 20;
		
		}while (contador >= 160);
				
	}
	

}

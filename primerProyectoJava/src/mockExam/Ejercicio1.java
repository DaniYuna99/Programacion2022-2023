package mockExam;

import java.util.Scanner;

public class Ejercicio1 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	/* ========== CONSTANTES ========== */
	public static final int PRECIO_ENTRADA = 8;
	public static final int PRECIO_DIA_ESPECTADOR = 5;
	public static final double PRECIO_DIA_PAREJA = 5.50;
	public static final double TARJETA_DESCUENTO = 0.10;
	public static final String SEPARADOR = "--------------------------";
	
	
	public static void main(String[] args) {
		
		/*Realiza un programa que calcule el precio de unas entradas 
		 * de cine en función del número de personas y del día de la 
		 * semana. El precio general de una entrada son 8 euros. El 
		 * miércoles (día del espectador), el precio es de 5 euros. 
		 * Los jueves es el día de la pareja, por lo que la entrada 
		 * para dos cuesta 11 euros. Por ejemplo, si un jueves, un 
		 * grupo de 6 personas compran entradas, el precio total 
		 * sería de 33 euros ya que son 3 parejas; pero si es un 
		 * grupo de 7, pagarán 3 entradas de pareja más 1 individual 
		 * que son 41 euros (33 + 8). Además si dispone de la tarjeta 
		 * CineJacaranda se obtiene un 10% de descuento. Se debe seguir 
		 * vendiendo entradas hasta que se introduzca 0 en el número 
		 * de entradas. Si se confunde al pedir el día de la semana 
		 * o si tiene tarjeta del CineJacaranda se debe volver a pedir 
		 * la información. No nos importa que salga más de dos decimales.
		 * Realiza el programa para que si en un futuro cambia el precio 
		 * de las entradas, ya sea el general, el del día del espectador 
		 * o el del día de la pareja, se pueda modificar fácilmente.
		 * 
		 * Ejemplo 1:
				Número de entradas: 4
				Día de la semana (L,M,X,J,V,S,D): L
				¿Tienes tarjeta CineJacaranda(S/N)?: N
				El precio de su compra es 32 euros
			Ejemplo 2:
				Número de entradas: 5
				Día de la semana (L,M,X,J,V,S,D): J
				¿Tienes tarjeta CineJacaranda(S/N)?: N
				El precio de su compra es 30 euros
			Ejemplo 3:
				Número de entradas: 2
				Día de la semana (L,M,X,J,V,S,D): X
				¿Tienes tarjeta CineJacaranda(S/N)?: S
				El precio de su compra es 9 euros*/
		
		calcularPrecioEntradas();
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ================== Función calcularPrecioEntradas () ================== */
	public static void calcularPrecioEntradas () {
		
		Scanner sc = new Scanner(System.in);
		int totalDinero = 0;
		int entradas = 1;
		
		System.out.println("Bienvenido al cine Jacaranda.");
		
		
		do {
			
			// ----- Pedida de datos (entradas) -----
			System.out.println("¿Cuántas entradas vas a comprar? (Introduce 0 para salir del programa) ");
			entradas = Integer.valueOf(sc.nextLine());
			
			while (entradas < 0) {
				System.out.println("Has introducido una cantidad de entradas negativa. Introduce de nuevo: ");
				entradas = Integer.valueOf(sc.nextLine());
			}
			
			
			if (entradas != 0) {
				
				// ----- Pedida de datos (dia y tarjeta) -----
				System.out.println("¿Qué día de la semana es? (L, M, X...)");
				String dia = String.valueOf(sc.nextLine()).toUpperCase();
				
				while (!dia.equals("L") && !dia.equals("M") && !dia.equals("X") && !dia.equals("J")
						&& !dia.equals("V") && !dia.equals("S") && !dia.equals("D")) {
					System.out.println("Te has equivocado. Introduce el día de la semana de nuevo: ");
					dia = String.valueOf(sc.nextLine()).toUpperCase();
				}
				
				
				System.out.println("¿Tienes tarjeta CineJacaranda? (S/N) ");
				String tarjeta = String.valueOf(sc.nextLine()).toUpperCase();
				
				while (!tarjeta.equals("S") && !tarjeta.equals("N")) {
					System.out.println("Te has equivocado. Introduce si tienes o no la tarjeta de nuevo: ");
					tarjeta = String.valueOf(sc.nextLine()).toUpperCase();
				}
				
				
				// ----- Ifs que calculan la cantidad dependiendo del dia -----
				if (dia.equals("X")) {
					totalDinero = entradas * PRECIO_DIA_ESPECTADOR;
					
				}else if (dia.equals("J")) {
					
					if (entradas % 2 == 0) {
						totalDinero = ((int) (entradas * PRECIO_DIA_PAREJA));
						
					}else {
						totalDinero = (int) (((entradas - 1) * PRECIO_DIA_PAREJA) + PRECIO_ENTRADA);
						
					}
					
				}else {
					totalDinero = entradas * PRECIO_ENTRADA;
					
				}
				
				
				// ----- Aplicacion del descuento o no -----
				if (tarjeta.equals("S")) {
					totalDinero *= (1 - TARJETA_DESCUENTO);
				}
				
				
				// ----- Muestra del resultado -----
				System.out.println(SEPARADOR);
				System.out.println("Número de entradas: " + entradas);
				System.out.println("Día de la semana: " + dia);
				System.out.println("¿Tienes tarjeta CineJacaranda? " + tarjeta);
				System.out.println("El precio de tu compra es de " + totalDinero + " euros");
				System.out.println(SEPARADOR);
			}
			
			
		}while (entradas != 0);
		
		
		System.out.println(SEPARADOR);
		System.out.println("Has salido del programa.");
		sc.close();
	}
	
	
	
	
	
	
}

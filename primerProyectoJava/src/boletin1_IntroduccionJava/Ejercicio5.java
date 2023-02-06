package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/*5. Realiza un método que reciba una hora por 
		 * parámetro y que muestre luego buenos días, 
		 * buenas tardes o buenas noches según corresponda. 
		 * Se utilizarán los tramos de 6 a 12, de 13 a 20 
		 * y de 21 a 5, respectivamente, sólo teniendo en 
		 * cuenta el valor de las horas.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pon una hora con formato 'hh:mm:ss' (o no, sólo las horas): ");
		String horaString = sc.nextLine();
		
		String hora = String.valueOf(horaString.charAt(0)) + horaString.charAt(1);
		int horaInt = Integer.valueOf(hora);
		
		
		if (horaInt >= 6 && horaInt < 13) {
			System.out.println("Buenos días.");
		
		}else if (horaInt >= 13 && horaInt < 21){
			System.out.println("Buenas tardes.");
		
		}else if (horaInt >= 21 && horaInt <= 24 
				|| horaInt >= 0 && horaInt < 6){
			System.out.println("Buenas noches.");
		
		}else {
			System.out.println("Te has equivocado al introducir la hora.");
		}
		
		
		sc.close();
		
	}

}

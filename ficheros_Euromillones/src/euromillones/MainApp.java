package euromillones;

import java.io.File;
import java.time.LocalDate;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		Historial historial = null;
		
		try {
			
			historial = new Historial(new File("src/files/Euromillones 2004 a 2023.csv"));
			System.out.println(historial.obtenerNumeroMasFrecuente());			//Es 19
			System.out.println(historial.obtenerEstrellaMasFrecuente());		//Es 3
			System.out.println(historial.obtenerNumeroMenosFrecuente());		//Es 22
			System.out.println(historial.obtenerEstrellaMenosFrecuente());		//Es 12
			
			
			//Se genera aleatoriamente la combinacion si solo le pasas una fecha en el constructor
			//Combinacion combinacionGanadora = new Combinacion (LocalDate.of(1999, 10, 30));
			
			
			//Esta es la primera combinacion del Excel, por lo que sale 7.
			Combinacion c1 = new Combinacion (LocalDate.of(1999, 10, 30), 7, 8, 18, 33, 42, 2, 8);
			System.out.println(historial.obtenerMaximoAciertos(c1));
			
			//Sale 4
			Combinacion c2 = new Combinacion (LocalDate.of(1999, 10, 30), 6, 7, 16, 33, 42, 2, 8);
			System.out.println(historial.obtenerMaximoAciertos(c2));
			
			
			System.out.println(historial.obtenerMayorSecuenciaNumerosConsecutivos());	//Parece ser 2
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}
	
}

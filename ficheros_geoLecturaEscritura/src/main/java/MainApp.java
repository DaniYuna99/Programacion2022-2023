package main.java;

import main.java.model.Atlas;


public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		/*Una vez ejecutes esto, mira en la carpeta "files", donde se creará el archivo 
		"datosPaises.txt" y "datosCiudades.txt"*/
		
		
		try {
			
			Atlas a = new Atlas();
			a.imprimirPaisesEnArchivo();
			a.imprimirCiudadesEnArchivo();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

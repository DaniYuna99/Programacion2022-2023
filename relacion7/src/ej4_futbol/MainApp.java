package ej4_futbol;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/

	public static void main(String[] args) {
		
		try {
			
			//Apartado 1: Crear un partido entre dos equipos, y poner 2-1 de resultado
			Partido p1 = new Partido(37, "Equipo Galaxia", "Team Rocket", "Algún estadio de 8ª gen, no he jugado", "Una ciudad de Galar");
			p1.ponerResultado("2-1");
			
			//Apartado 2: Crear dos partidos entre dos equipos, y poner 0-0 y 1-2 de resultado
			Partido p2 = new Partido(2, "Equipo ACT", "Equipo Carisma", "Estadio Algarabía", "Ciudad Algarabía");
			p2.ponerResultado("0-0");
			Partido p3 = new Partido(17, "Team Ikari", "Team South Town", "Estadio KOF", "Ciudad A Saber Donde Está Eso");
			p3.ponerResultado("1-2");
			
			//Apartado 3: Imprimir los resultados
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
}

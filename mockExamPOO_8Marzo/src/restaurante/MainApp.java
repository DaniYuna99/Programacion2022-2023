package restaurante;

import java.util.Scanner;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);	
			int opcionMenu = 0;	
			int contadorIndicePlatos = 0;
			Plato[] platos = new Plato[10];
			           
			
			do {
				
				// ----- Menu y seleccion de opciones
				System.out.println(MENU);
				opcionMenu = Integer.valueOf(sc.nextLine());
				
				while ((opcionMenu != 1) && (opcionMenu != 2)
						&& (opcionMenu != 3) && (opcionMenu != 4)
						&& (opcionMenu != 5) && (opcionMenu != 6)) {
					System.out.println("Error. Elige de nuevo: ");
					opcionMenu = Integer.valueOf(sc.nextLine());
				}
				
				
				// ----- Ifs de las opciones -----
				
				//1. Dar de alta un plato
				if (opcionMenu == 1) {
					
					if (platos[9] == null) {
						
						boolean existe = false;
						
						System.out.println("Introduce el nombre del nuevo plato: ");
						String nombre = sc.nextLine();
						
						
						if (platos[0] != null) {
							
							for (Plato plato : platos) {
								
								if (plato != null) {
									
									if (plato.getNombre().equals(nombre)) {
										existe = true;
									}
								}
							}
						}
						
						
						if (existe == false) {
							
							System.out.println("Introduce el precio del nuevo plato: ");
							double precio = Double.valueOf(sc.nextLine());
							
							while (precio <= 0) {
								System.out.println("El precio no puede ser negativo. Ponlo de nuevo: ");
								precio = Double.valueOf(sc.nextLine());
							}
							
							
							platos[contadorIndicePlatos] = new Plato(nombre, precio);
							contadorIndicePlatos++;
							System.out.println("Nuevo plato creado.");
							
						}else {
							System.out.println("Existe ya un plato con ese nombre.");
						}
						
					}else {
						System.out.println("No hay hueco para más platos.");
					}
				
					
				//2. Modificar el precio de un plato
				}else if (opcionMenu == 2) {
					
					System.out.println("Introduce el nombre del plato al que le quieres cambiar su precio base: ");
					String nombre = sc.nextLine();
					boolean existe = false;
					
					
					for (Plato plato : platos) {
						
						if (plato != null) {
							
							if (plato.getNombre().equals(nombre)) {
								
								System.out.println("Introduce el nuevo precio de este plato: ");
								double precio = Double.valueOf(sc.nextLine());
								
								while (precio <= 0) {
									System.out.println("El precio no puede ser negativo. Ponlo de nuevo: ");
									precio = Double.valueOf(sc.nextLine());
								}
								
								plato.setPrecio(precio);
								System.out.println("Se ha cambiado el precio del plato.");
								existe = true;
								
							}
						}
					}
					
					
					if (existe == false) {
						System.out.println("No se ha encontrado ningún plato con ese nombre.");
					}
					
					
				//3. Asignar un vino a un plato
				}else if (opcionMenu == 3) {
					
					System.out.println("Introduce el nombre del plato al que le quieres asignar un vino: ");
					String nombre = sc.nextLine();
					boolean existe = false;
					
					
					for (Plato plato : platos) {
						
						if (plato != null) {
							
							if (plato.getNombre().equals(nombre)) {
								
								System.out.println("Introduce el nombre del vino que quieres asignar al plato: ");
								String nombreVino = sc.nextLine();
								System.out.println("Introduce la graduación de este vino: ");
								double graduacion = Double.valueOf(sc.nextLine());
								
								while (graduacion < 0) {
									System.out.println("La graduación no puede ser negativo. Ponla de nuevo: ");
									graduacion = Double.valueOf(sc.nextLine());
								}
								
								plato.setVinoRecomendado(nombreVino, graduacion);

								System.out.println("Se ha añadido el vino al plato.");
								existe = true;
								
							}
						}
					}
					
					
					if (existe == false) {
						System.out.println("No se ha encontrado ningún plato con ese nombre.");
					}
					
				
				//4. Mostrar informacion de un plato
				}else if (opcionMenu == 4) {
					
					System.out.println("Introduce el nombre del plato que quieres consultar: ");
					String nombre = sc.nextLine();
					boolean isFound = false;
					
					
					for (Plato plato : platos) {
						
						if (plato != null) {
							
							if (plato.getNombre().equals(nombre)) {
								System.out.println(plato.toString());
								isFound = true;
							}
						}
					}
					
					
					if (platos[0] == null) {
						System.out.println("No hay ningún plato registrado.");
					
					}else if (isFound == false) {
						System.out.println("No se ha encontrado ningún plato con ese nombre.");
					}
					
				
				//5. Modificar informacion de todos los platos
				}else if (opcionMenu == 5) {
					
					if (platos[0] == null) {
						System.out.println("No hay ningún plato registrado.");
						
					}else {
						
						for (Plato plato : platos) {
							
							if (plato != null) {
								System.out.println(plato.toString());
							}
						}
					}
				}
				
				
			}while(opcionMenu != 6);
			
			//Salida del programa
			System.out.println(SEPARADOR + "\n" + "Has salido del programa.");
			sc.close();
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* //////// CONSTANTES \\\\\\\\ */
	public static final String SEPARADOR = "-------------------------------";
	
	public static final String MENU = SEPARADOR + "\n"
									+ "¿Qué quieres hacer?\n"
									+ SEPARADOR + "\n"
									+ "1. Dar de alta un plato\n"
									+ "2. Modificar el precio de un plato\n"
									+ "3. Asignar un vino a un plato\n"
									+ "4. Mostrar la informacion de un plato\n"
									+ "5. Mostrar informacion de todos los platos\n"
									+ "6. Salir\n"
									+ SEPARADOR + "\n"
									+ "Elige: ";
			
}























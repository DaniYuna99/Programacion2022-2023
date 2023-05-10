package main.java.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Atlas {
	
	/* ======================= ATRIBUTOS ======================= */
	private List<Pais> listaPaises;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final String SEPARADOR_PAIS = "========================";
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Atlas () {
		
		//Directamente se llaman a todas las funciones necesarias, y se insertan los Países con las Ciudades y Direcciones
		this.listaPaises = addCiudadesAPaises(agruparCiudadesPorPais(addDireccionesACiudades(agruparDireccionesPorCiudad())));
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función imprimirPaisesEnArchivo () ------------ */
	/**
	 * Método que imprime en un archivo nuevo dentro de "files" 
	 * (se borra y se crea de nuevo si existe el archivo)
	 * la lista de Países que tiene como atributo de clase.
	 * 
	 */
	public void imprimirPaisesEnArchivo () {
		
		File fichero = new File ("././files/datosPaises.txt");
		
		try {
			fichero.createNewFile();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(fichero);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		PrintWriter printer = new PrintWriter(writer);
		printer.append(SEPARADOR_PAIS + SEPARADOR_PAIS + "\n\n" + "   PAÍSES, SUS CIUDADES Y SUS DIRECCIONES\n\n" + SEPARADOR_PAIS); 
		
		
		for (Pais p : this.listaPaises) {
			
			if (p.getListaCiudades().size() == 0) {
				printer.append(SEPARADOR_PAIS + "\n" + p.toString() + "\n" + "No tiene ninguna ciudad asignada." + "\n\n" + "\n\n");
			
			}else {
				printer.append(SEPARADOR_PAIS + "\n" + p.toString() + "\n" + Ciudad.SEPARADOR + "\n\n");
			}
		}
		
		
		printer.close();
		
		
		try {
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	/* %%%%%%%%%%%%%%%%%% MÉTODOS DE DIRECCION %%%%%%%%%%%%%%%%%% */
	
	/* ------------ Función crearListaDirecciones () ------------ */
	/**
	 * Método que "rescata" las direcciones del archivo "address.txt" de la carpeta 
	 * "files", y devuelve una lista con todas las Direcciones.
	 * 
	 * @return
	 * @throws CiudadException
	 */
	public List<Direccion> crearListaDirecciones () throws Exception {
		
		File archivo = new File ("././files/address.txt");
		List<Direccion> listaDirecciones = new ArrayList<>();
		
		
		if (archivo.exists()) {
			
			FileReader fr = null;
			BufferedReader br = null;
			String linea = null;
			
			
			try {
				
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				br.readLine();
				linea = br.readLine();
				
				
				while (linea != null) {
					
					String[] listaElementos = linea.split(",");
					
					int idDireccion = Integer.valueOf(listaElementos[0]);
					String nombreDireccion = listaElementos[1];
					String ciudad = null;
					
					if (listaElementos.length > 2) {
						ciudad = listaElementos[3];
						
					}else {
						ciudad = "Ninguna";
					}
					
					listaDirecciones.add(new Direccion(idDireccion, nombreDireccion, ciudad));
					
					linea = br.readLine();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}else {
			throw new Exception ("No existe el archivo para cargar las direcciones.");
		}
		
		
		return (listaDirecciones);
	}
	
	
	//LLAMAR A ESTA FUNCIÓN PARA CREAR UN MAPA CON DIRECCIONES AGRUPADAS POR CIUDAD

	/* --------- Función agruparDireccionesPorCiudad () -------- */
	/**
	 * Método que, como su nombre indica, agrupa una lista de Direcciones en un mapa, 
	 * según la ciudad a la que pertenecen. Devuelve un mapa. La lista de Direcciones 
	 * se crea mediante una llamada a la función "crearListaDirecciones()". <br> <br>
	 * 
	 * MÉTODOS QUE USA ESTA FUNCIÓN: <br>
	 * - crearListaDirecciones()
	 * 
	 * @return
	 */
	public Map<String, List<Direccion>> agruparDireccionesPorCiudad () {
		
		List<Direccion> listaDirecciones = null;
		
		try {
			listaDirecciones = crearListaDirecciones();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		Map<String, List<Direccion>> mapaDirecciones = new HashMap<>();
		
		
		for (Direccion d : listaDirecciones) {
			
			if (mapaDirecciones.containsKey(d.getCiudad()) && (d.getCiudad() != null)) {
				mapaDirecciones.get(d.getCiudad()).add(d);
				
			}else if (!mapaDirecciones.containsKey(d.getCiudad()) && (d.getCiudad() != null)) {
				mapaDirecciones.put(d.getCiudad(), new ArrayList<>());
				mapaDirecciones.get(d.getCiudad()).add(d);
			}
		}
		
		
		return (mapaDirecciones);
	}
	
	
	
	
	/* %%%%%%%%%%%%%%%%%% MÉTODOS DE CIUDAD %%%%%%%%%%%%%%%%%% */
	
	/* ---------------- Función crearListaCiudadesVacia () --------------- */
	/**
	 * Método que "rescata" las ciudades del archivo "city.txt" de la carpeta 
	 * "files", y devuelve una lista con todas las Ciudades creadas (sin direcciones).
	 * 
	 * @return
	 * @throws CiudadException
	 */
	public static List<Ciudad> crearListaCiudadesVacia () throws Exception {
		
		File archivo = new File ("././files/city.txt");
		List<Ciudad> listaCiudades = new ArrayList<>();
		
		
		if (archivo.exists()) {
			
			FileReader fr = null;
			BufferedReader br = null;
			String linea = null;
			
			
			try {
				
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				br.readLine();
				linea = br.readLine();
				
				
				while (linea != null) {
					
					String[] listaElementos = linea.split(",");
					
					int idCiudad = Integer.valueOf(listaElementos[0]);
					String nombreCiudad = listaElementos[1];
					int idPais = Integer.valueOf(listaElementos[2]);
					
					
					listaCiudades.add(new Ciudad(idCiudad, nombreCiudad, idPais));
					
					linea = br.readLine();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}else {
			throw new Exception ("No existe el archivo para cargar las ciudades.");
		}
		
		
		return (listaCiudades);
	}
	
	
	
	//LLAMAR A ESTA FUNCIÓN PARA AÑADIR DIRECCIONES A CIUDADES, Y TENER UNA LISTA DE CIUDADES CON DIRECCIONES
	//Pon de parámetro de entrada la función "agruparDireccionesPorCiudad()"
	
	/* --------- Función addDireccionesACiudades () -------- */
	/**
	 * Método que introduce las Direcciones del mapa del parámetro de entrada en una lista de Ciudades vacía.
	 * La lista de Ciudades la crea la función "crearListaCiudadesVacia()", que esta función llama. <br> <br>
	 * 
	 * MÉTODOS USADOS EN ESTA FUNCIÓN: <br>
	 * - crearListaCiudadesVacia() <br>
	 * - eliminarCiudadesSinDirecciones()
	 * 
	 * @param mapaDirecciones
	 * @return
	 */
	public List<Ciudad> addDireccionesACiudades (Map<String, List<Direccion>> mapaDirecciones) {
		
		List<Ciudad> listaCiudades = null;
		
		try {
			listaCiudades = crearListaCiudadesVacia();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		for (Ciudad ciudad : listaCiudades) {
			
			for (String c : mapaDirecciones.keySet()) {
				
				if (ciudad.getNombreCiudad().equalsIgnoreCase(c)) {
					ciudad.setListaDirecciones(mapaDirecciones.get(c));
				}
			}
		}
		
		
		//ESTO CAÍ EN QUE ERA TONTO PORQUE ELIMINABA CONTENIDO, POR LO QUE LO COMENTÉ
		//eliminarCiudadesSinDirecciones(listaCiudades);
		
		
		return (listaCiudades);
	}

	
	
	/* --------- Función eliminarCiudadesSinDirecciones () -------- */
	/**
	 * Método que borra las ciudades de una lista que no tienen direcciones asignadas.<br> <br>
	 * 
	 * MÉTODOS QUE USAN ESTA FUNCIÓN: <br>
	 * - addDireccionesACiudades() [YA NO SE USA]
	 * 
	 * @param listaCiudades
	 * @return
	 */
	public List<Ciudad> eliminarCiudadesSinDirecciones (List<Ciudad> listaCiudades) {
		
		Iterator<Ciudad> it = listaCiudades.iterator();
		
		while (it.hasNext()) {
			
			Ciudad ciudad = it.next();
			
			if (ciudad.getListaDirecciones().size() == 0) {
				it.remove();
			}
		}
		
		
		return (listaCiudades);
	}

	
	
	/* ------------ Función imprimirCiudadesEnArchivo () ------------ */
	/**
	 * Método que imprime en un archivo nuevo dentro de "files" 
	 * (se borra y se crea de nuevo si existe el archivo)
	 * la lista de Ciudades junto con sus Direcciones.
	 * 
	 */
	public void imprimirCiudadesEnArchivo () {
		
		File fichero = new File ("././files/datosCiudades.txt");
		List<Ciudad> listaCiudades = addDireccionesACiudades(agruparDireccionesPorCiudad());
		
		try {
			fichero.createNewFile();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(fichero);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		PrintWriter printer = new PrintWriter(writer);
		printer.append(SEPARADOR_PAIS + SEPARADOR_PAIS + "\n\n" + "         CIUDADES Y SUS DIRECCIONES\n\n" + SEPARADOR_PAIS); 
		
		
		for (Ciudad c : listaCiudades) {
			printer.append(SEPARADOR_PAIS + "\n" + c.toString() + "\n" + Ciudad.SEPARADOR + "\n\n");
		}
		
		
		printer.close();
		
		
		try {
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	/* %%%%%%%%%%%%%%%%%% MÉTODOS DE PAIS %%%%%%%%%%%%%%%%%% */
	
	/* --------- Función crearListaPaisesVacia () -------- */
	/**
	 * Método que "rescata" los países del archivo "country.txt" de la carpeta 
	 * "files", y devuelve una lista con todas los Países creados (sin ciudades).
	 * 
	 * @return
	 * @throws CiudadException
	 */
	public static List<Pais> crearListaPaisesVacia () throws Exception {
		
		File archivo = new File ("././files/country.txt");
		List<Pais> listaPaises = new ArrayList<>();
		
		
		if (archivo.exists()) {
			
			FileReader fr = null;
			BufferedReader br = null;
			String linea = null;
			
			
			try {
				
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				br.readLine();
				linea = br.readLine();
				
				
				while (linea != null) {
					
					String[] listaElementos = linea.split(",");
					
					int idPais = Integer.valueOf(listaElementos[0]);
					String nombrePais = listaElementos[1];
					
					listaPaises.add(new Pais(idPais, nombrePais));
					
					linea = br.readLine();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}else {
			throw new Exception ("No existe el archivo para cargar los países.");
		}
		
		
		return (listaPaises);
	}

	
	
	//Pon de parámetro de entrada la función "addDireccionesACiudades()", y a ésta, "agruparDireccionesPorCiudad()"

	/* --------- Función agruparCiudadesPorPais () -------- */
	public Map<Integer, List<Ciudad>> agruparCiudadesPorPais (List<Ciudad> listaCiudades) {
		
		Map<Integer, List<Ciudad>> mapaCiudades = new HashMap<>();
		
		
		for (Ciudad ciudad : listaCiudades) {
			
			if (!mapaCiudades.containsKey(ciudad.getIdPais())) {
				mapaCiudades.put(ciudad.getIdPais(), new ArrayList<>());
				mapaCiudades.get(ciudad.getIdPais()).add(ciudad);
			
			}else {
				mapaCiudades.get(ciudad.getIdPais()).add(ciudad);
			}
		}
		
		
		return (mapaCiudades);
	}


	
	/* --------- Función addCiudadesAPaises () -------- */
	/**
	 * Método que introduce las Direcciones del mapa del parámetro de entrada en una lista de Ciudades vacía.
	 * La lista de Ciudades la crea la función "crearListaCiudadesVacia()", que esta función llama. <br> <br>
	 * 
	 * MÉTODOS USADOS EN ESTA FUNCIÓN: <br>
	 * - crearListaCiudadesVacia() <br>
	 * - eliminarCiudadesSinDirecciones()
	 * 
	 * @param mapaDirecciones
	 * @return
	 */
	public List<Pais> addCiudadesAPaises (Map<Integer, List<Ciudad>> mapaCiudades) {
		
		List<Pais> listaPaises = null;
		
		
		try {
			listaPaises = crearListaPaisesVacia();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		for (Pais pais : listaPaises) {
			
			for (Integer i : mapaCiudades.keySet()) {
				
				if (i == pais.getIdPais()) {
					pais.setListaCiudades(mapaCiudades.get(i));
					pais.ordenarCiudadesPorNumeroDirecciones();
				}
			}
		}
		
		
		return (listaPaises);
	}	

}

package ej5_chatInstituto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Persona {

	/* ======================= ATRIBUTOS ======================= */
	private String nombre;
	private String apellidos;
	private LocalDateTime fechaNacimiento;
	private List<Mensaje> buzon;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final int MAYORIA_EDAD = 18;
	private static final String SEPARADOR = "-----------------------------";
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Persona (String nombre, String apellidos, LocalDateTime fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.buzon = new ArrayList<>();
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ---------------- Función enviarMensaje () --------------- */
	public void enviarMensaje (Persona personaAEnviar, Mensaje mensajeAEnviar) throws Exception {
		
		if ((this.getClass().getSimpleName().equalsIgnoreCase("ALUMNO")) 
				&& (this.getEdad() < MAYORIA_EDAD) 
				&& (personaAEnviar.getClass().getSimpleName().equalsIgnoreCase("ALUMNO"))) {
			
			throw new Exception ("Un alumno de menor edad no puede enviar un mensaje a otro alumno.");
		
		}else {
			personaAEnviar.buzon.add(mensajeAEnviar);
		}
		
	}
	
	
	
	/* ---------------- Función leerMensajes () ---------------- */
	public String leerMensajes () throws Exception {
		
		StringBuilder sb = new StringBuilder();

		if (this.buzon.size() == 0) {
			throw new Exception ("No hay ningún mensaje en el buzón.");
		
		}else {			
			
			for (Mensaje mensaje : buzon) {
				sb.append(mensaje.toString() + "\n" + SEPARADOR + "\n");
			}
		}
		
		
		return (sb.toString());
	}
 
	
	
	/* --------- Función leerMensajesAlfabeticamente () -------- */
	public String leerMensajesAlfabeticamente () {
		
		this.buzon.sort(new RemitenteAlfabetico_Comparator());
		String mensajes = "";
		
		try {
			mensajes = leerMensajes();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return (mensajes);
	}
	
	
	
	/* ---------------- Función borrarMensaje () --------------- */
	public void borrarMensaje (int mensajeABorrar) throws Exception {
	
		Iterator<Mensaje> it = buzon.iterator();
		boolean seHaBorrado = false;
		
		
		while(it.hasNext()) {
			
			Mensaje mensaje = it.next();
			
			if (mensaje.getIdMensaje() == mensajeABorrar) {
				it.remove();
				seHaBorrado = true;
			}
		}
		
		
		if (seHaBorrado == false) {
			throw new Exception ("No se ha encontrado un mensaje con ese número.");
		}
	}
	
	
	
	/* -------------- Función encontrarMensaje () -------------- */
	public String encontrarMensaje (String textoABuscar) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		boolean hayMensajes = false;
		
		
		for (Mensaje mensaje : buzon) {
			
			if (buscarPalabra(mensaje.getTexto(), textoABuscar) == true) {
				sb.append(mensaje.toString() + "\n" + SEPARADOR + "\n");
				hayMensajes = true;
			}
		}
		
		
		if (hayMensajes == false) {
			throw new Exception ("No hay ningún mensaje que contenga esa palabra.");
		}
		
		
		return (sb.toString());
	}

	
	
	/* ------------------- Función getEdad () ------------------ */
	public int getEdad () {
		return (LocalDateTime.now().getYear() - this.fechaNacimiento.getYear());
	}

	
	
	/* -------------- Función buscarPalabra () -------------- */
	public boolean buscarPalabra (String cadena, String palabraABuscar) {
		
		boolean encontrada = false;
		int indiceInterno = 0;
		boolean esPalabra = false;
		
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if (cadena.charAt(i) == palabraABuscar.charAt(0)) {
				
				for (int j = 0; j < palabraABuscar.length(); j++) {
					
					if (cadena.length() - i > (palabraABuscar.length() - j)) {
						
						if (cadena.charAt(i + indiceInterno) == palabraABuscar.charAt(j)) {
							esPalabra = true;
							indiceInterno++;
							
						}else {
							esPalabra = false;
							j = palabraABuscar.length();
						}
					}
				}
				
				indiceInterno = 0;
			}
			
			
			if (esPalabra == true) {
				encontrada = true;
				i = cadena.length();
			}
		}
		
		
		return (encontrada);
	}


	
	/* ==================== GETTERS/SETTERS ==================== */
	public String getNombre() {
		return nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}


	public List<Mensaje> getBuzon() {
		return buzon;
	}
	
}

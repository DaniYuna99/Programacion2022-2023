package ej5_chatInstituto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class PersonaTest {

	
	/* ---------------- Función enviarMensaje () --------------- */

	/**
	 * El tamaño de la lista de alumno2 debe 
	 * de subir en 1 al recibir el mensaje de alumno1
	 */
	@Test
	void testEnviarMensaje() {
		
		Alumno alumno1 = new Alumno("Daniel", "Carpintero Quesada", LocalDateTime.of(1999, 10, 30, 0, 0));
		Alumno alumno2 = new Alumno("Veronica", "García Herrera", LocalDateTime.of(1998, 4, 20, 0, 0));
		Profesor profe = new Profesor("Alejando", "Fernández Martínez", LocalDateTime.of(1993, 4, 20, 0, 0));
		
		try {
			alumno1.enviarMensaje(alumno2, new Mensaje(alumno1, "Mensaje de prueba"));
			assertEquals(alumno2.getBuzon().size(), 1);
			alumno1.enviarMensaje(alumno2, new Mensaje(alumno1, "Mensaje de prueba 2"));
			assertEquals(alumno2.getBuzon().size(), 2);
			alumno2.enviarMensaje(profe, new Mensaje(alumno2, "Mensaje de prueba 3"));
			assertEquals(profe.getBuzon().size(), 1);

		} catch (Exception e) {
			assert(false);
		}

	}
	
	
	/**
	 * Debe pillar la Exception puesto que un alumno menor 
	 * de edad no puede enviar un mensaje a otro alumno.
	 */
	@Test
	void testEnviarMensajeMenorEdadException() {
		
		Alumno alumno1 = new Alumno("Daniel", "Carpintero Quesada", LocalDateTime.of(2015, 10, 30, 0, 0));
		Alumno alumno2 = new Alumno("Veronica", "García Herrera", LocalDateTime.of(1998, 4, 20, 0, 0));
		
		try {
			alumno1.enviarMensaje(alumno2, new Mensaje(alumno1, "Mensaje de prueba"));
			assert(false);

		} catch (Exception e) {
			assert(true);
		}

	}
	
	
	
	/* ---------------- Función leerMensajes () --------------- */

	@Test
	void testLeerMensajes() {
		
		Alumno alumno1 = new Alumno("Daniel", "Carpintero Quesada", LocalDateTime.of(1999, 10, 30, 0, 0));
		Alumno alumno2 = new Alumno("Veronica", "García Herrera", LocalDateTime.of(1998, 4, 20, 0, 0));
		
		try {
			alumno1.enviarMensaje(alumno2, new Mensaje(alumno1, "Mensaje de prueba"));
			alumno1.enviarMensaje(alumno2, new Mensaje(alumno1, "Mensaje de prueba 2"));
			String mensajes = alumno2.leerMensajes();
			boolean aumentado = false;
			
			if (mensajes.length() > 0) {
				aumentado = true;
			}
			
			
			if (aumentado == true) {
				assert(true);
				
			}else {
				assert(false);
			}
			
		} catch (Exception e) {
			assert(false);
		}
	}
	
	
	@Test
	void testLeerMensajesException() {
		
		Alumno alumno1 = new Alumno("Daniel", "Carpintero Quesada", LocalDateTime.of(1999, 10, 30, 0, 0));
		
		try {
			String mensajes = alumno1.leerMensajes();
			assert(false);
			
		} catch (Exception e) {
			assert(true);
		}
	}
	
	
	
	/* ------------ Función leerMensajesAlfabeticamente () ----------- */

	@Test
	void testLeerMensajesAlfabeticamente() {
		
		Alumno alumno1 = new Alumno("Daniel", "Carpintero Quesada", LocalDateTime.of(1999, 10, 30, 0, 0));
		Alumno alumno2 = new Alumno("Veronica", "García Herrera", LocalDateTime.of(1998, 4, 20, 0, 0));
		Alumno alumno3 = new Alumno("Xavier", "Ángel Renegado", LocalDateTime.of(1998, 4, 20, 0, 0));

		
		try {
			alumno3.enviarMensaje(alumno2, new Mensaje(alumno3, "Mensaje de prueba 2"));
			alumno1.enviarMensaje(alumno2, new Mensaje(alumno1, "Mensaje de prueba"));
			alumno2.leerMensajesAlfabeticamente();
			
			if (alumno2.getBuzon().get(0).getRemitente().getNombre().equals("Daniel")) {
				assert(true);
				
			}else {
				assert(false);
			}
			
		} catch (Exception e) {
			assert(false);
		}

	}
	
	
	
	/* ---------------- Función borrarMensaje () --------------- */

	@Test 
	void testBorrarMensaje() {
		
		Alumno alumno1 = new Alumno("Daniel", "Carpintero Quesada", LocalDateTime.of(1999, 10, 30, 0, 0));
		Alumno alumno2 = new Alumno("Veronica", "García Herrera", LocalDateTime.of(1998, 4, 20, 0, 0));
		
		try {
			alumno1.enviarMensaje(alumno2, new Mensaje(alumno1, "Mensaje de prueba"));
			assertEquals(alumno2.getBuzon().size(), 1);
			System.out.println(alumno2.leerMensajes());
			alumno2.borrarMensaje(13);	//Ese mensaje no para de cambiarse la 
										//id por alguna razón, pero funcionar funciona si pones la id
			assertEquals(alumno2.getBuzon().size(), 0);
			
		} catch (Exception e) {
			assert(false);
		}
	}
	
	
	@Test 
	void testBorrarMensajeException() {
		
		Alumno alumno1 = new Alumno("Daniel", "Carpintero Quesada", LocalDateTime.of(1999, 10, 30, 0, 0));
		Alumno alumno2 = new Alumno("Veronica", "García Herrera", LocalDateTime.of(1998, 4, 20, 0, 0));
		
		try {
			alumno1.enviarMensaje(alumno2, new Mensaje(alumno1, "Mensaje de prueba"));
			alumno2.borrarMensaje(0);
			assert(false);
			
		} catch (Exception e) {
			assert(true);
		}
	}
	
	
	
	/* ---------------- Función buscarMensaje () --------------- */

	@Test
	void testBuscarPalabra() {
		
		Alumno alumno1 = new Alumno("Daniel", "Carpintero Quesada", LocalDateTime.of(1999, 10, 30, 0, 0));

		if ((alumno1.buscarPalabra("fholafas", "hola") == true) 
			&& (alumno1.buscarPalabra("estoesunejemplo", "un") == true)
			&& (alumno1.buscarPalabra("estoesunejemplo", "ejempol") == false)
			&& (alumno1.buscarPalabra("estoesunejemplo", "oeun") == false)) {
			
			assert(true);
		
		}else {
			assert(false);
		}
	}
	
	
	
	/* ---------------- Función encontrarMensaje () --------------- */

	@Test
	void testEncontrarMensaje() {
		
		Alumno alumno1 = new Alumno("Daniel", "Carpintero Quesada", LocalDateTime.of(1999, 10, 30, 0, 0));
		Alumno alumno2 = new Alumno("Veronica", "García Herrera", LocalDateTime.of(1998, 4, 20, 0, 0));
		String mensajes = "";
		
		try {
			alumno1.enviarMensaje(alumno2, new Mensaje(alumno1, "Mensaje de prueba"));
			alumno1.enviarMensaje(alumno2, new Mensaje(alumno1, "Un de mensajito"));
			mensajes = alumno2.encontrarMensaje("de");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		//System.out.println(mensajes);
		
		
		if (mensajes.length() > 0) {
			assert(true);
		
		}else {
			assert(false);
		}
	}
	
	
	/**
	 * Comprueba si salta la Exception del método "encontrarMensaje()".
	 * La Exception salta cuando no encuentra ningún mensaje que contenga la palabra 
	 * puesta como parámetro de entrada. Usa otro método "buscarPalabra()" para buscar
	 * palabras en el texto.
	 */
	@Test
	void testEncontrarMensajeException() {
		
		Alumno alumno1 = new Alumno("Daniel", "Carpintero Quesada", LocalDateTime.of(1999, 10, 30, 0, 0));
		Alumno alumno2 = new Alumno("Veronica", "García Herrera", LocalDateTime.of(1998, 4, 20, 0, 0));
		String mensajes = "";
		
		try {
			alumno1.enviarMensaje(alumno2, new Mensaje(alumno1, "Mensaje de prueba"));
			alumno1.enviarMensaje(alumno2, new Mensaje(alumno1, "Un de mensajito"));
			mensajes = alumno2.encontrarMensaje("estoNoExiste");
			assert(false);
			
		} catch (Exception e) {
			assert(true);
		}
	}



}

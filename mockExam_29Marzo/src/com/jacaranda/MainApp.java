package com.jacaranda;

import com.jacaranda.memoryStorage.MemoryStorage;
import com.jacaranda.publicacion.Publicacion;
import com.jacaranda.publicacion.PublicacionException;
import com.jacaranda.publicacion.Tweet;
import com.jacaranda.usuario.Usuario;


public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		MemoryStorage memory = new MemoryStorage();
		
		memory.addUsuario("manzana123", "1111");
		memory.addUsuario("mango456", "2222");
		memory.addUsuario("platano678", "3333");
		
		
		try {
			
			for (int i = 0; i < 10; i++) {
				
				memory.addPublicacion("Esto es un Tweet", "manzana123");
				memory.addPublicacion("Esto es un Post", "manzana123", "TEMA");
				memory.addPublicacion("Esto es una Recomendacion Esto es una Recomendacion Esto es una Recomendacion Esto es una Recomendacion", "manzana123", 3);
				
			}
			
			
			//Método valorar() (funciona, pero el programa no parece que te pida un método para hacerlo correctamente)
			
			/*Usuario u1 = new Usuario("manzana123", "1111");
			Publicacion p1 = new Tweet("Esto es un Tweet", u1);
			p1.valorar("MUYBUENA");
			System.out.println(p1.toString());*/
			
			
		} catch (PublicacionException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		/*PRUEBAS DE MOSTRAR PUBLICACIONES*/ 
		
		//System.out.println(memory.mostrarListaPublicaciones());
		//System.out.println(memory.mostrarPosts());
		//System.out.println(memory.mostrarTweets());
		//System.out.println(memory.mostrarRecomendaciones());
		
	}
	

}

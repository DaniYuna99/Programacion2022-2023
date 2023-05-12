package main.java.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import main.java.model.CasetaFeria;
import main.java.model.Clase;

public class LectorXML {
	
	/*Esto es una clase con métodos estáticos que tratan XML*/
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------- Función cargarCasetasFeria () ------------- */
	/**
	 * Método que recoge la información de cada nodo del archivo XML "casetasferia.xml" 
	 * de la carpeta "files" de este proyecto, y devuelve una lista con objetos CasetaFeria.
	 * 
	 * @param ruta
	 * @return
	 */
	public static List<CasetaFeria> cargarCasetasFeria (String ruta) throws Exception {
		
		List<CasetaFeria> listaCasetas = new ArrayList<>();
		
		File fichero = new File(ruta);
		
		
		if (!fichero.exists()) {
			throw new Exception ("La ruta del fichero donde está el XML no existe.");
		}

		
		try {
			
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document documento = builder.parse(fichero);
			documento.getDocumentElement().normalize();
						
			NodeList hijos = documento.getElementsByTagName("DatosLeidos");

			
			for (int i = 0; i < hijos.getLength(); i++) {
				
				Element hijo = (Element) hijos.item(i);
				
				String titulo = (hijo.getElementsByTagName("TITULO").item(0).getTextContent());
				String calle = (hijo.getElementsByTagName("CALLE").item(0).getTextContent());
				int numero = Integer.valueOf(hijo.getElementsByTagName("NUMERO").item(0).getTextContent());
				int modulos = Integer.valueOf(hijo.getElementsByTagName("MODULOS").item(0).getTextContent());
				Clase clase = Clase.valueOf(hijo.getElementsByTagName("CLASE").item(0).getTextContent());
				int id = Integer.valueOf(hijo.getElementsByTagName("ID").item(0).getTextContent());
				int idCalle = Integer.valueOf(hijo.getElementsByTagName("ID_CALLE").item(0).getTextContent());


				listaCasetas.add(new CasetaFeria (titulo, calle, numero, modulos, clase, id, idCalle));
			}

			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		return (listaCasetas);
	}
	
	
	
	/* ------------- Función escribirCasetas () ------------- */
	/**
	 * Método que imprime en un archivo JSON la lista con objetos CasetaFeria
	 * en el destino que le pases por parámetro.
	 * 
	 * @param listaCasetas
	 * @param destino
	 */
	public static void escribirCasetas (List<CasetaFeria> listaCasetas, String destino) {
		
		File ficheroDestino = new File(destino);
		
		try {
			
			ficheroDestino.createNewFile();
			FileWriter writer = new FileWriter(ficheroDestino);
			
			Gson gson = new GsonBuilder().setPrettyPrinting().enableComplexMapKeySerialization().create();
			gson.toJson(listaCasetas, writer);
			
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

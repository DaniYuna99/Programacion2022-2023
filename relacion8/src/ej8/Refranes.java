package ej8;

import java.util.Arrays;

public class Refranes {
	
	/* ======================= ATRIBUTOS ======================= */
	private Refran[] refranes;
	private int indiceRefranes;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Refranes () {
		this.refranes = new Refran[50];
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/*NO FUNCIONA*/
	/* ------- Función listarRefranesAlfabeticamente () ------- */
	public String listarRefranesAlfabeticamente () {
		
		StringBuilder sb = new StringBuilder();
		
		Refran[] refranesOrdenados = this.refranes;
		Arrays.sort(refranesOrdenados);
		
		
		for (Refran refran : refranesOrdenados) {
			sb.append("'" + refran.getTexto() + "'\n");
		}
		
		
		return (sb.toString());
	}
	
	
	
	/* ------- Función guardarRefran () ------- */
	public boolean guardarRefran (Refran refranAInsertar) {
		
		boolean isInserted = false;
		boolean encontrado = false;
		
		
		for (Refran refran : this.refranes) {
			
			if (refran != null) {
				
				if (refran.getTexto().equals(refranAInsertar.getTexto())) {
					encontrado = true;
				}
			}
		}
		
		
		if (encontrado == false) {
			this.refranes[indiceRefranes] = refranAInsertar;
			indiceRefranes++;
			isInserted = true;
		}
		
		
		return (isInserted);
	}
	
	
	
	/* ------- Función buscarRefran () ------- */
	public boolean buscarRefran (String palabraABuscar) {
		
		boolean encontrado = false;
		
		
		for (Refran refran : this.refranes) {
			
			if (refran != null) {
				
				if (buscarPalabra(refran, palabraABuscar) == true) {
					System.out.println(refran.toString());
					encontrado = true;
				}
			}
		}
		
		
		return (encontrado);
	}
	
	
	
	/* ------- Función buscarPalabra () ------- */
	public boolean buscarPalabra (Refran refranABuscar, String palabraABuscar) {
		
		boolean esLaPalabra = false;
		boolean esLaLetra = false;
		int indiceTexto = 0;
		
		
		for (int i = 0; i < refranABuscar.getTexto().length(); i++) {
			
			for (int j = 0; j < palabraABuscar.length(); j++) {
				
				if (refranABuscar.getTexto().charAt(i + indiceTexto) == palabraABuscar.charAt(j)) {
					esLaLetra = true;
					
				}else {
					esLaLetra = false;
					j = palabraABuscar.length();
				}
				
				indiceTexto++;
			}
			
			
			indiceTexto = 0;
			
			
			if (esLaLetra == true) {
				esLaPalabra = true;
			}
		}
		
		
		return (esLaPalabra);
	}

	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public Refran[] getRefranes() {
		return refranes;
	}

	public void setRefranes(Refran[] refranes) {
		this.refranes = refranes;
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override 
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Refran refran : this.refranes) {
			
			if (refran != null) {
				sb.append("'" + refran.getTexto() + "'\n");
			}
		}
		
		return (sb.toString());
	}
}















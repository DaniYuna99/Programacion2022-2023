package ej7_almacen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Caja {

	/* ======================= ATRIBUTOS ======================= */
	private int numCaja;
	private boolean abierta;
	private List<Cliente> clientes;
	
	
	/* /\/\/\/\ ESTÁTICOS /\/\/\/\ */
	private static int NUMERO_CAJA = 1;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Caja () {
		this.numCaja = NUMERO_CAJA++;
		this.abierta = true;
		this.clientes = new ArrayList<>();
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* --------------- Función abrir () -------------- */
	public void abrir () {
		this.abierta = true;
	}
	
	
	
	/* -------------- Función cerrar () -------------- */
	public void cerrar () {
		this.abierta = false;
	}
	
	
	
	/* --------- Función insertarCliente () ---------- */
	public void insertarCliente (Cliente cliente) {
		clientes.add(cliente);
	}
	
	
	
	/* --------- Función borrarCliente () ---------- */
	
	/**
	 * Método que usa la clase Almacen, que tiene una lista de Cajas, 
	 * para borrar el primer cliente de la lista "clientes" de Caja.\n\n
	 * 
	 * Devuelve el número del cliente borrado, para que el método de Almacen
	 * "atenderCliente()" informe del número de cliente que se ha borrado. 
	 * Si no encuentra un cliente porque el número no existe, devolverá un -1
	 * @return
	 */
	public int borrarCliente () {
		
		Iterator<Cliente> it = clientes.iterator();
		boolean borrado = false;
		int numClienteBorrado = -1;
		
		
		if (it.hasNext()) {
			
			Cliente cliente = it.next();
			numClienteBorrado = cliente.getNumCliente();
			
			if (borrado == false) {
				it.remove();
				borrado = true;
			}
		}
		
		
		return (numClienteBorrado);
	}
	
	
	
	/* =================== GETTERS / SETTERS =================== */
	public int getNumCaja() {
		return numCaja;
	}
	
	
	public boolean isAbierta() {
		return abierta;
	}
	
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	
	
	/* ===================== HASH CODE() ======================= */

	/* ===================== COMPARE TO() ====================== */
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString () {
		return "\nCaja número " + numCaja + "\n"
				+ "Abierta: " + abierta + "\n"
				+ "Clientes : " + clientes.toString() + "\n" + "--------------";
	}

}

package ej7_almacen;

import java.util.ArrayList;

public class Almacen {

	/* ======================= ATRIBUTOS ======================= */
	private ArrayList<Caja> cajas;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final int MAXIMO_CAJAS = 20;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Almacen () {
		
		this.cajas = new ArrayList<>();
		
		for (int i = 0; i < MAXIMO_CAJAS; i++) {
			cajas.add(new Caja());
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función abrirCaja () ------------ */
	public void abrirCaja (int numCaja) throws AlmacenException {
		
		if ((numCaja <= 0) || (numCaja > MAXIMO_CAJAS)) {
			throw new AlmacenException ("No existe una caja con tal número.");
		
		}else if (cajas.get(numCaja - 1).isAbierta()) {
			throw new AlmacenException ("La caja ya estaba abierta.");
		
		}else if (cajas.get(numCaja - 1).isAbierta() == false){
			cajas.get(numCaja - 1).abrir();
		}
	}
	
	
	
	/* ------------ Función cerrarCaja () ------------ */
	public void cerrarCaja (int numCaja) throws AlmacenException {
		
		if ((numCaja <= 0) || (numCaja > MAXIMO_CAJAS)) {
			throw new AlmacenException ("No existe una caja con tal número.");
		
		}else if (cajas.get(numCaja - 1).isAbierta() == false) {
			throw new AlmacenException ("La caja ya estaba cerrada.");
		
		}else if (cajas.get(numCaja - 1).getClientes().size() != 0) {
			throw new AlmacenException ("La caja tiene clientes pendientes de pago; no se puede cerrar.");
		
		}else if (cajas.get(numCaja - 1).isAbierta() 
				&& (cajas.get(numCaja - 1).getClientes().size() == 0)) {
			cajas.get(numCaja - 1).cerrar();
		}
	}

	
	/* ------------ Función addCliente () ------------ */
	public String addCliente () {
		
		Cliente cliente = new Cliente();
		Caja cajaMenosClientes = null;
		int indiceCaja = -1;
		int indiceCajaMenosClientes = 0;

		/*Para tener una Caja de referencia para el siguiente For, 
		porque antes yo asignaba la Caja de la primera posición, pero 
		si está cerrada, el punto de referencia no es válido*/
		for (int i = 0; i < cajas.size(); i++) {
			
			indiceCaja++;
			
			if (cajas.get(i).isAbierta()) {
				cajaMenosClientes = cajas.get(i);
				i = cajas.size();
				indiceCajaMenosClientes = indiceCaja;
			}
		}
		
		
		indiceCaja = -1;
		
		/*Bucle For que "recoge" la caja que menos clientes 
		 * tiene usando la Caja de la variable "cajaMenosClientes" 
		 * que se asignó en el bucle For de arriba*/
		for (Caja caja : cajas) {
			
			indiceCaja++;
			
			if ((caja.getClientes().size() < cajaMenosClientes.getClientes().size()) 
					&& (caja.isAbierta())) {
				cajaMenosClientes = caja;
				indiceCajaMenosClientes = indiceCaja;
			}
		}
		
		
		if (cajaMenosClientes.isAbierta()) {
			cajas.get(indiceCajaMenosClientes).insertarCliente(cliente);	
		}
		
		
		return ("Es usted el cliente número " + cliente.getNumCliente() 
				+ " y debe ir a la caja número " + cajaMenosClientes.getNumCaja() + ".");
	}
	
	
	
	/* ------------ Función atenderCliente () ------------ */
	public String atenderCliente (int numCaja) throws AlmacenException {
		
		StringBuilder sb = new StringBuilder("No hay clientes en esa caja.");
		
		
		if ((numCaja > 0) && (numCaja <= MAXIMO_CAJAS)) {
			
			Caja cajaQueAtender = cajas.get(numCaja - 1);
			int numClienteBorrado = cajaQueAtender.borrarCliente();
			
			
			if (numClienteBorrado != -1) {
				sb.delete(0, sb.toString().length());
				sb.append("Se ha atendido al cliente con número " + numClienteBorrado
						+ ". El cliente abandona la caja.");
			}
		
		}else {
			throw new AlmacenException ("No hay ninguna caja con ese número.");
		}
		
		
		return (sb.toString());
	}
	
	
	
	/* =================== GETTERS / SETTERS =================== */
	
	/* ======================= EQUALS() ======================== */
	
	/* ===================== HASH CODE() ======================= */

	/* ===================== COMPARE TO() ====================== */
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return cajas.toString();
	}

}

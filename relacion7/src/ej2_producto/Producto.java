package ej2_producto;

public class Producto {

	/* ======================= ATRIBUTOS ======================= */
	private static int codigo;
	private String descripcion;
	private double precioSinIVA;
	private static double IVA = 20.0;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Producto() {}
	
	
	public Producto(String descripcion, double precioSinIVA) {
		codigo++;
		this.descripcion = descripcion;
		this.precioSinIVA = precioSinIVA;
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ---------- Función modificarProducto [SOBRECARGADO] () ---------- */
	public boolean modificarProducto(String descripcion) {
		this.descripcion = descripcion;
		return true;
	}
	
	
	public boolean modificarProducto(double precioSinIVA) {
		
		boolean seHaModificado = false;
		
		if (precioSinIVA > 0) {
			this.precioSinIVA = precioSinIVA;
			seHaModificado = true;
		}
		
		
		return seHaModificado;
	}
	
	
	public boolean modificarProducto(String descripcion, double precioSinIVA) {
		
		boolean seHaModificado = false;
		
		if (precioSinIVA > 0) {
			this.precioSinIVA = precioSinIVA;
			this.descripcion = descripcion;
			seHaModificado = true;
		}
		
		
		return seHaModificado;
	}
	
	
	/* ---------- Función calcularPrecioConIVA () ---------- */
	public double calcularPrecioConIVA() {
		return (this.precioSinIVA * (1 - (IVA / 100)));
	}
	
	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public int getCodigo() {
		return codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecioSinIVA() {
		return precioSinIVA;
	}


	public void setPrecioSinIVA(double precioSinIVA) {
		this.precioSinIVA = precioSinIVA;
	}


	public static double getIVA() {
		return IVA;
	}


	public static void setIVA(double iVA) {
		IVA = iVA;
	}


	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return "Producto con código "+ codigo + " cuesta " + precioSinIVA 
				+ " euros sin IVA, y tiene de descripción:\n" + "  " + descripcion + ".";
	}
}

package elementos;

import java.util.Objects;

public class Element {

	/* ======================= ATRIBUTOS ======================= */
	private ElementType tipoElemento;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Element (ElementType tipoElemento) throws ElementException {
		
		if (tipoElemento != null) {
			this.tipoElemento = tipoElemento;
			
		}else {
			throw new ElementException ("El tipo de elemento tiene valor nulo.");
		}
	}

	

	/* ==================== GETTERS/SETTERS ==================== */
	public ElementType getType() {
		return tipoElemento;
	}
	
	
	
	/* ===================== HASH CODE() ======================= */
	@Override
	public int hashCode() {
		return Objects.hash(tipoElemento);
	}
	
	
	
	/* ======================= EQUALS() ======================== */
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
		
		if ((sonIguales == false) && (obj != null) && (obj instanceof Element)) {
			
			Element otro = (Element) obj;
			
			if (this.tipoElemento.equals(otro.tipoElemento)) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " de tipo " + tipoElemento.toString();
	}
}

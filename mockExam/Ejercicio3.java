package mockExam;

public class Ejercicio3 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*Un teclado electrónico emite una de las siete notas 
		 * musicales cada vez que se pulsa la tecla adecuada. 
		 * Al pulsar cada tecla el instrumento calcula la frecuencia 
		 * en Hercios (Hz) de la nota asociada y emite el sonido 
		 * correspondiente. Los valores de cada nota son los siguientes:
		 * 
Nota			 DO			RE			MI			FA			SOL			LA			SI
Frecuencia(Hz) 523,25	  587,33	  659,26	  698,46	  783,99	    880		  987,77

		- Elabora una función que reciba el string de la tecla que se 
		ha pulsado en mayúsculas o minúsculas (do, re, mi, etc.) y 
		devuelva la frecuencia que le corresponde. Por ejemplo, si 
		se pulsa la tecla Mi devuelve 659,26.
		
		- Amplía la función anterior para que además de la nota, reciba 
		un parámetro de tipo boolean de forma que si se pasa un valor 
		true es que se ha pulsado la que es de tipo sostenido, en cuyo 
		caso la frecuencia será la original por 1,03 y si recibe false, 
		deberá devolver la frecuencia según la tabla anterior. Por ejemplo, 
		Mi sostenido (Mi#) = 659,26 * 1,03 = 685,63, Mi normal = 659,26*/
		
		
		System.out.println(mostrarFrecuenciaNota("do", true));
		System.out.println(mostrarFrecuenciaNota("do", false));
		
		System.out.println(mostrarFrecuenciaNota("mi", true));
		System.out.println(mostrarFrecuenciaNota("mi", false));
		
		System.out.println(mostrarFrecuenciaNota(null, true));
		System.out.println(mostrarFrecuenciaNota("ii", false));

	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ================ Función mostrarFrecuenciaNota () ================ */
	public static String mostrarFrecuenciaNota (String nota, Boolean sostenido) {
		
		StringBuilder frecuenciaNota = new StringBuilder();
		
		
		if (nota != null && !nota.isEmpty() && sostenido != null) {
			
			nota = nota.toUpperCase();
			
			
			//----- boolean sostenido es false -----
			if (sostenido == false) {
				
				if (nota.equals("DO")) {
					frecuenciaNota.append("523,25 Hz");
					
				}else if (nota.equals("RE")) {
					frecuenciaNota.append("587,33 Hz");
					
				}else if (nota.equals("MI")) {
					frecuenciaNota.append("659,26 Hz");
					
				}else if (nota.equals("FA")) {
					frecuenciaNota.append("698,46 Hz");
					
				}else if (nota.equals("SOL")) {
					frecuenciaNota.append("783,99 Hz");
					
				}else if (nota.equals("LA")) {
					frecuenciaNota.append("880 Hz");
					
				}else if (nota.equals("SI")) {
					frecuenciaNota.append("987,77 Hz");
					
				}else {
					frecuenciaNota.append("Te has equivocado al introducir la nota.");
					
				}
				
				
			//----- boolean sostenido es true -----	
			}else {
				
				if (nota.equals("DO")) {
					frecuenciaNota.append(String.valueOf(523.25 * 1.03) + " Hz");
					
				}else if (nota.equals("RE")) {
					frecuenciaNota.append(String.valueOf(587.33 * 1.03) + " Hz");
					
				}else if (nota.equals("MI")) {
					frecuenciaNota.append(String.valueOf(659.26 * 1.03) + " Hz");
					
				}else if (nota.equals("FA")) {
					frecuenciaNota.append(String.valueOf(698.46 * 1.03) + " Hz");
					
				}else if (nota.equals("SOL")) {
					frecuenciaNota.append(String.valueOf(783.99 * 1.03) + " Hz");
					
				}else if (nota.equals("LA")) {
					frecuenciaNota.append(String.valueOf(880 * 1.03) + " Hz");
					
				}else if (nota.equals("SI")) {
					frecuenciaNota.append(String.valueOf(987.77 * 1.03) + " Hz");
					
				}else {
					frecuenciaNota.append("Te has equivocado al introducir la nota.");
					
				}
			}
			
			
		//si hay un valor null en el String nota	
		}else {
			frecuenciaNota.append("La nota tiene el valor null. No es válido.");
			
		}
		
		
		return (frecuenciaNota.toString());
	}
}


















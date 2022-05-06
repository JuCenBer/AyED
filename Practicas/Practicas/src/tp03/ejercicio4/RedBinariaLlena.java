package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {
	ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(); 
	
	
	private int recorridoRetardoReenvio(ArbolBinario<Integer> dato) {
		int retardo = -1;
		if(dato.esHoja()) {
			return dato.getDato();
		}
		else {
			if(dato.tieneHijoIzquierdo()) {
				retardo = Math.max(retardo, recorridoRetardoReenvio(dato.getHijoDerecho()));
			}
			if(dato.tieneHijoDerecho()) {
				retardo = Math.max(retardo, recorridoRetardoReenvio(dato.getHijoDerecho()));
			}			
		}
		return retardo + dato.getDato();
	}
	
	public int retardoReenvio() {
		int retardo = 0;
		retardo = recorridoRetardoReenvio(arbol);
		return retardo;
	}

}

package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class ColaGenerica <T> {
	private ListaEnlazadaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	public void encolar(T elem) {
		datos.agregarFinal(elem);
	}
	
	public T desencolar() {
		T elem = datos.elemento(1);
		datos.eliminarEn(1);
		return elem;
	}
	
	public T tope() {
		return datos.elemento(1);
	}
	
	public boolean esVacia() {
		return this.datos.esVacia();
	}
}

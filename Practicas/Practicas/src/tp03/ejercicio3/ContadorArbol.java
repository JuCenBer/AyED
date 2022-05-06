package tp03.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ContadorArbol {
	ArbolBinario<Integer> dato = new ArbolBinario<Integer>();
	
	public void setDato(ArbolBinario<Integer> arbol) {
		this.dato = arbol;
	}
	
	private void recorridoParesInOrden(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> arbol) {
		if(arbol.tieneHijoIzquierdo()) {
			this.recorridoParesInOrden(lista, arbol.getHijoIzquierdo());
		}
		if(arbol.getDato() % 2 == 0) {
			lista.agregarFinal(arbol.getDato());
		}
		if(arbol.tieneHijoDerecho()) {
			recorridoParesInOrden(lista, arbol.getHijoDerecho());
		}
	}
	
	public ListaEnlazadaGenerica<Integer> numerosParesInOrden(){
		ListaEnlazadaGenerica <Integer> lista = new ListaEnlazadaGenerica<Integer>();
		recorridoParesInOrden(lista, dato);
		return lista;
	}
	
	
	private void recorridoParesPostOrden(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> arbol) {
		if(arbol.tieneHijoIzquierdo()) {
			this.recorridoParesPostOrden(lista, arbol.getHijoIzquierdo());
		}
		if(arbol.tieneHijoDerecho()) {
			this.recorridoParesPostOrden(lista, arbol.getHijoDerecho());
		}
		if(arbol.getDato() % 2 == 0) {
			lista.agregarFinal(arbol.getDato());
		}
	}
	public ListaEnlazadaGenerica<Integer> numerosParesPostOrden(){
		ListaEnlazadaGenerica <Integer> lista = new ListaEnlazadaGenerica<Integer>();
		recorridoParesPostOrden(lista, dato);
		return lista;
	}
}


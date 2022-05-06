package tp03.ejercicio5;

import tp02.ejercicio3.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ProfundidadDeArbolBinario {
	ArbolBinario<Integer> dato = new ArbolBinario<Integer>();
	
	public void setDato(ArbolBinario<Integer>dato) {
		this.dato = dato;
	}
	
	public int sumaElementosProfundidad(int p) {
		int suma = 0;
		ArbolBinario<Integer> arbol = new ArbolBinario<Integer>();
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		int nivel = 0;
		cola.encolar(dato);
		cola.encolar(null);
		
		while(!cola.esVacia()) {
			arbol = cola.desencolar();
			if(arbol != null) {
				if(nivel == p) {
					while(arbol != null) {
						suma += arbol.getDato();
						arbol = cola.desencolar();
					}
					System.out.println("La suma de los elementos en el nivel " + p + " es: "+ suma);
				}
				else {
					if(arbol.tieneHijoIzquierdo()) {
						cola.encolar(arbol.getHijoIzquierdo());
					}
					if(arbol.tieneHijoDerecho()) {
						cola.encolar(arbol.getHijoDerecho());
					}
				}
				
			}
			else {
				cola.encolar(null);
				nivel++;
			}
		}
		return suma;
	}
}

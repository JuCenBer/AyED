package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	
	public Integer altura() {
		int altura = 0;
		ListaGenerica<ArbolGeneral<T>> listaHijos = this.getHijos();
		if(this.esHoja()) return 0;
		else {
			listaHijos.comenzar();
			while(!listaHijos.fin()) {
				altura = Math.max(altura, listaHijos.proximo().altura());
			}
		}
		return altura + 1;
	}

	public Integer nivel(T dato) {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		Integer nivel = 0;
		ArbolGeneral<T> aux;
		cola.encolar(this);
		cola.encolar(null);
		
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(aux != null) {
				if(aux.getDato() == dato) {
					return nivel;
				}
				else {
					ListaGenerica<ArbolGeneral<T>> lista = aux.getHijos();
					lista.comenzar();
					while(!lista.fin()) {
						cola.encolar(lista.proximo());
					}					
				}
			}
			else if(!cola.esVacia()) {
				nivel++;
				cola.encolar(null);					
			}
		}
		return -1; //-1 indica que no se encontro el elemento en el arbol
	}

	public Integer ancho() {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		Integer maxAncho = 0;
		Integer ancho = 0;
		ArbolGeneral<T> aux;
		cola.encolar(this);
		cola.encolar(null);
		
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(aux != null) {
				ancho++;
				ListaGenerica<ArbolGeneral<T>> lista = aux.getHijos();
				lista.comenzar();
				while(!lista.fin()) {
					cola.encolar(lista.proximo());					
				}
			}
			else if(!cola.esVacia()) {
				if(ancho > maxAncho) maxAncho = ancho;
				ancho = 0;
				cola.encolar(null);					
			}
		}
		return ancho;
	}
		
	private void esAncestro(T a, T b, ListaGenerica<T> lista, ListaGenerica<T> camino) {
		lista.agregarFinal(this.getDato());
		if(this.getDato() == b) {
			lista.comenzar();
			camino.comenzar();
			while(!lista.fin()) {
				camino.agregarFinal(lista.proximo());
			}
		}
		else {
			ListaGenerica<ArbolGeneral<T>> listaHijos = this.getHijos();
			listaHijos.comenzar();
			while(!listaHijos.fin()) {
				listaHijos.proximo().esAncestro(a,b,lista,camino);
				lista.eliminarEn(lista.tamanio());
			}
		}
	}
	
	public Boolean esAncestro(T a, T b) {
		ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
		ListaGenerica<T> camino = new ListaEnlazadaGenerica<T>();
		lista.agregarInicio(this.getDato());
		esAncestro(a,b,lista,camino);
		if((camino.incluye(a)) && (camino.incluye(b))) {
			return true;
		}else
			return false;
	}

}
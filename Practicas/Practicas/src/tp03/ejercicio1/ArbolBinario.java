package tp03.ejercicio1;

import tp02.ejercicio3.ColaGenerica;
import tp02.ejercicio3.PilaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		int n = 0;
		if (this.esHoja()){
			return 1;
		}
		else {
			if(this.tieneHijoIzquierdo()) {
				n += this.getHijoIzquierdo().contarHojas();
			}
			if(this.tieneHijoDerecho()) {
				n += this.getHijoDerecho().contarHojas();
			}
		}
		return n;
	}
	

    public ArbolBinario<T> espejo() {
    	ArbolBinario<T> arbolEspejo = new ArbolBinario<T>();
    	arbolEspejo.setDato(this.getDato());
		if(!(this.esHoja())) {
			if(this.tieneHijoIzquierdo()) {
				arbolEspejo.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
			}
			if(this.tieneHijoDerecho()){
				arbolEspejo.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
			}
		}
		return arbolEspejo;			
	}

    
	public void entreNiveles(int n, int m){
		int nivel = 0;
		ColaGenerica <ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		ArbolBinario<T> arbol = new ArbolBinario<T>();
		cola.encolar(this);//Se utilizara para ir almacenando los nodos e ir delimitando los niveles
		cola.encolar(null); //marca de fin de nivel 
		
		while((nivel <= m) && !(cola.esVacia())) {
			arbol = cola.desencolar();
			if(arbol != null) {
				if(nivel >= n) {
					System.out.println(arbol.getDato() + " ");
				}
				if (arbol.tieneHijoDerecho()) {
					cola.encolar(arbol.getHijoDerecho());
				}
				if(arbol.tieneHijoIzquierdo()) {
					cola.encolar(arbol.getHijoIzquierdo());
				}
			}
			else if(!cola.esVacia()){
				cola.encolar(null);
				if(nivel ++ >= n){
					System.out.println(" ");
				}
			}
		}
	}

	

}

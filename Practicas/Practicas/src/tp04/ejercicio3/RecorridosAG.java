package tp04.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;
import tp04.ejercicio1.ArbolGeneral;


public class RecorridosAG {
	
	private static void preOrden(ArbolGeneral<Integer> a,Integer n, ListaGenerica<Integer> lista) {
		if(a.getDato() > n) lista.agregarFinal(a.getDato());
		ListaGenerica<ArbolGeneral<Integer>> listaHijos = a.getHijos();
		listaHijos.comenzar();
		while(!listaHijos.fin()) {
			preOrden(listaHijos.proximo(), n, lista);
		}
	}
	
	public static ListaGenerica<Integer> numerosImparesMayoresQuePreOrden(ArbolGeneral <Integer> a, Integer n){
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		preOrden(a, n, lista);
		return lista;
	}
	
	private static void inOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> lista) {
		ListaGenerica<ArbolGeneral<Integer>> listaHijos = a.getHijos();
		listaHijos.comenzar();
		if(!listaHijos.fin()) inOrden(listaHijos.proximo(),n,lista);
		if(a.getDato() > n) lista.agregarFinal(a.getDato());
		while(! listaHijos.fin()) {
			inOrden(listaHijos.proximo(),n,lista);
		}
	}
	
	public static ListaGenerica<Integer> numerosImparesMayoresQueInOrden(ArbolGeneral <Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		inOrden(a, n, lista);
		return lista;
	}
	
	private static void postOrden(ArbolGeneral<Integer> a, Integer n, ListaGenerica<Integer> lista) {
		ListaGenerica<ArbolGeneral<Integer>> listaHijos = a.getHijos();
		listaHijos.comenzar();
		while(!listaHijos.fin()) {
			postOrden(listaHijos.proximo(),n,lista);
		}
		if(a.getDato() > n) lista.agregarFinal(a.getDato());
	}
	
	public static ListaGenerica<Integer> numerosImparesMayoresQuePostOrden(ArbolGeneral <Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		postOrden(a, n, lista);
		return lista;
	}
	
	public static ListaGenerica<Integer> numerosImparesMayoresQuePorNiveles(ArbolGeneral <Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer> aux;
		cola.encolar(a);
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(aux.getDato() > n) lista.agregarFinal(aux.getDato());
			ListaGenerica <ArbolGeneral<Integer>>listaHijos = aux.getHijos();
			listaHijos.comenzar();
			while(!listaHijos.fin()) {
				cola.encolar(listaHijos.proximo());
			}
		}
		return lista;
	}
}

package tp03.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class TestContadorArbol {
	public static void main(String[] args) {
		ArbolBinario<Integer> a1 = new ArbolBinario<Integer>();
		ArbolBinario<Integer> a2 = new ArbolBinario<Integer>();
		ArbolBinario<Integer> a3 = new ArbolBinario<Integer>();
		ArbolBinario<Integer> a4 = new ArbolBinario<Integer>();
		ArbolBinario<Integer> a5 = new ArbolBinario<Integer>();
		ArbolBinario<Integer> a6 = new ArbolBinario<Integer>();
		ArbolBinario<Integer> a7 = new ArbolBinario<Integer>();
		ArbolBinario<Integer> a8 = new ArbolBinario<Integer>();
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		a1.setDato(1);
		a2.setDato(22);
		a3.setDato(14);
		a4.setDato(420);
		a5.setDato(15);
		a6.setDato(67);
		a7.setDato(78);
		a8.setDato(133);
		
		a3.agregarHijoIzquierdo(a1);
		
		a5.agregarHijoIzquierdo(a3);
		a5.agregarHijoDerecho(a2);
		
		a4.agregarHijoIzquierdo(a8);
		
		a7.agregarHijoDerecho(a4);
		
		a6.agregarHijoDerecho(a7);
		a6.agregarHijoIzquierdo(a5);
		
		ContadorArbol contador = new ContadorArbol();
		contador.setDato(a6);
		lista = contador.numerosParesInOrden();
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo() + " ");
		}
		
		System.out.println("-----------------------------");
		lista = new ListaEnlazadaGenerica<Integer>();
		
		lista = contador.numerosParesPostOrden();
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo() + " ");
		}
	}
}

package tp02.ejercicio1_6;

import java.util.Scanner;

import tp02.ejercicio1.*;

public class Sucesion {
	
	static ListaDeEnterosEnlazada calcularSucesion(int n) {
		ListaDeEnterosEnlazada lista;
		if(n == 1) 
			lista = new ListaDeEnterosEnlazada();
		
		else {
			if(n % 2 == 0) {
				lista = calcularSucesion(n/2);
			}
			else {
				lista = calcularSucesion(3*n+1);
			}	
		}
		lista.agregarInicio(n);
		return lista;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int n = s.nextInt();
		ListaDeEnterosEnlazada l = Sucesion.calcularSucesion(n);
		l.comenzar();
		while(! l.fin()) {
			System.out.println(l.proximo() + " ");
		}
	}
}

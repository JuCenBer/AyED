package tp02.ejercicio4;

import java.util.Scanner;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio3.PilaGenerica;

public class TestBalanceo {
	public static boolean estaBalanceado(String str) {
		ListaEnlazadaGenerica <Character> apertura = new ListaEnlazadaGenerica<Character>();
		ListaEnlazadaGenerica <Character> cierre = new ListaEnlazadaGenerica<Character>();
		
		apertura.agregarFinal('(');
		apertura.agregarFinal('[');
		apertura.agregarFinal('{');
		
		cierre.agregarFinal(')');
		cierre.agregarFinal(']');
		cierre.agregarFinal('}');
		
		PilaGenerica <Character> pila = new PilaGenerica <Character>();
		
		Character act, ant;
		for (int i = 0; i < str.length(); i++) {
			act = str.charAt(i);
			if(apertura.incluye(act)) {
				pila.apilar(act);
			}
			else {
				if(cierre.incluye(act) && !(pila.esVacia())){
					ant = pila.desapilar();
					if(!((ant.equals('(') && (act.equals(')'))) || (ant.equals('[') && (act.equals(']'))) || (ant.equals('{') && (act.equals('}'))))) {
						return false;
					}
				}
				else {
					return false;
				}
			}
		}
		
		if(pila.esVacia()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese una cadena que contenga los caracteres (,),[,],{,}: ");
		String str = s.nextLine();
		
		if(TestBalanceo.estaBalanceado(str)) {
			System.out.println("La cadena esta balanceada");
		}
		else {
			System.out.println("La cadena NO esta balanceada");
		}
	}
}

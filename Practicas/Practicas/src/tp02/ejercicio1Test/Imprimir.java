package tp02.ejercicio1Test;
import tp02.ejercicio1.*;

public class Imprimir {

	
	static void imprimirElementosRecursivo(ListaDeEnterosEnlazada lista){
		if (!lista.fin()) {
			int n = lista.proximo();
			imprimirElementosRecursivo(lista);
			System.out.println(n + " ");
		}
	}
	
	static void imprimirElementos(ListaDeEnterosEnlazada lista) {
		lista.comenzar();
		imprimirElementosRecursivo(lista);
	}
	
	
	static void imprimirElementosRecursivo(ListaDeEnterosConArreglos lista){
		if (!lista.fin()) {
			int n = lista.proximo();
			imprimirElementosRecursivo(lista);
			System.out.println(n + " ");			
		}
	}
	
	static void imprimirElementos(ListaDeEnterosConArreglos lista) {
		lista.comenzar();
		imprimirElementosRecursivo(lista);
	}
}

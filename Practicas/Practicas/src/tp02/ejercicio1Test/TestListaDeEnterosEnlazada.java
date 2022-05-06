package tp02.ejercicio1Test;
import tp02.ejercicio1.*;

public class TestListaDeEnterosEnlazada {
	public static void main(String[] args) {
		int v[] = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			v[i] = Integer.valueOf(args[i]);
		}
		
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		for(int i = 0; i< v.length; i++) {
			lista.agregarFinal(v[i]);
		}
		
		Imprimir.imprimirElementos(lista);
		for(int i = 1; i <= lista.tamanio(); i++) {
			System.out.println(lista.elemento(i));
		}
	}
}

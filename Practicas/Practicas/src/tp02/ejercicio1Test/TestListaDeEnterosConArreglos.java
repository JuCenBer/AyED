package tp02.ejercicio1Test;
import tp02.ejercicio1.*;

public class TestListaDeEnterosConArreglos {
	
	public static void main(String[] args) {
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		
		int v[] = new int[args.length];	
		
		for (int i = 0; i < args.length; i++) {
			v[i] = Integer.valueOf(args[i]);
		}
		for (int i = 0; i < v.length; i++) {
			lista.agregarFinal(v[i]);
		}
		
		Imprimir.imprimirElementos(lista);
		for (int i = 1; i <= lista.tamanio(); i++) {
			System.out.println(lista.elemento(i));
		}
	}

}

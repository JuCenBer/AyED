package tp1.ejercicio2;


public class ejercicio2 {
	
	public static int[] generarArreglo(int n) {
		
		int arreglo[] = new int[n];
		for (int i = 1; i <= n; i++) {
			arreglo[i-1] = i*n;				
		}
		return arreglo;
	}
}

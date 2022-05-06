package tp1.ejercicio2;

import java.util.Scanner;

public class Ejercicio2Main {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = 0;
		int arr[]; 
		System.out.print("Ingrese un numero n: "); 
		n = s.nextInt();
		while(n != 0) {
			arr = ejercicio2.generarArreglo(n);
			for (int i = 0; i < n; i++) {
				System.out.println("arr["+i+"] = "+ arr[i]);				
			}
			System.out.print("Ingrese un numero n: "); n = s.nextInt();
		}
	}
}

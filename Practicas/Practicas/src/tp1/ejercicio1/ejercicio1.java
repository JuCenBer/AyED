package tp1.ejercicio1;

public class ejercicio1 {
	
	public static void imprimirNumerosA(int num1, int num2) {
		for(int i = num1 ; i < num2; i++) {
			System.out.println(i);
		}
	}
	
	public static void imprimirNumerosB(int num1, int num2) {
		while (num1 < num2) {
			System.out.println(num1);
			num1++;
		}
	}
	
	public static void imprimirNumerosC(int num1, int num2) {
		if(num1 < num2) {
			System.out.println(num1);
			num1++;
			imprimirNumerosC(num1, num2);
		}
	}
}

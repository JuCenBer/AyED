package tp1.ejercicio5;

public class Ejercicio5Main {

	
	public static void main(String args[]) {
		Resultado resultado = new Resultado();
		int arreglo[] = new int[10];
		int resultados[] = new int[3];
		arreglo[0] = 14;
		arreglo[1] = 48;
		arreglo[2] = 5;
		arreglo[3] = 99;
		arreglo[4] = 1;
		arreglo[5] = -1;
		arreglo[6] = 69;
		arreglo[7] = 420;
		arreglo[8] = 421;
		arreglo[9] = 419;
		
		resultados = Ejercicio5.calcularMaxMinProm1(arreglo);
		System.out.println("El valor maximo es: " + resultados[0]);
		System.out.println("El valor minimo es: " + resultados[1]);
		System.out.println("El valor promedio es: " + resultados[2] );
		
		System.out.println(" ");
		
		Ejercicio5.calcularMaxMinProm2(arreglo, resultado);
		System.out.println("El valor maximo es: " + resultado.getMax());
		System.out.println("El valor minimo es: " + resultado.getMin());
		System.out.println("El valor promedio es: " + resultado.getProm() );
		
System.out.println(" ");
		
		Ejercicio5.calcularMaxMinProm3(arreglo);
		System.out.println("El valor maximo es: " + Resultado.getMaxs());
		System.out.println("El valor minimo es: " + Resultado.getMins());
		System.out.println("El valor promedio es: " + Resultado.getProms() );
		
	}
}

package tp1.ejercicio5;

public class Ejercicio5 {

	public static int[] calcularMaxMinProm1(int[] arreglo) {
		int resultados[] = new int[3];
		int max = -9999, min = 9999, prom = 0;
		int sum = 0;
		for (int i = 0; i < arreglo.length; i++) {
			sum += arreglo[i];
			if(arreglo[i] < min) min = arreglo[i];
			if(arreglo[i] > max) max = arreglo[i];
		}
		prom = sum / arreglo.length;
		
		resultados[0] = max;
		resultados[1] = min;
		resultados[2] = prom;
		return resultados;
		
	}
	
	public static void calcularMaxMinProm2(int[] arreglo, Resultado resultados) {
		int max = -9999, min = 9999, prom = 0;
		int sum = 0;
		for (int i = 0; i < arreglo.length; i++) {
			sum += arreglo[i];
			if(arreglo[i] < min) min = arreglo[i];
			if(arreglo[i] > max) max = arreglo[i];
		}
		prom = sum / arreglo.length;
		
		resultados.setMax(max);
		resultados.setMin(min);
		resultados.setProm(prom);		
	}
	
	public static void calcularMaxMinProm3(int[] arreglo) {
		int max = -9999, min = 9999, prom = 0;
		int sum = 0;
		for (int i = 0; i < arreglo.length; i++) {
			sum += arreglo[i];
			if(arreglo[i] < min) min = arreglo[i];
			if(arreglo[i] > max) max = arreglo[i];
		}
		prom = sum / arreglo.length;
		
		Resultado.setMaxs(max);
		Resultado.setMins(min);
		Resultado.setProms(prom);		
	}
}

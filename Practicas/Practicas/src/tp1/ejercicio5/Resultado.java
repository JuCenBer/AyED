package tp1.ejercicio5;

public class Resultado {
	private int max = -9999;
	private int min = 9999;
	private int prom = 0;
	
	private static int maxs = -9999;
	private static int mins = 9999;
	private static int proms = 0;
	
	public static int getMaxs() {
		return maxs;
	}
	public static void setMaxs(int maxs) {
		Resultado.maxs = maxs;
	}
	public static int getMins() {
		return mins;
	}
	public static void setMins(int mins) {
		Resultado.mins = mins;
	}
	public static int getProms() {
		return proms;
	}
	public static void setProms(int proms) {
		Resultado.proms = proms;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getProm() {
		return prom;
	}
	public void setProm(int prom) {
		this.prom = prom;
	}
	
	
}

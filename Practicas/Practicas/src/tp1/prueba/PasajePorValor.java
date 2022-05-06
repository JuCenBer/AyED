package tp1.prueba;

public class PasajePorValor {
	

	 public static void cambiarNombre(Contacto c) {
		 c=new Contacto();
		 c.setNombre("Juan");
	 }
	 
	 public static void main(String[] args){
		Contacto c = new Contacto();
		c.setNombre("Lucia");
		PasajePorValor.cambiarNombre(c);
		System.out.println(c.getNombre());
	 }
}
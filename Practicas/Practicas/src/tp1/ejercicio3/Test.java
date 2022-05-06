package tp1.ejercicio3;

public class Test {
	
	public static void main(String args[]) {
		Estudiante estudiantes[] = new Estudiante[2];
		Profesor profesores[] = new Profesor[3];
		
		estudiantes[0] = new Estudiante();
		estudiantes[0].setApellido("Beraun Centineo");
		estudiantes[0].setNombre("Julian");
		estudiantes[0].setComision("de la manana");
		estudiantes[0].setDireccion("48 N322");
		estudiantes[0].setEmail("elpiola@hotmail.com");
		
		estudiantes[1] = new Estudiante();
		estudiantes[1].setApellido("Aberastain");
		estudiantes[1].setNombre("Alvaro");
		estudiantes[1].setComision("de la tarde");
		estudiantes[1].setDireccion("en la loma del culo");
		estudiantes[1].setEmail("alvaro@gmail.com");
		
		profesores[0] = new Profesor();
		profesores[0].setApellido("Di Giusti");
		profesores[0].setNombre("Laura");
		profesores[0].setEmail("forra@lol.com");
		profesores[0].setCatedra("CADP");
		profesores[0].setFacultad("Informatica");
		
		profesores[1] = new Profesor();
		profesores[1].setApellido("La capa");
		profesores[1].setNombre("Fabiana");
		profesores[1].setEmail("unagenia@uwu.com");
		profesores[1].setCatedra("matematicas");
		profesores[1].setFacultad("Ingenieria");
		
		profesores[2] = new Profesor();
		profesores[2].setApellido("Diosa");
		profesores[2].setNombre("Laura");
		profesores[2].setEmail("teamo@uwu.com");
		profesores[2].setCatedra("matematicas");
		profesores[2].setFacultad("Ingenieria");
		
		for (int i = 0; i < profesores.length; i++) {
			System.out.println(profesores[i].tusDatos());
			System.out.println(" ");
		}
		for (int i = 0; i < estudiantes.length; i++) {
			System.out.println(estudiantes[i].tusDatos());
			System.out.println(" ");
		}
	}
}

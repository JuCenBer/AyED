package tp02.ejercicio2_2;
import java.util.Scanner;

import tp02.ejercicio2.*;


public class TestListaEnlazadaGenerica {
	public static void main(String[] args) {
		ListaEnlazadaGenerica<Estudiante> lista = new ListaEnlazadaGenerica<Estudiante>();
		Scanner s = new Scanner(System.in);
		Estudiante estudiantes[] = new Estudiante[4];
		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese el nombre del estudiante: ");
			estudiantes[i] = new Estudiante();
			String nombre = s.nextLine();
			String apellido = s.nextLine();
			String comision = s.nextLine();
			String direccion = s.nextLine();
			String email = s.nextLine();
			estudiantes[i].setNombre(nombre);
			estudiantes[i].setApellido(apellido);
			estudiantes[i].setComision(comision);
			estudiantes[i].setDireccion(direccion);
			estudiantes[i].setEmail(email);
		}
		for (int j = 0; j < estudiantes.length; j++) {			
			lista.agregarFinal(estudiantes[j]);
		}
		System.out.println("------------------------");
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo().tusDatos());
		}
	}
}

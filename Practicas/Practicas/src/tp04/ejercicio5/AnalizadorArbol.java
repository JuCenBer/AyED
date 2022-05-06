package tp04.ejercicio5;

import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class AnalizadorArbol {
	
	public static int devolverMaximoPromedio(ArbolGeneral<AreaEmpresa>arbol) {
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		ArbolGeneral<AreaEmpresa> aux;
		int sumatoria = 0;
		int ancho = 0;
		int maxPromedio = 0;
		cola.encolar(arbol);
		cola.encolar(null);
		while(!cola.esVacia()) {
			aux = cola.desencolar();
			if(aux != null) {
				ancho++;
				sumatoria += aux.getDato().getTardanzaTransmision();
				ListaGenerica<ArbolGeneral<AreaEmpresa>> listaHijos = aux.getHijos();
				listaHijos.comenzar();
				while(!listaHijos.fin()) {
					cola.encolar(listaHijos.proximo());
				}
			}
			else {
				if (sumatoria/ancho > maxPromedio) {
					maxPromedio = sumatoria/ancho;
				}
				ancho = 0;
				sumatoria = 0;
				if(!cola.esVacia()) {
					cola.encolar(null);
				}
			}
		}
		return maxPromedio;
	}
}

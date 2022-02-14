package algoritmos;

import tadCola.Cola;
import tadCola.ColaVacia;

public class AlgoritmosColas {
	public static <T> int contarCola(Cola<T> cola) {
		int resul;
		try {
			resul = contarColaR(cola);
			cola.invertirCola();
			
		} catch (ColaVacia e) {
			resul = -1;
		}
		return resul;
	}
	
	private static <T> int contarColaR(Cola<T> cola) throws ColaVacia {
		int resul;
		T elem;
		if(!cola.colaVacia()) {
			elem = cola.desencolar();
			resul = 1 + contarColaR(cola);			
			cola.encolar(elem);
		}
		else 
			resul = 0;
		return resul;
	}
        public static <T extends Comparable<T>> boolean buscar(Cola<T> cola, T dato) {
		boolean resul;
		try {
			resul = buscarR(cola, dato);
			cola.invertirCola();
		} catch (ColaVacia e) {
			resul = false;
		}
		return resul;
	}
	private static <T extends Comparable<T>> boolean buscarR(Cola<T> cola, T dato) throws ColaVacia {
		T elem;
		boolean resul = false;
		if(!cola.colaVacia()) {
			elem = cola.desencolar();
			if(elem.compareTo(dato) == 0) {
				resul = true;
				cola.invertirCola();
			}
			else
				resul = buscarR(cola, dato);
			cola.encolar(elem);
		}
		return resul;
	}
	
	public static <T extends Comparable<T>> T mayor(Cola<T> cola) {
		T resul;
		try {
			resul = mayor(cola, cola.primero());
			cola.invertirCola();
		} catch (ColaVacia e) {
			resul = null;
		}
		return resul;
	}
	
	private static <T extends Comparable<T>> T mayor(Cola<T> cola, T mayor) throws ColaVacia {
		T elem;
		if(!cola.colaVacia()) {
			elem = cola.desencolar();
			if(elem.compareTo(mayor) > 0) {
				mayor=elem;
			}
			
			mayor = mayor(cola, mayor);
			cola.encolar(elem);
		}
		return mayor;
	}
	public static <T> T ultimo(Cola<T> cola) {
		T resul;
		
		try {
			resul = ultimoR(cola);
			cola.invertirCola();
		} catch (ColaVacia e) {
			resul = null;
		}		
		return resul;
	}
	
	private static <T> T ultimoR(Cola<T> cola) throws ColaVacia {
		T elem, resul = null;
		if(!cola.colaVacia()) {
			elem = cola.desencolar();
			if(cola.colaVacia())
				resul = elem;
			else
				resul = ultimoR(cola);
		}
		return resul;
	}
	
	public static <T> void copiarCola(Cola<T> colaO, Cola<T> colaD) throws ColaVacia {
		copiarColaR(colaO, colaD);
		colaO.invertirCola();
	}
	
	private static <T> void copiarColaR(Cola<T> colaO, Cola<T> colaD) throws ColaVacia {
		T elem;
		if(!colaO.colaVacia()) {
			elem = colaO.desencolar();
			colaD.encolar(elem);
			copiarColaR(colaO, colaD);
			colaO.encolar(elem);
		}
	}
}

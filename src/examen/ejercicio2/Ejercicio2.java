package examen.ejercicio2;

import java.awt.Color;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import examen.ejercicio1.Circulo;
import examen.ejercicio1.Cuadrado;
import examen.ejercicio1.Figura;
import examen.ejercicio1.Rectangulo;;

public abstract class Ejercicio2  implements Comparator<Figura> {
	
	public static void main(String[] args) {
		Set<Figura> coleccion = new HashSet<Figura>();
		coleccion.add(new Cuadrado(Color.black, 10, 20, null, false, null, 40, "negro y sin relleno", 20));
		coleccion.add(new Circulo(Color.blue, 40, 30, null, true, null, 50, "azul y con relleno", 30));
		coleccion.add(new Rectangulo(Color.gray, 10, 6, null, true, null, 50, "gris y con relleno", 20, 10));
		
		Iterator<Figura> it = coleccion.iterator();
	     while(it.hasNext()){
	    	 System.out.println(it.next());
	     }
	}

	public int compare(Figura f1, Figura f2, float area) {
		if (f1.calcularArea(area) < f2.calcularArea(area)) {
			return - 1;
		}
		if (f2.calcularArea(area) > f2.calcularArea(area)) {
			return 1;
		}
		return 0;
	}

}

package examen.ejercicio3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el numero de elementos que introducira: ");
		int n = in.nextInt();
		int compuestos = 0;
		Set<String> lista_compuestos = new TreeSet<>();
		Set<String> elementos_salida = new TreeSet<>();
		do {
			System.out.println("Introduzca un compuesto: ");
			String compuesto = in.next();
			if (compuestos == 0) {
				lista_compuestos.add(compuesto);
				elementos_salida.add(compuesto);
			}
			else {
				lista_compuestos.add(compuesto);
				Iterator<String> it = elementos_salida.iterator();
			    while(it.hasNext()){
			        if (!elementos_salida.contains(compuesto)) {
			        	elementos_salida.add(compuesto);
			        }
			     }
			}
			compuestos++;
		} while (compuestos < n);
		mostrarCollecion(elementos_salida);
	}

	private static void mostrarCollecion(Set<String> c) {
		Iterator<String> it = c.iterator();
	     while(it.hasNext()){
	    	 System.out.println(it.next());
	     }
	}
}

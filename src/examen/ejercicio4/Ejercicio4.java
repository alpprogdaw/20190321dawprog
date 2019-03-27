package examen.ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> mapa = new HashMap<>();
		String respuesta;
		String operacion;
		String nombre;
		Integer n;
		
		int cont = 0;
		do {
			do {
				System.out.println("¿Que operacion quieres realizar? (buscar o agregar)");
				operacion = in.next().toLowerCase();
				if (operacion.equalsIgnoreCase("buscar") && operacion.equalsIgnoreCase("agregar")) {
					throw new Exception("La operacion a realizar no es posible");
				}
			} while (operacion.equalsIgnoreCase("buscar") && operacion.equalsIgnoreCase("agregar"));
			if (operacion.toLowerCase().equals("agregar")) {
				if (cont == 0) {
					System.out.println("Introduzca un nuevo contacto: ");
					nombre = in.next();
					System.out.println("Introduzca su numero: ");
					n = in.nextInt();
					mapa.put(nombre, n);
					cont++;
					mostrarMapa(mapa);
				}
				else {
					System.out.println("Introduzca un nuevo contacto: ");
					nombre = in.next();
					System.out.println("Introduzca su numero: ");
					n = in.nextInt();
					if (mapa.containsKey(nombre)) {
						mapa.remove(n);
						mapa.put(nombre, n);
					}
					else {
						mapa.put(nombre, n);
					}
					cont++;
					mostrarMapa(mapa);
				}
			}
			else {
				System.out.println("Introduza el nombre de la persona a buscar: ");
				nombre = in.next();
				if (mapa.containsKey(nombre)) {
					mostrarMapa(mapa);
				}
				else {
					System.out.println("El contacto " + nombre + " no se encuentra en la agenda.");
				}
			}
			System.out.println("¿Quiere realizar otra operacion? (escriba fin para terminar)");
			respuesta = in.next();
		}while (!respuesta.toLowerCase().equals("fin"));
		mostrarMapa(mapa);

	}

	public static void mostrarMapa(Map<String, Integer> mapa){
		for (Entry<String, Integer> entry : mapa.entrySet()) {
			System.out.println("Nombre: " + entry.getKey() + " - telefono: " + entry.getValue());
		}
	}
}


package examen.ejercicio1;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Area;

public class Cuadrado extends Figura {
	
	private float longitud_l;

	public Cuadrado(Color color, int x, int y, Point punto, boolean rellena, Area area, float perimetro, String detalles,
			float longitud_l) {
		super(color, x, y, punto, rellena, area, perimetro, detalles);
		this.longitud_l = longitud_l;
	}

	@Override
	public String toString() {
		return super.toString() + " Cuadrado [longitud_l=" + longitud_l + "]";
	}

	@Override
	public float calcularArea(float area) {
		area = longitud_l * longitud_l;
		return area;
	}
}

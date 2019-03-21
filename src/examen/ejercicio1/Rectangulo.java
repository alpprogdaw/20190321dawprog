package examen.ejercicio1;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Area;

public class Rectangulo extends Figura {

	private float longitud_b;
	private float longitud_a;
	
	public Rectangulo(Color color, int x, int y, Point punto, boolean rellena, Area area, float perimetro,String detalles, 
			float longitud_b, float longitud_a) {
		super(color, x, y, punto, rellena, area, perimetro, detalles);
		this.longitud_b = longitud_b;
		this.longitud_a = longitud_a;
	}

	@Override
	public String toString() {
		return super.toString() + " Rectangulo [longitud_b=" + longitud_b + ", longitud_a=" + longitud_a + "]";
	}

	@Override
	public float calcularArea(float area) {
		area = longitud_b * longitud_a;
		return area;
	}
}

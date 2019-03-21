package examen.ejercicio1;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Area;

public class Circulo extends Figura {
	
	private float radio;

	public Circulo(Color color, int x, int y, Point punto, boolean rellena, Area area, float perimetro, String detalles, float radio) {
		super(color, x, y, punto, rellena, area, perimetro, detalles);
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString() +  " Circulo [radio=" + radio + "]";
	}

	@Override
	public float calcularArea(float area) {
		area = (float) (Math.PI + (radio * radio));
		return area;
	}
	
}

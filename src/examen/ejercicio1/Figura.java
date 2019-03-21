package examen.ejercicio1;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Area;

public abstract class Figura {
	private Color color = Color.black;
	private int x;
	private int y;
	private Point punto;
	private boolean rellena = true;
	private Area area;
	private float perimetro;
	private String detalles;
	
	public Figura(Color color, int x, int y, Point punto, boolean rellena, Area area, float perimetro,String detalles) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.punto = punto;
		this.rellena = rellena;
		this.area = area;
		this.perimetro = perimetro;
		this.detalles = detalles;
	}
	
	public Figura(int x, int y, Point punto, Area area, float perimetro, String detalles) {
		this.x = x;
		this.y = y;
		this.punto = punto;
		this.area = area;
		this.perimetro = perimetro;
		this.detalles = detalles;
	}

	public Figura(int x, int y, Point punto, boolean rellena, Area area, float perimetro, String detalles) {
		this.x = x;
		this.y = y;
		this.punto = punto;
		this.rellena = rellena;
		this.area = area;
		this.perimetro = perimetro;
		this.detalles = detalles;
	}
	
	public Figura(Color color, int x, int y, Point punto, Area area, float perimetro, String detalles) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.punto = punto;
		this.area = area;
		this.perimetro = perimetro;
		this.detalles = detalles;
	}
	
	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	
	@Override
	public String toString() {
		return "Figura [color=" + color + ", x=" + x + ", y=" + y + ", punto=" + punto + ", rellena=" + rellena
				+ ", area2=" + area + ", perimetro=" + perimetro + ", detalles=" + detalles + "]";
	}
	public abstract float calcularArea(float area);
}

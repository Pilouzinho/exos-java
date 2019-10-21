package fr.exos.principal.exo18;

public class Cercle extends Forme {
	private double rayon;
	private static double PI = Math.PI;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public double calculerSurface() {
		return PI*(rayon*rayon);
	}
	
	
}

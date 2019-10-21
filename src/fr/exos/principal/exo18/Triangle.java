package fr.exos.principal.exo18;

public class Triangle extends Forme {
	private double base;
	private double hauteur;
	
	
	public Triangle(double base, double hauteur) {
		super();
		this.base = base;
		this.hauteur = hauteur;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHauteur() {
		return hauteur;
	}
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	public double calculerSurface() {
		return (this.base * this.hauteur)/2;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Triangle [base=");
		builder.append(base);
		builder.append(", hauteur=");
		builder.append(hauteur);
		builder.append(", calculerSurface()=");
		builder.append(calculerSurface());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

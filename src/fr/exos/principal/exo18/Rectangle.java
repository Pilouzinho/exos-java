package fr.exos.principal.exo18;

public class Rectangle extends Forme {
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}	
	
	public double calculerSurface() {
		return this.longueur * this.largeur;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle [longueur=");
		builder.append(longueur);
		builder.append(", largeur=");
		builder.append(largeur);
		builder.append(", calculerSurface()=");
		builder.append(calculerSurface());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

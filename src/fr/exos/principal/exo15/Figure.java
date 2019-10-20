package fr.exos.principal.exo15;

public abstract class Figure {
	private double longueur;
	private double largeur;

	public Figure(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double getlongueur() {
		return longueur;
	}

	public void setlongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	// méthodes
	public double perimetre() {
		return this.largeur * 2 + this.longueur * 2;
	}

	public double aire() {
		return this.largeur * this.longueur;
	}
	
	public String isCarre() {
		if(this.largeur == this.longueur) {
			return "C'est un carré";
		}else {
			return "Ce n'est pas un carré";
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle [longueur=");
		builder.append(longueur);
		builder.append(", largeur=");
		builder.append(largeur);
		builder.append(", perimetre()=");
		builder.append(perimetre());
		builder.append(", aire()=");
		builder.append(aire());
		builder.append(", isCarre()=");
		builder.append(isCarre());
		builder.append("]");
		return builder.toString();
	}
}

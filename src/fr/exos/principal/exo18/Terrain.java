package fr.exos.principal.exo18;

import java.util.ArrayList;

public class Terrain {
	private double surfaceTotale;
	private ArrayList<Forme> formes = new ArrayList<Forme>();
	
	
	
	public Terrain() {
		super();
	}
	
	public void ajouterForme(Forme f) {
		formes.add(f);
		calculerSurfaceTotale();
	}



	public void calculerSurfaceTotale() {
		for(Forme forme: this.formes) {
			this.surfaceTotale += forme.calculerSurface();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Terrain [surfaceTotale=");
		builder.append(surfaceTotale);
		builder.append(", formes=");
		builder.append(formes);
		builder.append("]");
		return builder.toString();
	}

	public double getSurfaceTotale() {
		return surfaceTotale;
	}

	public void setSurfaceTotale(double surfaceTotale) {
		this.surfaceTotale = surfaceTotale;
	}

	public ArrayList<Forme> getFormes() {
		return formes;
	}

	public void setFormes(ArrayList<Forme> formes) {
		this.formes = formes;
	}
	
	
	
}

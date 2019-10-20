package fr.exos.principal.exo2;

import java.util.Arrays;

public class Etudiant {
	private String nom;
	private double[] notes;
	
	public Etudiant() {
		this.nom = "";
		this.notes = new double[4];
	}

	public Etudiant(String nom, double[] notes) {
		super();
		this.nom = nom;
		this.notes = notes;
		
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Etudiant [nom=");
		builder.append(nom);
		builder.append(", notes=");
		builder.append(Arrays.toString(notes));
		builder.append(", calculerMoyenne()=");
		builder.append(calculerMoyenne());
		builder.append(", isAdmis()=");
		builder.append(isAdmis() ? "Admis" : "Pas admis");
		builder.append("]");
		return builder.toString();
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double[] getNotes() {
		return notes;
	}
	public void setNotes(double[] notes) {
		this.notes = notes;
	}

	
	public double calculerMoyenne() {
		double totalNotes = 0;
		for(int i = 0; i < this.notes.length; i++) {
			totalNotes += this.notes[i];
		}
		
		return totalNotes/this.notes.length;
	}
	
	public boolean isAdmis() {
		return (this.calculerMoyenne() < 10 ? false : true);
	}

}

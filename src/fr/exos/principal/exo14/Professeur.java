package fr.exos.principal.exo14;

import java.util.Scanner;

public class Professeur extends Employe{
	private String matiere;
	
	public Professeur(String nom, String prenom, String adresse, String lieuDeTravail, String matiere) {
		super(nom, prenom, adresse, lieuDeTravail);
		this.matiere = matiere;
		
	}
	
	public Professeur() {
		super();
		Scanner scStr = new Scanner(System.in);
		System.out.println("Entre la matière enseignée");
		this.matiere = scStr.nextLine();
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	
	//méthodes
	public void attribuerNote() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professeur [matiere=");
		builder.append(matiere);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}

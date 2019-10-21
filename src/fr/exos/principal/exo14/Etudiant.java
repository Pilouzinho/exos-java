package fr.exos.principal.exo14;

import java.util.Scanner;

public class Etudiant extends Personne{
	private String ecole;

	public Etudiant(String nom, String prenom, String adresse, String ecole) {
		super(nom, prenom, adresse);
		this.ecole = ecole;
	}
	
	public Etudiant() {
		super();
		Scanner scStr = new Scanner(System.in);
		System.out.println("Entre l'école :");
		this.ecole = scStr.nextLine();
	}
	
	//acesseurs	
	public String getEcole() {
		return ecole;
	}


	public void setEcole(String ecole) {
		this.ecole = ecole;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Etudiant [ecole=");
		builder.append(ecole);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	//méthodes
	public void suivreCours() {
		
	}
	
	public void passeExamen() {
		
	}
	

}

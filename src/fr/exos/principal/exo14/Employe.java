package fr.exos.principal.exo14;

import java.util.Scanner;

public class Employe extends Personne{
	private String lieuDeTravail;
	
	public Employe(String nom, String prenom, String adresse, String lieuDeTravail) {
		super(nom, prenom, adresse);
		this.lieuDeTravail = lieuDeTravail;
	}
	
	public Employe() {
		super();
		Scanner scStr = new Scanner(System.in);
		System.out.println("Entre le lieu de travail :");
		this.lieuDeTravail = scStr.nextLine();
	}

	public String getLieuDeTravail() {
		return lieuDeTravail;
	}

	public void setLieuDeTravail(String lieuDeTravail) {
		this.lieuDeTravail = lieuDeTravail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employe [lieuDeTravail=");
		builder.append(lieuDeTravail);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}

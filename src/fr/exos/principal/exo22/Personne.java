package fr.exos.principal.exo22;

import java.io.Serializable;
import java.util.Date;

public class Personne implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7662031551777967096L;
	private String numSS;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private String ville;
	private char sexe;
	
	
	public Personne() {
		super();
	}


	public Personne(String numSS, String nom, String prenom, Date dateDeNaissance, String ville) {
		super();
		this.numSS = numSS;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.ville = ville;
		setSexe();
	}


	public String getNumSS() {
		return numSS;
	}


	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public char getSexe() {
		return sexe;
	}


	public void setSexe() {
		if(numSS.charAt(0) == '1') {
			this.sexe = 'M';
		}else {
			this.sexe = 'F';
		}
		
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personne [numSS=");
		builder.append(numSS);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", dateDeNaissance=");
		builder.append(dateDeNaissance);
		builder.append(", ville=");
		builder.append(ville);
		builder.append(", sexe=");
		builder.append(sexe);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}

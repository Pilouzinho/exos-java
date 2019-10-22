package fr.exos.principal.exosup2;

public class Personne {
	private String nom;
	private String prenom;
	private Appart appart;
	
	public Personne(String nom, String prenom, Appart appart) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.appart = appart;
	}

	public Personne() {
		super();
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

	public Appart getAppart() {
		return appart;
	}

	public void setAppart(Appart appart) {
		this.appart = appart;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personne [nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", appart=");
		builder.append(appart);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}

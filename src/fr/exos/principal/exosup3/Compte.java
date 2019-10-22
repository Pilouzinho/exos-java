package fr.exos.principal.exosup3;

public class Compte {
	private int numero;
	private String nom_titulaire;
	private double solde;
	
	public Compte(int numero, String nom_titulaire, double solde) {
		super();
		this.numero = numero;
		this.nom_titulaire = nom_titulaire;
		this.solde = solde;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom_titulaire() {
		return nom_titulaire;
	}

	public void setNom_titulaire(String nom_titulaire) {
		this.nom_titulaire = nom_titulaire;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Compte [numero=");
		builder.append(numero);
		builder.append(", nom_titulaire=");
		builder.append(nom_titulaire);
		builder.append(", solde=");
		builder.append(solde);
		builder.append("]");
		return builder.toString();
	}
	
	
	public void deposerArgent(double sommeAjout) {
		this.solde += sommeAjout;
	}
	
	public void retirerArgent(double sommeRetirer) {
		if(sommeRetirer > this.solde) {
			System.out.println("Fonds insuffisants");
		}else {
			this.solde -= sommeRetirer;
		}
	}
	
	public void consulterCompte() {
		System.out.println(this.solde);
	}
}

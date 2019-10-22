package fr.exos.principal.exosup3;

public class CompteEpargne extends Compte {
	private double taux;
	private double interets;

	public CompteEpargne(int numero, String nom_titulaire, double solde, double taux) {
		super(numero, nom_titulaire, solde);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	
	public void interetsAcquis() {
		this.interets = this.getSolde()+this.getSolde()*this.taux;
	}
	
	public void ajoutInterets() {
		this.interetsAcquis();
		this.setSolde(this.interets);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompteEpargne [taux=");
		builder.append(taux);
		builder.append(", interets=");
		builder.append(interets);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}

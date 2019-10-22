package fr.exos.principal.exosup3;

public class CompteCourant extends Compte {
	private double decouvertAutorise;
	
	public CompteCourant(int numero, String nom_titulaire, double solde, double decouvertAutorise) {
		super(numero, nom_titulaire, solde);
		this.decouvertAutorise = decouvertAutorise;
	}

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompteCourant [decouvertAutorise=");
		builder.append(decouvertAutorise);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
		
	@Override
	public void retirerArgent(double sommeRetirer) {
		if(sommeRetirer > this.getSolde()+this.decouvertAutorise) {
			System.out.println("Fonds insuffisants");
		}else{
			this.setSolde(this.getSolde() - sommeRetirer);
		}
	}
	
	

}

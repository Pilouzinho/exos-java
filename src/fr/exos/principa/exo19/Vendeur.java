package fr.exos.principa.exo19;

public class Vendeur extends Commercial {

	public Vendeur(String nom, String prenom, int age, String dateEntree, int chiffreAffaire) {
		super(nom, prenom, age, dateEntree, chiffreAffaire);
		setPrime(400);
	}

	@Override
	public double calculerSalaires() {
		return super.calculerSalaire();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vendeur [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}

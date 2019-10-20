package fr.exos.principa.exo19;


public class Representant extends Commercial {

	public Representant(String nom, String prenom, int age, String dateEntree, int chiffreAffaire) {
		super(nom, prenom, age, dateEntree, chiffreAffaire);
		setPrime(800);
	}

	@Override
	public double calculerSalaires() {
		return super.calculerSalaire();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Representant [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}

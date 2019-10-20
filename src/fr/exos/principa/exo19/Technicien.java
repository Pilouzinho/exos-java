package fr.exos.principa.exo19;

public class Technicien extends Production {

	public Technicien(String nom, String prenom, int age, String dateEntree, int unitesProduites) {
		super(nom, prenom, age, dateEntree, unitesProduites);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaires() {
		return super.calculerSalaire();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Technicien [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}

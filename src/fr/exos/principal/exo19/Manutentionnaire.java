package fr.exos.principal.exo19;

public class Manutentionnaire extends Manutention {

	public Manutentionnaire(String nom, String prenom, int age, String dateEntree, int heuresTravail) {
		super(nom, prenom, age, dateEntree, heuresTravail);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaires() {
		return super.calculerSalaire();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manutentionnaire [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}

package fr.exos.principa.exo19;


public abstract class Production extends Employe {
	private int unitesProduites;
	
	
	public Production(String nom, String prenom, int age, String dateEntree, int unitesProduites) {
		super(nom, prenom, age, dateEntree);
		this.unitesProduites = unitesProduites;
	}


	public int getUnitesProduites() {
		return unitesProduites;
	}


	public void setUnitesProduites(int unitesProduites) {
		this.unitesProduites = unitesProduites;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Production [unitesProduites=");
		builder.append(unitesProduites);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	public double calculerSalaire() {
		return this.unitesProduites*5;
	}
	
	
	

}

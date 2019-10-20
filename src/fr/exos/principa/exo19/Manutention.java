package fr.exos.principa.exo19;

public abstract class Manutention extends Employe {
	
	private int heuresTravail;
	
	public Manutention(String nom, String prenom, int age, String dateEntree, int heuresTravail) {
		super(nom, prenom, age, dateEntree);
		this.heuresTravail = heuresTravail;
	}

	public int getHeuresTravail() {
		return heuresTravail;
	}

	public void setHeuresTravail(int heuresTravail) {
		this.heuresTravail = heuresTravail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manutention [heuresTravail=");
		builder.append(heuresTravail);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	public double calculerSalaire() {
		return this.heuresTravail*65;
	}

}

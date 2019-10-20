package fr.exos.principa.exo19;

public abstract class Commercial extends Employe {
	private int chiffreAffaire;
	private int prime;
	
	public Commercial(String nom, String prenom, int age, String dateEntree, int chiffreAffaire) {
		super(nom, prenom, age, dateEntree);
		this.chiffreAffaire = chiffreAffaire;
	}

	public int getChiffreAffaire() {
		return chiffreAffaire;
	}

	public void setChiffreAffaire(int chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}

	public int getPrime() {
		return prime;
	}

	public void setPrime(int prime) {
		this.prime = prime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Commercial [chiffreAffaire=");
		builder.append(chiffreAffaire);
		builder.append(", prime=");
		builder.append(prime);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	public double calculerSalaire() {
		return this.chiffreAffaire*0.2 + this.prime;
	}
}

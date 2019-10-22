package fr.exos.principal.exosup2;

public class Appart {
	private String adresse;
	private double prix;
	
	public Appart(String adresse, double prix) {
		super();
		this.adresse = adresse;
		this.prix = prix;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Appart [adresse=");
		builder.append(adresse);
		builder.append(", prix=");
		builder.append(prix);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

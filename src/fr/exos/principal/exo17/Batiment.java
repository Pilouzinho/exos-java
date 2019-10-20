package fr.exos.principal.exo17;

public abstract class Batiment {
	private String adresse;

	//constructeurs
	public Batiment(String adresse) {
		super();
		this.adresse = adresse;
	}

	public Batiment() {
		super();
	}

	//accesseurs
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
}

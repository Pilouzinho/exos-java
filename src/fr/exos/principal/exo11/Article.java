package fr.exos.principal.exo11;

public class Article {
	private int reference;
	private String designation;
	private double prixHt;
	private static double TAUX_TVA = 20.0;
	
	//constructeur(s)
	public Article() {
		super();
		this.reference = 0;
		this.designation = "";
		this.prixHt = 0.0;
	}
	
	public Article(int reference, String designation, double prixHt) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prixHt = prixHt;
	}
	
	public Article(int reference, String designation) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prixHt = 0.0;
	}
	
	public Article(Article a) {
		this.reference = a.getReference();
		this.designation = a.getDesignation();
		this.prixHt = a.getPrixHt();
	}
	
	
	//accesseurs 
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrixHt() {
		return prixHt;
	}
	public void setPrixHt(double prixHt) {
		this.prixHt = prixHt;
	}
	
	
	
	//méthodes
	public double calculerPrixTtc() {
		return this.prixHt + (this.prixHt*this.TAUX_TVA/100);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Article [reference=");
		builder.append(reference);
		builder.append(", designation=");
		builder.append(designation);
		builder.append(", prixHt=");
		builder.append(prixHt);
		builder.append(", calculerPrixTtc()=");
		builder.append(calculerPrixTtc());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}

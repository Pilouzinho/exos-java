package fr.exos.principal.exo13;

public class Livre {
	private static int id;
	private int idLivre;
	private String titre;
	private String nomAuteur;
	private double prix;
	
	public Livre(String titre, String nomAuteur, double prix) {
		super();
		id++;
		this.setIdLivre(id);
		this.titre = titre;
		this.nomAuteur = nomAuteur;
		this.prix = prix;
	}
	
	//accesseurs
	public int getId() {
		return id;
	}
	public int getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getNomAuteur() {
		return nomAuteur;
	}
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
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
		builder.append("Livre [idLivre=");
		builder.append(idLivre);
		builder.append(", titre=");
		builder.append(titre);
		builder.append(", nomAuteur=");
		builder.append(nomAuteur);
		builder.append(", prix=");
		builder.append(prix);
		builder.append("]");
		return builder.toString();
	}

	
	
}

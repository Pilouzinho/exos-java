package fr.exos.principal.exo17;

public class Maison extends Batiment{
	private int nbrePieces;

	//constructeurs
	public Maison(String adresse, int nbrePieces) {
		super(adresse);
		this.nbrePieces = nbrePieces;
	}

	public Maison() {
		super();
	}

	
	//accesseurs
	public int getNbrePieces() {
		return nbrePieces;
	}

	public void setNbrePieces(int nbrePieces) {
		this.nbrePieces = nbrePieces;
	}

	
	//methodes
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Maison [nbrePieces=");
		builder.append(nbrePieces);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}

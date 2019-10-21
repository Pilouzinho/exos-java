package fr.exos.principal.exo17;

public class Immeuble extends Batiment {
	private int nbreAppart;

	public Immeuble(String adresse, int nbreAppart) {
		super(adresse);
		this.nbreAppart = nbreAppart;
	}

	public Immeuble() {
		super();
	}

	public int getNbreAppart() {
		return nbreAppart;
	}

	public void setNbreAppart(int nbreAppart) {
		this.nbreAppart = nbreAppart;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Immeuble [nbreAppart=");
		builder.append(nbreAppart);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}

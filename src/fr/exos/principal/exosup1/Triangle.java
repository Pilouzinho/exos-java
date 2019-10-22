package fr.exos.principal.exosup1;

public class Triangle {
	private Point sommetA;
	private Point sommetB;
	private Point sommetC;
	
	public Triangle(Point sommetA, Point sommetB, Point sommetC) {
		super();
		this.sommetA = sommetA;
		this.sommetB = sommetB;
		this.sommetC = sommetC;
	}

	public Triangle() {
		super();
	}

	public Point getSommetA() {
		return sommetA;
	}

	public void setSommetA(Point sommetA) {
		this.sommetA = sommetA;
	}

	public Point getSommetB() {
		return sommetB;
	}

	public void setSommetB(Point sommetB) {
		this.sommetB = sommetB;
	}

	public Point getSommetC() {
		return sommetC;
	}

	public void setSommetC(Point sommetC) {
		this.sommetC = sommetC;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Triangle [sommetA=");
		builder.append(sommetA);
		builder.append(", sommetB=");
		builder.append(sommetB);
		builder.append(", sommetC=");
		builder.append(sommetC);
		builder.append("]");
		return builder.toString();
	}
	
	public double calculLongueur(Point D, Point F) {
		double resultat = ((F.getX() - D.getX()) * (F.getX() - D.getX()) + (F.getY() - D.getY() * (F.getY() - D.getY())));
		return Math.sqrt(resultat);
	}
	
	public boolean isIsocele() {
		double AB = calculLongueur(this.sommetA, this.sommetB);
		double AC = calculLongueur(this.sommetA, this.sommetC);
		double BC = calculLongueur(this.sommetB, this.sommetC);
		
		if( AB == AC || AB == BC || AC == BC) {
			return true;
		}else {
			return false;
		}
	}
	
}

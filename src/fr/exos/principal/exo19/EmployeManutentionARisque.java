package fr.exos.principal.exo19;

public class EmployeManutentionARisque extends Manutention implements EmployesARisques{

	public EmployeManutentionARisque(String nom, String prenom, int age, String dateEntree, int heuresTravail) {
		super(nom, prenom, age, dateEntree, heuresTravail);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaires() {
		return super.calculerSalaire()+primeRisque;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manutentionnaire à risques [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}

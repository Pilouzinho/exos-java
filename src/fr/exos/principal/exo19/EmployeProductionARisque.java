package fr.exos.principal.exo19;

public class EmployeProductionARisque extends Production implements EmployesARisques {

	public EmployeProductionARisque(String nom, String prenom, int age, String dateEntree, int unitesProduites) {
		super(nom, prenom, age, dateEntree, unitesProduites);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaires() {
		return super.calculerSalaire()+primeRisque;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Technicien à risques [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}

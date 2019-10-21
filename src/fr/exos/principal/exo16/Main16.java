package fr.exos.principal.exo16;

public class Main16 {

	public static void main(String[] args) {
		ParcVehicules pv1 = new ParcVehicules("Garage Habitte", "Rue du coin qui tourne", "Poitiers");
//		pv1.ajouterVoiture();
//		pv1.ajouterMoto();
//		pv1.ajouterCamion();
//		pv1.ajouterTracteur();
		pv1.ajouterVehicule();
		pv1.afficherParc();
		System.out.println(pv1);
		
//		ParcV2 pv2 = new ParcV2("Garage Habitte", "Rue du coin qui tourne", "Poitiers");
//		pv2.ajouterVehicule();
//		pv2.afficherParc();
//		System.out.println(pv2);
	}

}

package fr.exos.principal.exo8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UtilTab {

	public static double somme(ArrayList<Double> tab){
		double somme = 0;
		for(double tabUnit : tab) {
			somme += tabUnit;
		}
		return somme;
	}
	
	public static ArrayList<Double> incre(ArrayList<Double> tab, double valIncre) {

		for(double tabUnit : tab) {
			tab.set(tab.indexOf(tabUnit), tabUnit + valIncre);
		}
		
		return tab;
	}
	
	public static void afficherTableau(ArrayList<Double> tab) {
		for(double tabUnit : tab) {
			System.out.println(tabUnit);
		}
	}
	
	public static ArrayList<Double> creerTableau() {
		ArrayList<Double> tableau = new ArrayList<>();
		int nbreEntrees;
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Combien d'entrées le tableau ?");
			nbreEntrees = sc.nextInt();
			for(int i = 0; i < nbreEntrees; i++) {
				tableau.add(1 + Math.random() * (100 - 1));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sc != null)
				sc.close();
		}
		return tableau;
	}
}

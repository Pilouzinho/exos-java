package fr.exos.principal.exo5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main5 {

	public static void main(String[] args) {
		Des de1 = new Des(6);
		Des de2 = new Des(6);
		Des de3 = new Des(6);
		boolean gagne = false;
		
		ArrayList<Integer> lances = new ArrayList<Integer>();
		lances.add(de1.lance());
		lances.add(de2.lance());
		lances.add(de3.lance());
		Set<Integer> set = new HashSet<Integer>(lances);
		System.out.println(lances);
		
		if(set.size() < lances.size()) {
			System.out.println("C'est gagné");
		}else {
			System.out.println("C'est perdu");
		}
		
//		if(lances.get(0) == lances.get(1) || lances.get(1) == lances.get(2) || lances.get(0)  == lances.get(2)){
//			System.out.println("C'est gagné");
//		}else {
//			System.out.println("C'est perdu !");
//		}

	}

}

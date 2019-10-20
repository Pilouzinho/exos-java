package fr.exos.principal.exo11;

public class Main11 {

	public static void main(String[] args) {
		Article article1 = new Article();
		Article article2 =  new Article(25897, "Jarre à biscuits", 299.99);
		Article article3 = new Article(25898, "Tondeuse pour chauves");
		Article article4 = new Article(article2);
		
		System.out.println(article1);
		System.out.println(article2);
		System.out.println(article3);
		System.out.println(article4);
		
		System.out.println(article1.calculerPrixTtc());
		System.out.println(article2.calculerPrixTtc());
		System.out.println(article3.calculerPrixTtc());
		System.out.println(article4.calculerPrixTtc());

	}

}

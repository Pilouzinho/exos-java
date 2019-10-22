package fr.exos.principal.exosup1;

public class Main {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		triangle1.setSommetA(new Point(6,1));
		triangle1.setSommetB(new Point(2,5));
		triangle1.setSommetC(new Point(2,1));
		
		System.out.println(triangle1.toString());
		
		System.out.println(triangle1.isIsocele());
	}

}

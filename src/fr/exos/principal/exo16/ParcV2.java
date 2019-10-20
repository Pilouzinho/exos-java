package fr.exos.principal.exo16;

import java.util.ArrayList;
import java.util.Scanner;

public class ParcV2 {
	private String nom;
	private ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
	private String adresse;
	private String ville;
	
	//constructeurs
	public ParcV2(String nom, String adresse, String ville) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(ArrayList<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	
	//méthodes
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ParcV2 [nom=");
		builder.append(nom);
		builder.append(", vehicules=");
		builder.append(vehicules);
		builder.append(", adresse=");
		builder.append(adresse);
		builder.append(", ville=");
		builder.append(ville);
		builder.append("]");
		return builder.toString();
	}
	
	public void afficherParc() {
		System.out.println("Nombre total de véhicules : ");
		System.out.println(Vehicule.getQtite());
		System.out.println("dont : ");
		System.out.println(Voiture.getQtiteVoit() + "voitures");
		System.out.println(Moto.getQtiteMoto() + "motos");
		System.out.println(Camion.getQtiteCamion() + "camions");
		System.out.println(Tracteur.getQtiteTract() + "tracteurs");
	}
	
	public void ajouterVehicule() {
		Scanner sc5 = new Scanner(System.in);
		char ajout, recommencer;
		char choixAjout;
		boolean continuer = true;
		String choix = "1234";
		System.out.println("Bonjour ! Bienvenue au " + this.nom +" !");
		do {
			System.out.println("Voulez-vous ajouter un nouveau Véhicule au garage (O/N)?");
			ajout = sc5.next().charAt(0);
			if(ajout == 'O' || ajout == 'o' || ajout == '0') {
				do {
					
					System.out.println("Quel type de véhicule voulez-vous ajouter ?");
					System.out.println("1 : Voiture");
					System.out.println("2 : Moto");
					System.out.println("3 : Camion");
					System.out.println("4 : Tracteur");
					choixAjout = sc5.next().charAt(0);
					do {
						switch(choixAjout) {
						case '1':
							this.vehicules.add(new Voiture());
							break;
						case '2':
							this.vehicules.add(new Moto());
							break;
						case '3':
							this.vehicules.add(new Camion());
							break;
						case '4':
							this.vehicules.add(new Tracteur());
							break;
						}
						
						
						System.out.println("En ajouter un autre ? (O/N)");
						recommencer = sc5.next().charAt(0);
						if(recommencer == 'O' || recommencer == 'o' || recommencer == '0') {
							continuer = true;
						}else {
							continuer = false;
							System.out.println("Fin de l'ajout de véhicule");
						}
					}while(continuer);
					if(choix.indexOf(choixAjout) == -1) {
						System.out.println("Merci de choisir taper 1 pour les voitures, 2 pour les motos, 3 pour les camions et 4 pour les tracteurs !");
					}
				}while(choix.indexOf(choixAjout) == -1);
			}
			choixAjout = 0;
		}while(ajout == 'O' || ajout == 'o' || ajout == '0');
		
	}
	
	
}

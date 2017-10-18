package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import Main.*;

public class AppliLocation {
	
	public void main (String args[]){
		
		ArrayList<Client> listeClientTest = new ArrayList<Client>();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Afficher l'ensemble des articles disponibles à la location");
		System.out.println("2 : Enregistrer location");
		System.out.println("3 : Supprimer location");
		System.out.println("4 : Afficher l'ensemble des locations en cours pour un client");
		System.out.println("5 : Calculer le montant total de ses recettes sur une période donnée");
		System.out.println("Veuillez saisir le numéro de l'action que vous souhaitez éxécuter : ");
		String str = sc.nextLine();
		for (int i =1; i<=4;i++){
			if (Integer.parseInt(str)!=1 && Integer.parseInt(str)!=2 && Integer.parseInt(str)!=3 && Integer.parseInt(str)!=4){
				System.out.println("Identifiant de commande non trouvé veuillez réessayer");
				main(args);
			}
			if(Integer.parseInt(str)==1){
				System.out.println("Afficher l'ensemble des articles disponibles à la location");
			}
			if(Integer.parseInt(str)==2){
				System.out.println("Enregistrer location");
			}
			if(Integer.parseInt(str)==3){
				System.out.println("Supprimer location");
			}
			if(Integer.parseInt(str)==4){
				System.out.println("Afficher l'ensemble des locations en cours pour un client");
				Client clientSelect = choixClient(listeClientTest);
				if (clientSelect!=null){
					clientSelect.afficherLocationEnCours();
					}
				}else{
					System.out.println("Retour au menu principal");
					main(args);
				}
			}
			if(Integer.parseInt(str)==5){
				System.out.println("Calculer le montant total de ses recettes sur une période donnée");
				System.out.println("Entrer une date au format YY/MM/JJ");
				String strDate = sc.nextLine();
				if (strDate.length()== 8 || strDate.length()==9 || strDate.length()==10){
					
				}
			}
		}
		
	public static void generateFakeData(){
		ArrayList<Client> listeClientTest = new ArrayList<Client>();
		ArrayList<Location> listeLocationTest = new ArrayList<Location>();
		ArrayList<Location> listeLocationTest2 = new ArrayList<Location>();
		
		ArrayList<Article> listeArticleTest = new ArrayList<Article>();
		listeArticleTest.add(new SouleveMalade(1, "Soulevator1", "SV-61", 222, 14,250, 360));
		listeArticleTest.add(new MatelasAAir(2, "Matmoila1", "PX91", 22, 4, "14cm","45cm", "85cm", 85.5, 30));
		listeArticleTest.add(new TableAtile(3, "Soulevator1", "SV-61", 2, 14, 4, "14cm","45cm", "85cm", true));
		ArrayList<Article> listeArticleTest2 = new ArrayList<Article>();
		listeArticleTest2.add(new SouleveMalade(4, "Soulevator2", "SV-62", 222, 14,250, 360));
		listeArticleTest2.add(new MatelasAAir(5, "Matmoila2", "PX92", 22, 4, "14cm","45cm", "85cm", 85.5, 30));
		listeArticleTest2.add(new TableAtile(6, "Soulevator2", "SV-62", 2, 14, 4, "14cm","45cm", "85cm", true));
		ArrayList<Article> listeArticleTest3 = new ArrayList<Article>();
		listeArticleTest3.add(new SouleveMalade(7, "Soulevator3", "SV-63", 222, 14,250, 360));
		listeArticleTest3.add(new MatelasAAir(8, "Matmoila3", "PX93", 22, 4, "14cm","45cm", "85cm", 85.5, 30));
		listeArticleTest3.add(new TableAtile(9, "Soulevator3", "SV-63", 2, 14, 4, "14cm","45cm", "85cm", true));
		ArrayList<Article> listeArticleTest4 = new ArrayList<Article>();
		listeArticleTest4.add(new SouleveMalade(10, "Soulevator4", "SV-64", 222, 14,250, 360));
		listeArticleTest4.add(new MatelasAAir(11, "Matmoila4", "PX94", 22, 4, "14cm","45cm", "85cm", 85.5, 30));
		listeArticleTest4.add(new TableAtile(12, "Soulevator4", "SV-64", 2, 14, 4, "14cm","45cm", "85cm", true));
		
		Client myClientTest = new Client(1, "DIDIER", "Jean", "ICI", "0658459545", listeLocationTest);
		Client myClientTest2= new Client(2, "MOITY", "Robert", "LA", "0647519545", listeLocationTest2);
		
		Date dateDebutTest = new Date(2017,9,6);
		Date dateFinTest = new Date(2017,9,17);
		
		Location loc = new Location(listeArticleTest, dateDebutTest, dateFinTest, 110, myClientTest);
		Location loc2 = new Location(listeArticleTest, dateDebutTest, dateFinTest, 110, myClientTest);
		Location loc3 = new Location(listeArticleTest, dateDebutTest, dateFinTest, 110, myClientTest2);
		Location loc4 = new Location(listeArticleTest, dateDebutTest, dateFinTest, 110, myClientTest2);
		
		listeLocationTest.add(loc);
		listeLocationTest.add(loc3);
		listeLocationTest2.add(loc2);
		listeLocationTest2.add(loc4);
		
		myClientTest.setListeLocation(listeLocationTest);
		myClientTest.setListeLocation(listeLocationTest2);
	}
	
	public static Client choixClient(ArrayList<Client> listClient){
		for (Client c : listClient){
			System.out.println(c.toString());
		}
		System.out.println("Entrer l'id du client pour lequel vous souhaitez effectuer l'action : ");
		Scanner scClient = new Scanner(System.in);
		String id = scClient.nextLine();
		for (Client c : listClient){
			if(c.getId() == Integer.parseInt(id)){
				return c;
			}
		}
		System.out.println("Identifiant client invalide");
		return null;
	}
	
	public static Date saisieDate(String s){
		String[] dateDecompose = s.split("/");
		if (dateDecompose[1].length() == 2){
			dateDecompose[1] = dateDecompose[1].substring(1);
		}
		if (dateDecompose[2].length() == 2){
			dateDecompose[2] = dateDecompose[2].substring(1);
		}
		Date dateSaisie = new Date(Integer.parseInt(dateDecompose[0]), Integer.parseInt(dateDecompose[1]), Integer.parseInt(dateDecompose[2]));
		return dateSaisie;
	}
	
}

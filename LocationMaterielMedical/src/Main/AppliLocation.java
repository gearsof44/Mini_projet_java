package Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import Main.*;

public class AppliLocation {
	
	public static void main (String args[]){
				
		//Generation de donnees fake pour le cas d'utilisation
		
		ArrayList<Client> listeClientTest = new ArrayList<Client>();
		ArrayList<Location> listeLocationTest = new ArrayList<Location>();
		ArrayList<Location> listeLocationTest2 = new ArrayList<Location>();
		ArrayList<Location> listeLocationTotalTest = new ArrayList<Location>();
		
		ArrayList<Article> listeArticleTest = new ArrayList<Article>();
		SouleveMalade sou1 = new SouleveMalade(1, "Soulevator1", "SV-61", 222, 14,250, 360);
		TableAtile table1 = new TableAtile(3, "Soulevator1", "SV-61", 2, 14, 4, "14cm","45cm", "85cm", true);
		MatelasAAir mat1 = new MatelasAAir(2, "Matmoila1", "PX91", 22, 4, "14cm","45cm", "85cm", 85.5, 30);
		listeArticleTest.add(sou1);
		listeArticleTest.add(table1);
		listeArticleTest.add(mat1);
		ArrayList<Article> listeArticleTest2 = new ArrayList<Article>();
		SouleveMalade sou2 = new SouleveMalade(4, "Soulevator2", "SV-62", 222, 14,250, 360);
		MatelasAAir mat2 = new MatelasAAir(5, "Matmoila2", "PX92", 22, 4, "14cm","45cm", "85cm", 85.5, 30);
		TableAtile table2 = new TableAtile(6, "Soulevator2", "SV-62", 2, 14, 4, "14cm","45cm", "85cm", true);
		listeArticleTest2.add(sou2);
		listeArticleTest2.add(mat2);
		listeArticleTest2.add(table2);
		ArrayList<Article> listeArticleTest3 = new ArrayList<Article>();
		SouleveMalade sou3 = new SouleveMalade(7, "Soulevator3", "SV-63", 222, 14,250, 360);
		TableAtile table3 = new TableAtile(9, "Soulevator3", "SV-63", 2, 14, 4, "14cm","45cm", "85cm", true);
		MatelasAAir mat3 = new MatelasAAir(8, "Matmoila3", "PX93", 22, 4, "14cm","45cm", "85cm", 85.5, 30);
		listeArticleTest3.add(sou3);
		listeArticleTest3.add(table3);
		listeArticleTest3.add(mat3);
		ArrayList<Article> listeArticleTest4 = new ArrayList<Article>();
		SouleveMalade sou4 = new SouleveMalade(10, "Soulevator4", "SV-64", 222, 14,250, 360);
		TableAtile table4 = new TableAtile(12, "Soulevator4", "SV-64", 2, 14, 4, "14cm","45cm", "85cm", true);
		MatelasAAir mat4 = new MatelasAAir(11, "Matmoila4", "PX94", 22, 4, "14cm","45cm", "85cm", 85.5, 30);
		listeArticleTest4.add(sou4);
		listeArticleTest4.add(table4);
		listeArticleTest4.add(mat4);
		
		Client myClientTest = new Client(1, "DIDIER", "Jean", "ICI", "0658459545", listeLocationTest);
		Client myClientTest2= new Client(2, "MOITY", "Robert", "LA", "0647519545", listeLocationTest2);
		
		Date dateDebutTest = new Date(2017,9,6);
		Date dateFinTest = new Date(2017,9,17);
		
		Location loc = new Location(1, listeArticleTest, dateDebutTest, dateFinTest, 110, myClientTest);
		Location loc2 = new Location(2, listeArticleTest2, dateDebutTest, dateFinTest, 110, myClientTest);
		Location loc3 = new Location(3, listeArticleTest3, dateDebutTest, dateFinTest, 110, myClientTest2);
		Location loc4 = new Location(4, listeArticleTest4, dateDebutTest, dateFinTest, 110, myClientTest2);
		
		listeLocationTest.add(loc);
		listeLocationTest.add(loc3);
		listeLocationTest2.add(loc2);
		listeLocationTest2.add(loc4);
		listeLocationTotalTest.add(loc);
		listeLocationTotalTest.add(loc2);
		listeLocationTotalTest.add(loc3);
		listeLocationTotalTest.add(loc4);
		
		
		myClientTest.setListeLocation(listeLocationTest);
		myClientTest2.setListeLocation(listeLocationTest2);
		
		listeClientTest.add(myClientTest);
		listeClientTest.add(myClientTest2);
		
		ArrayList<Article> listeArticleTestMagasin =new ArrayList<Article>();	
		
		SouleveMalade soum=new SouleveMalade(1224, "SoulevatorMaximus", "SV-6", 22.2, 14,850, 360);
		LitMecanise litm=new LitMecanise(1442, "LitMaxMaximus", "LM-2", 14.56, 224, 450,"180", "120", "60", 360);
		FauteuilRoulant fautr=new FauteuilRoulant(2578, "RoueLibreMaximus", "RL-52", 8.2, 887,85, 12.3);
		MatelasAAir mataa=new MatelasAAir(339, "MatelasGonfletteMaximus", "MG-44", 6.45, 78, "220","180", "20", 570.0, 3);
		TableAtile tabat=new TableAtile(214, "TableTuileMaximus", "TT-12", 4.44, 120, 85,"80", "120", "90", true);
		
		listeArticleTestMagasin.add(soum);
		listeArticleTestMagasin.add(litm);
		listeArticleTestMagasin.add(fautr);
		listeArticleTestMagasin.add(mataa);
		listeArticleTestMagasin.add(tabat);
		listeArticleTestMagasin.add(sou1);
		listeArticleTestMagasin.add(table1);
		listeArticleTestMagasin.add(mat1);
		listeArticleTestMagasin.add(sou2);
		listeArticleTestMagasin.add(table2);
		listeArticleTestMagasin.add(mat2);
		listeArticleTestMagasin.add(sou3);
		listeArticleTestMagasin.add(table3);
		listeArticleTestMagasin.add(mat3);
		listeArticleTestMagasin.add(sou4);
		listeArticleTestMagasin.add(table4);
		listeArticleTestMagasin.add(mat4);
		
		Magasin mag_test = new Magasin("MonGerantTest", "AdresseDeTest", listeArticleTestMagasin);
		
		
		//Definition du scanner qui lira les entrees client en console
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 : Afficher l'ensemble des articles disponibles a la location");
		System.out.println("2 : Enregistrer location");
		System.out.println("3 : Supprimer location");
		System.out.println("4 : Afficher l'ensemble des locations en cours pour un client");
		System.out.println("5 : Calculer le montant total de ses recettes sur une periode donnee");
		System.out.println("Veuillez saisir le numero de l'action que vous souhaitez executer : ");
		String str = sc.nextLine();
		for(int i = 1; i<=1 ;i++){
			if (Integer.parseInt(str)!=1 && Integer.parseInt(str)!=2 && Integer.parseInt(str)!=3 && Integer.parseInt(str)!=4 && Integer.parseInt(str)!=5){
				System.out.println("Identifiant de commande non trouve veuillez reessayer");
				main(args);
			}
			if(Integer.parseInt(str)==1){
				System.out.println("Afficher l'ensemble des articles disponibles a la location");
				for (Article currArticle : mag_test.getListeArticle()) {
					if (currArticle.isDisponible()) {
						System.out.println(currArticle);
					}
				}
				break;
			}
			if(Integer.parseInt(str)==2){
				System.out.println("Enregistrer location");
				for (Article currArticle : mag_test.getListeArticle()) {
					if (currArticle.isDisponible()) {
						System.out.println(currArticle);
					}
				}
				System.out.println("Entrer les id d'articles que vous voulez entrer avec une virgule entre chaque");
				ArrayList<Article> listArticleToAdd =new ArrayList<Article>();	
				Scanner sc3 = new Scanner(System.in);
				String strIdArticle = sc3.nextLine();
				String[] listStrIdArticle = strIdArticle.split(",");
				for (String currentStrID : listStrIdArticle) {
					for (Article currArticle : mag_test.getListeArticle()){
						if (currArticle.getRef() == Integer.parseInt(currentStrID)) {
							listArticleToAdd.add(currArticle);
						}
					}
				}
				System.out.println("Entrer une date de debut au format YYYY/MM/JJ");
				String strDateDebutNewLoc = sc3.nextLine();
				if (strDateDebutNewLoc.length()==10 && (strDateDebutNewLoc.charAt(4)=='/' && strDateDebutNewLoc.charAt(7)=='/')){
					if (strDateDebutNewLoc.matches("^\\d+(\\/\\d+)*$")){
						System.out.println("Entrer une date de fin au format YYYY/MM/JJ");
						String strDateFinNewLoc = sc3.nextLine();
						if (strDateFinNewLoc.length()==10 && (strDateFinNewLoc.charAt(4)=='/' && strDateFinNewLoc.charAt(7)=='/')){
							if (strDateFinNewLoc.matches("^\\d+(\\/\\d+)*$")){
								ArrayList<Date> listDate = getDateWithStr(strDateDebutNewLoc, strDateFinNewLoc);
								System.out.println("Entrer le montant de la facture");
								String strMontantFacture = sc3.nextLine();
								if (strMontantFacture.matches("[0-9]")){
									for (Client currClient : listeClientTest) {
										System.out.println(currClient);
									}
									String strIndexClientNewLoc = sc3.nextLine();
									for (Client currClient : listeClientTest) {
										if (Integer.parseInt(strIndexClientNewLoc)==currClient.getId()) {
											Location myNewLocation = new Location(5, listArticleToAdd, listDate.get(0), listDate.get(1), Integer.parseInt(strMontantFacture), currClient);
										}else {
											System.out.println("Id de client non valide");
										}
									}
								}else {
									System.out.println("Veuillez rentrer des entiers seulement");
								}
							}else {
								System.out.println("Requete annulee format date incorrect, verifiez que vous entrer seulement des nombres et des /");
							}
						}else {
							System.out.println("Requete annulee format date incorrect");
						}
					}else {
						System.out.println("Requete annulee format date incorrect, verifiez que vous entrer seulement des nombres et des /");
					}
				}else {
					System.out.println("Requete annulee format date incorrect");
				}
			}
			if(Integer.parseInt(str)==3){
				System.out.println("Supprimer location");
				for (Client currClient : listeClientTest) {
					System.out.println(currClient);
				}
				System.out.println("Entrer l'id du client pour lequel vous souhaitez retirer une location");
				Scanner sc2 = new Scanner(System.in);
				String strIndexClient = sc2.nextLine();
				for (Client currClient : listeClientTest) {
					if (Integer.parseInt(strIndexClient)==currClient.getId()) {
						currClient.afficherLocationEnCours();
						System.out.println("Entrer l'id de la location que vous souhaitez retirer");
						String strIndexLoc = sc2.nextLine();
						for (Location locDelete : currClient.getListeLocation()) {
							if (locDelete.getId()==Integer.parseInt(strIndexLoc)) {
								currClient.retirerLocation(locDelete);
							}else {
								System.out.println("Id de location non valide");
							}							
						}
					}else {
						System.out.println("Id de client non valide");
					}
				}
				break;
			}
			if(Integer.parseInt(str)==4){
				System.out.println("Afficher l'ensemble des locations en cours pour un client");
				Client clientSelect = choixClient(listeClientTest);
				if (clientSelect!=null){
					clientSelect.afficherLocationEnCours();
					break;
					}else{
					System.out.println("Retour au menu principal");
					main(args);
					}
			}
			if(Integer.parseInt(str)==5){
				System.out.println("Calculer le montant total de ses recettes sur une periode donnee");
				System.out.println("Entrer une date de debut au format YYYY/MM/JJ");
				Scanner sc1 = new Scanner(System.in);
				String strDateDebut = sc1.nextLine();
				if (strDateDebut.length()==10 && (strDateDebut.charAt(4)=='/' && strDateDebut.charAt(7)=='/')){
					if (strDateDebut.matches("^\\d+(\\/\\d+)*$")){
						System.out.println("Entrer une date de fin au format YYYY/MM/JJ");
						String strDateFin = sc1.nextLine();
						if (strDateFin.length()==10 && (strDateFin.charAt(4)=='/' && strDateFin.charAt(7)=='/')){
							if (strDateFin.matches("^\\d+(\\/\\d+)*$")){
								ArrayList<Date> listDate = getDateWithStr(strDateDebut, strDateFin);
								try {
									mag_test.getMontantRecette(listDate.get(0), listDate.get(1), false);
									break;
								} catch (NumberFormatException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}else {
								System.out.println("Requete annulee format date incorrect, verifiez que vous entrer seulement des nombres et des /");
							}
						}else {
							System.out.println("Requete annulee format date incorrect");
						}
					}else {
						System.out.println("Requete annulee format date incorrect, verifiez que vous entrer seulement des nombres et des /");
					}
				}else {
					System.out.println("Requete annulee format date incorrect");
				}
			}
		}
	}
	
	public static ArrayList<Date> getDateWithStr(String dateDebut, String dateFin) {
		ArrayList<Date> listeDate = new ArrayList<Date>();
		String[] listSplitStrDebut = dateDebut.split("/");
		String strMoisDebut = listSplitStrDebut[1];
		String strAnneeDebut = listSplitStrDebut[2];
		if (strMoisDebut.length()==2) {
			strMoisDebut = strMoisDebut.substring(1);
		}
		if (strAnneeDebut.length()==2) {
			strAnneeDebut = strAnneeDebut.substring(1);
		}
		Date myDateDebut = new Date(Integer.parseInt(listSplitStrDebut[0]), Integer.parseInt(strMoisDebut), Integer.parseInt(strAnneeDebut));
		String[] listSplitStrFin = dateFin.split("/");
		String strMoisFin = listSplitStrFin[1];
		String strAnneeFin = listSplitStrFin[2];
		if (strMoisFin.length()==2) {
			strMoisFin = strMoisFin.substring(1);
		}
		if (strAnneeFin.length()==2) {
			strAnneeFin = strAnneeFin.substring(1);
		}
		Date myDateFin = new Date(Integer.parseInt(listSplitStrFin[0]), Integer.parseInt(strMoisFin), Integer.parseInt(strAnneeFin));
		if(myDateDebut.compareTo(myDateFin)<=0) {
			listeDate.add(myDateDebut);
			listeDate.add(myDateFin);
			return listeDate;
		}else {
			System.out.println("Traitement impossible la date de Fin est anterieur a la date de debut");
			return null;
		}
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

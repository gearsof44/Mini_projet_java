package Tests;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;

import Main.*;

/**
 * @author GUILLET & COTTREL
 *
 */

public class TestClient {

	public static void main (String args[]) throws IOException{
		ArrayList<Article> listeArticleTest = new ArrayList<Article>();
		listeArticleTest.add(new SouleveMalade(1224, "Soulevator", "SV-6", 222, 14,250, 360));
		listeArticleTest.add(new MatelasAAir(1224, "Matmoila", "PX9", 22, 4, "14cm","45cm", "85cm", 85.5, 30));
		listeArticleTest.add(new TableAtile(1224, "Soulevator", "SV-6", 2, 14, 4, "14cm","45cm", "85cm", true));
		Date dateDebutTest = new Date(2017,9,6);
		Date dateFinTest = new Date(2017,9,17);
		ArrayList<Location> listeLocationTest = new ArrayList<Location>();
		Client myClientTest = new Client(1, "DIDIER", "Jean", "ICI", "0658459545", listeLocationTest);
		Location loc = new Location(listeArticleTest, dateFinTest, dateFinTest, 110, myClientTest);
		Location loc2 = new Location(listeArticleTest, dateFinTest, dateFinTest, 110, null);
		
		//Test affichage des locations en cours pour un client
		TestAfficherLocationEnCours(myClientTest);
		//Test de l'archivage d'une location
		TestArchivageLocation(myClientTest, loc);
	}
	
	//Test affichage des locations en cours pour un client
	public static void TestAfficherLocationEnCours(Client client) {
		System.out.println("Test 1 : TestAfficherLocationEnCours");
		client.afficherLocationEnCours();
	}
	
	//Test de l'archivage d'une location
	public static void TestArchivageLocation(Client client, Location location) {
		System.out.println("Test 2 : TestArchivageLocation");
		client.ajouterLocation(location);
		client.retirerLocation(location, true);
		//Prend le chemin absolu vers le dossier LocationMaterielMedical de l'utilisateur courant
		Path currentPath = Paths.get(System.getProperty("user.dir"));
		//Ajoute au chemin precedemment obtenu le chemin vers le dossier de LOG
		Path filePath = Paths.get(currentPath.toString(), "LOG");
		//Affiche le resultat a l'utilisateur
		System.out.println("Rendez-vous sous le chemin suivant pour obtenir votre fichier : "+filePath);
	}
}

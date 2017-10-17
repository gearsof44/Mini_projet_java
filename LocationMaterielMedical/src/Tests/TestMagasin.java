package Tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import Main.*;

/**
 * @author GUILLET & COTTREL
 *
 */

public class TestMagasin {
	
	public static void main (String args[]) throws NumberFormatException, IOException{
	
		//Definition d'une liste d'objets Article
		ArrayList<Article> listeArticleTestMagasin =new ArrayList<Article>();	
		
		//Definition de different articles
		SouleveMalade soum=new SouleveMalade(1224, "Soulevator", "SV-6", 22.2, 14,850, 360);
		LitMecanise litm=new LitMecanise(1442, "LitMax", "LM-2", 14.56, 224, 450,"180", "120", "60", 360);
		FauteuilRoulant fautr=new FauteuilRoulant(2578, "RoueLibre", "RL-52", 8.2, 887,85, 12.3);
		MatelasAAir mataa=new MatelasAAir(339, "MatelasGonflette", "MG-44", 6.45, 78, "220","180", "20", 570.0, 3);
		TableAtile tabat=new TableAtile(12, "TableTuile", "TT-12", 4.44, 120, 85,"80", "120", "90", true);
		
		//Ajout de tous les articles definient precedemment
		//dans une liste d'objets Article
		listeArticleTestMagasin.add(soum);
		listeArticleTestMagasin.add(litm);
		listeArticleTestMagasin.add(fautr);
		listeArticleTestMagasin.add(mataa);
		listeArticleTestMagasin.add(tabat);
		
		Date dateTest = new Date(2017,9,17);
		Magasin mag_test = new Magasin("MonGerantTest", "AdresseDeTest", listeArticleTestMagasin);
		
		//Test de calcul des recettes sur une periode donnee
		TestGetMontantRecette(mag_test, dateTest, dateTest);
	}
	
	public static void TestGetMontantRecette(Magasin magasin, Date dateDebutLocation, Date dateFinLocation) throws NumberFormatException, IOException {
		System.out.println("Test 1 : TestGetMontantRecette");
		magasin.getMontantRecette(dateFinLocation,dateFinLocation, true);
	}
	
}

package Main;
import java.util.ArrayList;

/**
 * 
 * @author GUILLET & COTTREL
 *
 */

public class TableAtile extends TableEtLit{
	private boolean rabattre;
	
	//Constructeur
	public TableAtile(int ref, String marque, String modele, double prixLocationJour, int nbStock, int poidsMax,
			String longueur, String largeur, String hauteur, boolean rabattre) {
		super(ref, marque, modele, prixLocationJour, nbStock, poidsMax, longueur, largeur, hauteur);
		this.rabattre = rabattre;
	}
	
	//getter setter
	public boolean isRabattre() {
		return rabattre;
	}

	public void setRabattre(boolean rabattre) {
		this.rabattre = rabattre;
	}
	
	//Affiche l'article
		public void afficherArticles(ArrayList<Article> articles){  
			System.out.println("Reference: "+getRef());
			System.out.println("Marque: "+getMarque());
			System.out.println("Modele: "+getModele());
			System.out.println("Prix de la location par jour: "+getPrixLocationJour());
			System.out.println("Nombre restant en stock: "+getNbStock());			if(isRabattre()){
				System.out.println("La table peut se rabattre");
			}else{
				System.out.println("La table ne peut pas se rabattre");
			}
		}
}

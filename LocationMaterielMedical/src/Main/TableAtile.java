package Main;
import java.util.ArrayList;

/**
 * 
 * @author GUILLET & COTTREL
 *
 */

public class TableAtile extends TableEtLit{
	 //attributs

	private boolean rabattre;
	
	//Constructeur
	public TableAtile(int ref, String marque, String modele, double prixLocationJour, int nbStock, int poidsMax, 
			String longueur, String largeur, String hauteur,boolean rabattre) {
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
	public void afficherArticles(){  
		System.out.println("Reference: "+getRef());
		System.out.println("Marque: "+getMarque());
		System.out.println("Modele: "+getModele());
		System.out.println("Prix de la location par jour: "+getPrixLocationJour());
		System.out.println("Nombre restant en stock: "+getNbStock());
		System.out.println("longueur: "+getLongueur());
		System.out.println("largeur: "+getLargeur());
		System.out.println("hauteur: "+getHauteur());
		System.out.println("poids maxium supporté: "+getPoidsMax());
			if(isRabattre()){
				System.out.println("La table peut se rabattre");
			}else{
				System.out.println("La table ne peut pas se rabattre");
			}
		}
	
	@Override
	public String toString() {
		return "TableAtile ["+super.toString()+", rabattre=" + rabattre + "]";
	}
}

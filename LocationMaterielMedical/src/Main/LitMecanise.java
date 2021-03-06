package Main;
import java.util.ArrayList;

/**
 * 
 * @author GUILLET & COTTREL
 *
 */

public class LitMecanise extends TableEtLit{
	
	//attributs
	private int degreInclinaison;
	
	/**
	 * @param ref
	 * @param marque
	 * @param modele
	 * @param prixLocationJour
	 * @param nbStock
	 * @param poidsMax
	 * @param longueur
	 * @param largeur
	 * @param hauteur
	 * @param degreInclinaison
	 */
	//Constructeur
	public LitMecanise(int ref, String marque, String modele, double prixLocationJour, int nbStock,int poidsMax, 
			String longueur, String largeur, String hauteur, int degreInclinaison) {
		super(ref, marque, modele, prixLocationJour, nbStock, poidsMax, longueur, largeur, hauteur);
		this.degreInclinaison = degreInclinaison;
	}
	
	//getter setter

	public int getDegreInclinaison() {
		return degreInclinaison;
	}

	public void setDegreInclinaison(int degreInclinaison) {
		this.degreInclinaison = degreInclinaison;
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

			System.out.println("Degre d'inclinaison: "+getDegreInclinaison());
		}
		
	@Override
	public String toString() {
		return "LitMecanise ["+super.toString() + ", "+ "degreInclinaison=" + degreInclinaison +"]";
	}

}

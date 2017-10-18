package Main;
import java.util.ArrayList;

/**
 * 
 * @author GUILLET & COTTREL
 *
 */

public abstract class Article {
	
	//attributs
	private int ref;
	private String marque;
	private String modele;
	private double prixLocationJour;
	private int nbStock;
	private boolean disponible;
	
	/**
	 * 
	 * @param ref
	 * @param marque
	 * @param modele
	 * @param prixLocationJour
	 */
	//Constructeur
	public Article(int ref, String marque, String modele, double prixLocationJour, int nbStock) {
		this.ref = ref;
		this.marque = marque;
		this.modele = modele;
		this.prixLocationJour = prixLocationJour;
		this.nbStock = nbStock;
		this.disponible = true;
	}
	
	//getter setter
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public double getPrixLocationJour() {
		return prixLocationJour;
	}
	public void setPrixLocationJour(double prixLocationJour) {
		this.prixLocationJour = prixLocationJour;
	}
	public int getNbStock() {
		return nbStock;
	}
	public void setNbStock(int nbStock) {
		this.nbStock = nbStock;
	}
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public static void afficherTousArticles(ArrayList<Article> listeArticle){
	for(Article a:listeArticle){
			a.afficherArticles();
		}
	}

	//Affiche les specificites de l'article
	public abstract void afficherArticles();
	
	@Override
	public String toString() {
		return "ref=" + ref + ", marque=" + marque + ", modele=" + modele + ", prixLocationJour="
			+ prixLocationJour + ", nbStock=" + nbStock + ", disponible=" + disponible;
	}
}

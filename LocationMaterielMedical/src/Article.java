/**
 * 
 * @author GUILLET & COTTREL
 *
 */
public class Article {
	private int ref;
	private String marque;
	private String modele;
	private double prixLocationJour;
	private int nbStock;
	//Constructeur
	public Article(int ref, String marque, String modele, double prixLocationJour, int nbStock) {
		super();
		this.ref = ref;
		this.marque = marque;
		this.modele = modele;
		this.prixLocationJour = prixLocationJour;
		this.nbStock = nbStock;
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
	//Affiche les specificités de l'article
	public void afficherArticles(){  
		System.out.println("Reference: "+getRef());
		System.out.println("Marque: "+getMarque());
		System.out.println("Modele: "+getModele());
		System.out.println("Prix de la location par jour: "+getPrixLocationJour());
		System.out.println("Nombre restant en stock: "+getNbStock());


	}
}

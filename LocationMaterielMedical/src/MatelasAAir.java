/**
 * 
 * @author GUILLET & COTTREL
 *
 */
public class MatelasAAir extends Article{

	private String longueur;
	private String largeur;
	private String hauteur;
	private double poidsMax;
	private int tempsGonflage;
	//Constructeur

	public MatelasAAir(int ref, String marque, String modele, double prixLocationJour, int nbStock, String longueur,
			String largeur, String hauteur, double poidsMax, int tempsGonflage) {
		super(ref, marque, modele, prixLocationJour, nbStock);
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.poidsMax = poidsMax;
		this.tempsGonflage = tempsGonflage;
	}
	//getter setter

	public String getLongueur() {
		return longueur;
	}
	public void setLongueur(String longueur) {
		this.longueur = longueur;
	}
	public String getLargeur() {
		return largeur;
	}
	public void setLargeur(String largeur) {
		this.largeur = largeur;
	}
	public String getHauteur() {
		return hauteur;
	}
	public void setHauteur(String hauteur) {
		this.hauteur = hauteur;
	}
	public double getPoidsMax() {
		return poidsMax;
	}
	public void setPoidsMax(double poindMax) {
		this.poidsMax = poindMax;
	}
	public int getTempsGonflage() {
		return tempsGonflage;
	}
	public void setTempsGonflage(int tempsGonflage) {
		this.tempsGonflage = tempsGonflage;
	}
	//Affiche l'article
	public void afficherArticles(){  
		super.afficherArticles();
		System.out.println("longueur: "+getLongueur());
		System.out.println("largeur: "+getLargeur());
		System.out.println("hauteur: "+getHauteur());
		System.out.println("poids max: "+getPoidsMax());
		System.out.println("temps de gonflage: "+getTempsGonflage());

	}
}

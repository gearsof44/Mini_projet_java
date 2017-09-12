/**
 * 
 * @author GUILLET & COTTREL
 *
 */
public class TableEtLit extends Article{
	private int poidsMax;
	private String longueur;
	private String largeur;
	private String hauteur;
	//Constructeur

	public TableEtLit(int ref, String marque, String modele, double prixLocationJour, int nbStock, int poidsMax,
			String longueur, String largeur, String hauteur) {
		super(ref, marque, modele, prixLocationJour, nbStock);
		this.poidsMax = poidsMax;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	//getter setter

	public int getPoidsMax() {
		return poidsMax;
	}
	public void setPoidsMax(int poidsMax) {
		this.poidsMax = poidsMax;
	}
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
	//Affiche l'article
		public void afficherArticles(){  
			super.afficherArticles();
			System.out.println("longueur: "+getLongueur());
			System.out.println("largeur: "+getLargeur());
			System.out.println("hauteur: "+getHauteur());
			System.out.println("poids maxium supporté: "+getPoidsMax());
		}
}

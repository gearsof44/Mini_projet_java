
public class MatelasAAir extends Article{

	private String longueur;
	private String largeur;
	private String hauteur;
	private double poindMax;
	private int tempsGonflage;
	
	/**
	 * @param ref
	 * @param marque
	 * @param modele
	 * @param prixLocationJour
	 * @param nbStock
	 * @param longueur
	 * @param largeur
	 * @param hauteur
	 * @param poindMax
	 * @param tempsGonflage
	 */
	public MatelasAAir(int ref, String marque, String modele, double prixLocationJour, int nbStock, String longueur,
			String largeur, String hauteur, double poindMax, int tempsGonflage) {
		super(ref, marque, modele, prixLocationJour, nbStock);
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.poindMax = poindMax;
		this.tempsGonflage = tempsGonflage;
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
	public double getPoindMax() {
		return poindMax;
	}
	public void setPoindMax(double poindMax) {
		this.poindMax = poindMax;
	}
	public int getTempsGonflage() {
		return tempsGonflage;
	}
	public void setTempsGonflage(int tempsGonflage) {
		this.tempsGonflage = tempsGonflage;
	}

}

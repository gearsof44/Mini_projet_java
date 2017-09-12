
/**
 * @author visiteur-info11
 *
 */
public class TableEtLit extends Article{
	private int poidsMax;
	private String longueur;
	private String largeur;
	private String hauteur;
	
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
	 */
	public TableEtLit(int ref, String marque, String modele, double prixLocationJour, int nbStock, int poidsMax,
			String longueur, String largeur, String hauteur) {
		super(ref, marque, modele, prixLocationJour, nbStock);
		this.poidsMax = poidsMax;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
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
}

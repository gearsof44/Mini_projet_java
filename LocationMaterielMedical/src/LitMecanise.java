/**
 * 
 * @author GUILLET & COTTREL
 *
 */
public class LitMecanise extends TableEtLit{
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
	public LitMecanise(int ref, String marque, String modele, double prixLocationJour, int nbStock, int poidsMax,
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
			super.afficherArticles();
			System.out.println("Degré d'inclinaison: "+getDegreInclinaison());
		}

}

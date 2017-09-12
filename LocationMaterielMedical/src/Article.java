
public class Article {
	
	private int ref;
	private String marque;
	private String modele;
	private double prixLocationJour;
	private int nbStock;
	
	/**
	 * @param ref
	 * @param marque
	 * @param modele
	 * @param prixLocationJour
	 * @param nbStock
	 */
	public Article(int ref, String marque, String modele, double prixLocationJour, int nbStock) {
		super();
		this.ref = ref;
		this.marque = marque;
		this.modele = modele;
		this.prixLocationJour = prixLocationJour;
		this.nbStock = nbStock;
	}
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
}

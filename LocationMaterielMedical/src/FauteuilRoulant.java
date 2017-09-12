/**
 * 
 * @author GUILLET & COTTREL
 *
 */
public class FauteuilRoulant extends Article{
	private int largeurAssise;
	private double poidsFauteuil;
	//Constructeur

	public FauteuilRoulant(int ref, String marque, String modele, double prixLocationJour, int nbStock,
			int largeurAssise, double poidsFauteuil) {
		super(ref, marque, modele, prixLocationJour, nbStock);
		this.largeurAssise = largeurAssise;
		this.poidsFauteuil = poidsFauteuil;
	}
	//getter setter

	public int getLargeurAssise() {
		return largeurAssise;
	}
	public void setLargeurAssise(int largeurAssise) {
		this.largeurAssise = largeurAssise;
	}
	public double getPoidsFauteuil() {
		return poidsFauteuil;
	}
	public void setPoidsFauteuil(double poidsFauteuil) {
		this.poidsFauteuil = poidsFauteuil;
	}
	//Affiche l'article
		public void afficherArticles(){  
			super.afficherArticles();
			System.out.println("Largeur de la place assise: "+getLargeurAssise());
			System.out.println("Poids total du fauteil: "+getPoidsFauteuil());
		}
}

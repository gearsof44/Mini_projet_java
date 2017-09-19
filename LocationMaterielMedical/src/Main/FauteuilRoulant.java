package Main;
import java.util.ArrayList;

/**
 * 
 * @author GUILLET & COTTREL
 *
 */
public class FauteuilRoulant extends Article{
	 //attributs

	private int largeurAssise;
	private double poidsFauteuil;
	
	/**
	 * @param ref
	 * @param marque
	 * @param modele
	 * @param prixLocationJour
	 * @param nbStock
	 * @param largeurAssise
	 * @param poidsFauteuil
	 */
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
		

	@Override
	public void afficherArticles() {
		System.out.println("Reference: "+getRef());
		System.out.println("Marque: "+getMarque());
		System.out.println("Modele: "+getModele());
		System.out.println("Prix de la location par jour: "+getPrixLocationJour());
		System.out.println("Nombre restant en stock: "+getNbStock());			System.out.println("Largeur de la place assise: "+getLargeurAssise());
		System.out.println("Poids total du fauteil: "+getPoidsFauteuil());			
	}
	
	@Override
	public String toString() {
		return "FauteuilRoulant ["+super.toString() +", largeurAssise=" + largeurAssise + ", poidsFauteuil=" + poidsFauteuil
				+"]";
	}
	
}

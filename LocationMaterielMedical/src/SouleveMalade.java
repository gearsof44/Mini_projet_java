import java.util.ArrayList;

/**
 * 
 * @author GUILLET & COTTREL
 *
 */
public class SouleveMalade extends Article{
	private int capaciteLevage;
	private int degrePivotFleau;
	
	//Constructeur
	public SouleveMalade(int ref, String marque, String modele, double prixLocationJour, int nbStock,
			int capaciteLevage, int degrePivotFleau) {
		super(ref, marque, modele, prixLocationJour, nbStock);
		this.capaciteLevage = capaciteLevage;
		this.degrePivotFleau = degrePivotFleau;
	}
	
	//getter setter
	public int getCapaciteLevage() {
		return capaciteLevage;
	}
	public void setCapaciteLevage(int capaciteLevage) {
		this.capaciteLevage = capaciteLevage;
	}
	public int getDegrePivotFleau() {
		return degrePivotFleau;
	}
	public void setDegrePivotFleau(int degrePivotFleau) {
		this.degrePivotFleau = degrePivotFleau;
	}
	
	//Affiche l'article
	public void afficherArticles(ArrayList<Article> articles) {
			System.out.println("Reference: "+getRef());
			System.out.println("Marque: "+getMarque());
			System.out.println("Modele: "+getModele());
			System.out.println("Prix de la location par jour: "+getPrixLocationJour());
			System.out.println("Nombre restant en stock: "+getNbStock());			System.out.println("Capacité de levage: "+getCapaciteLevage());
			System.out.println("degré de pivot du fleau: "+getDegrePivotFleau());
		}

}


/**
 * @author GUILLET & COTTREL
 *
 */

public class SouleveMalade extends Article{
	private int capaciteLevage;
	private int degrePivotFleau;
	public SouleveMalade(int ref, String marque, String modele, double prixLocationJour, int nbStock,
			int capaciteLevage, int degrePivotFleau) {
		super(ref, marque, modele, prixLocationJour, nbStock);
		this.capaciteLevage = capaciteLevage;
		this.degrePivotFleau = degrePivotFleau;
	}
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

}

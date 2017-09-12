
public class FauteuilRoulant extends Article{
	private int largeurAssise;
	private double poidsFauteuil;
	
	public FauteuilRoulant(int ref, String marque, String modele, double prixLocationJour, int nbStock,
			int largeurAssise, double poidsFauteuil) {
		super(ref, marque, modele, prixLocationJour, nbStock);
		this.largeurAssise = largeurAssise;
		this.poidsFauteuil = poidsFauteuil;
	}
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

}


public class TableAtile extends TableEtLit{
	private boolean rabattre;

	public TableAtile(int ref, String marque, String modele, double prixLocationJour, int nbStock, int poidsMax,
			String longueur, String largeur, String hauteur, boolean rabattre) {
		super(ref, marque, modele, prixLocationJour, nbStock, poidsMax, longueur, largeur, hauteur);
		this.rabattre = rabattre;
	}

	public boolean isRabattre() {
		return rabattre;
	}

	public void setRabattre(boolean rabattre) {
		this.rabattre = rabattre;
	}
}

/*
 * Sudoku.java
 * @author Alex
 * @date 08 déc. 2020
 */
package formation1.sudoku;

public class Sudoku {
	
	
	private int[] lignes; // Numéro de lignes du sudoku
	private int[] colonnes; // Numéro de colonnes du sudoku
	
	private int numLignes;
	private int numColonnes;
	
	private final int NB_LIGNES = 9; // Nb de lignes du sudoku
	private final int NB_COLONNES = 9; // Nb de colonnes du sudoku
	
	public void gestionDuJeu() {
		
		
		
	}
	
	
	
	Sudoku (int p_lignes, int p_colonnes) {
		numLignes = p_lignes;
		numColonnes = p_colonnes;
	}	
	
	
	/**
	 * 
	 * @param p_ligne
	 * @return
	 */
	public boolean verificationLignes (int[] p_ligne) {
		
		
		// On crée un tablea qui copier les valeurs de la ligne
		int[] TableauValeursATester = p_ligne;

		// On parcourt chaque valeur des deux tableaux
		for (int indiceColonne : p_ligne) {
			
			TableauValeursATester[indiceColonne] = (Integer) null; // On supprime la valeur dans le tableau de test

			for (int indiceTableauValeursATESTER : TableauValeursATester)
				

				if (p_ligne[indiceColonne] == TableauValeursATester[indiceColonne]) { //Si on retrouve le caractère supprimé 
					return false; // dans le tableau de test, cela siginfie qu'il était deux fois dans le tableau donc on retourne false
				}

		}
		
		return true;
	}
	
	public boolean verificationColonne (Bloc p_bloc) {
		
		
		
		return false;
	}
	
	
	public boolean verificationBloc (Bloc p_bloc) {
		
		
		
		return false;
	}
	

}

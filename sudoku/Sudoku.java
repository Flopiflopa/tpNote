/*
 * Sudoku.java
 * @author Alex
 * @date 08 d�c. 2020
 */
package formation1.sudoku;

public class Sudoku {
	
	
	private int[] lignes; // Num�ro de lignes du sudoku
	private int[] colonnes; // Num�ro de colonnes du sudoku
	
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
		
		
		// On cr�e un tablea qui copier les valeurs de la ligne
		int[] TableauValeursATester = p_ligne;

		// On parcourt chaque valeur des deux tableaux
		for (int indiceColonne : p_ligne) {
			
			TableauValeursATester[indiceColonne] = (Integer) null; // On supprime la valeur dans le tableau de test

			for (int indiceTableauValeursATESTER : TableauValeursATester)
				

				if (p_ligne[indiceColonne] == TableauValeursATester[indiceColonne]) { //Si on retrouve le caract�re supprim� 
					return false; // dans le tableau de test, cela siginfie qu'il �tait deux fois dans le tableau donc on retourne false
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

/*
 * TestSaisieCase.java
 * @author Alex
 * @date 08 d�c. 2020
 */
package formation1.sudoku.tests;

public class TestSaisieCase {


	@BeforeEach
	void initialiser() {

		Sudoku sudokuTest = new Sudoku(4,4);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}


	public void saisieCase() {

		for (int indiceLigne = 0; indiceLigne < numLignes; indiceLigne++) {

			for (int indiceColonne = 0; indiceColonne < numColonnes; indiceColonne++) {

				System.out.println("Num�ro de ligne : ");
				// Refaire saisie tant que ccor inf � 0 ou sup � NB_LIGNES
				numLignes = entree.nextInt();
				System.out.println("Num�ro de colonne : ");
				// Refaire saisie tant que ccor inf � 0 ou sup � NB_COLONNES
				numColonnes = entree.nextInt();
				System.out.println("Saisisez caract�re � placer");

			}
		}

	}

}

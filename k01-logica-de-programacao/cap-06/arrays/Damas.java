/* VERSAO 1 */
/*
class Damas {
	public static void main(String[] args) {

		char [][] tabuleiro = new char[8][];
		
		for (int i = 0; i < tabuleiro.length; i++) {
			
			tabuleiro[i] = new char[8];
		}
	
		for (int i = 0; i < tabuleiro.length; i++) {
		
			for (int j = 0; j < tabuleiro[i].length; j++) {
			
				if ((i == 0 && j % 2 == 1) || (i == 1 && j % 2 == 0)) {
				
					tabuleiro[i][j] = ’0 ’;
				
				} else if ((i == 6 && j % 2 == 1) || (i == 7 && j % 2 == 0)) {

					tabuleiro[i][j] = ’* ’;
				} else {

					tabuleiro[i][j] = ’ ’;
				}
			}
		}

		System.out.println("---------------------------------");

		for (int i = 0; i < tabuleiro.length; i++) {

			String linha = " | ";
	
			for (int j = 0; j < tabuleiro[i].length; j++) {

				linha += " " + tabuleiro[i][j] + " | ";
			}

			System.out.println(linha);
			System.out.println("---------------------------------");
		}
	}
}
*/
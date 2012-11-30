/* VERSAO 1 */
/*
class Damas
{
	public void Main ()
	{
		
		char [][] tabuleiro = new char[8][];
		
		for (int i = 0; i < tabuleiro.Length; i++)
		{
			
			tabuleiro[i] = new char[8];
		}

		for (int i = 0; i < tabuleiro.Length; i++)
		{
			
			for (int j = 0; j < tabuleiro[i].Length; j ++)
			{
			
				if ((i == 0 && j %2 == 1) || (i == 1 && j %2 == 0))
				{

					tabuleiro[i][j] = ’0 ’;
				}
				
				else if ((i == 6 && j %2 == 1) || (i == 7 && j %2 == 0))
				{
					
					tabuleiro[i][j] = ’* ’;
				}
				
				else
				{

					tabuleiro[i][j] = ’ ’;
				}
			}
		}

		System.ConsoleWriteLine("---------------------------------");

		for (int i = 0; i < tabuleiro.Length; i++)
		{

			string linha = " | ";

			for (int j = 0; j < tabuleiro[i].Length; j++)
			{

				linha += " " + tabuleiro[i][j] + " | ";
			}
	
			System.ConsoleWriteLine(linha);
			System.ConsoleWriteLine("---------------------------------");
		}
	}
}
*/
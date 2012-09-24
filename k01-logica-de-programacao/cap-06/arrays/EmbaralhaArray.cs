/* VERSAO 1 */
/*
class EmbaralhaArray
{
	static void Main ()
	{
		int [] array = new int [10];

		System.Random geradorDeNumeroAleatorio = new System.Random();

		for (int i = 0; i < array.Length; i ++)
		{
		
			array[i] = i;
		}

		for (int i = 0; i < array.Length; i ++)
		{
			
			System.Console.WriteLine(array[i]);
		}
		for (int i = 0; < 10; i ++)
		{
			
			int posicao1 = geradorDeNumeroAleatorio.Next(0,11);
			int posicao2 = geradorDeNumeroAleatorio.Next(0,11);
			int auxiliar = array[posicao1];
							
			array[posicao1] = array[posicao2];
			array[posicao2] = auxiliar;
		}
		System.Console.WriteLine("--------------------");

		for (int i = 0; i < array.Length; i ++)
		{
			
			System.Console.WriteLine(array[i]);
		}
	}
}
*/
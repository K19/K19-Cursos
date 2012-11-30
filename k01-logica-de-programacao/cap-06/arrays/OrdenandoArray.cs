/* VERSAO 1 */
/*
class OrdenandoArray
{
	static void Main()
	{
		int [] array = new int[15];
		System.Random geradorDeNumeroAleatorio = new System.Random();
	
		for (int i = 0; i < array.Length; i++)
		{
			array[i] = geradorDeNumeroAleatorio.Next(0, 100);
		}

		for (int i = 0; i < array.Length; i++)
		{
			System.Console.WriteLine(array[i]);
		}

		for (int i = array.Length; i >= 1; i--)
		{
			for (int j = 1; j < i; j++)
			{
				if (array[j - 1] > array[j])
				{
					int auxiliar = array[j];

					array[j] = array[j - 1];
					array[j - 1] = auxiliar;
				}
			}
		}
		System.Console.WriteLine("----------------------");
		
		for (int i = 0; i < array.Length; i++)
		{
			System.Console.WriteLine(array[i]);
		}
	}
}
*/
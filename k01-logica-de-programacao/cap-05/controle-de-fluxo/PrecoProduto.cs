/* VERSAO 1 */
/*
class PrecoProduto
{
	static void Main ()
	{
		double precoDoProduto1 = 5325.12;

		double precoDoProduto2 = 4366.34;

		if (precoDoProduto1 < precoDoProduto2)
		{
			System.Console.WriteLine(" O produto 2 é o mais caro. ");
		}
		else if (precoDoProduto2 < precoDoProduto1)
		{
			System.Console.WriteLine("O produto 1 é o mais caro. ");
		}
	}
}
*/

/* VERSAO 2 */
/*
class PrecoProduto
{
	static void Main ()
	{
		System.Random gerador = new System.Random() ;

		double precoDoProduto1 = gerador.NextDouble() * 1000;

		double precoDoProduto2 = gerador.NextDouble() * 1000;
		
		System.Console.WriteLine("precoDoProduto1 = " + precoDoProduto1);

		System.Console.WriteLine("precoDoProduto2 = " + precoDoProduto2);

		if (precoDoProduto1 < precoDoProduto2)
		{

			System.Console.WriteLine("O produto 2 é o mais caro.");
		}

		else if (precoDoProduto2 < precoDoProduto1)
		{

			System.Console.WriteLine("O produto 1 é o mais caro.");
		}
	}
}
*/
/* VERSAO 1 */
/*
class ADivisivelPorB
{
	static void Main ()
	{

		int a = 246;
	
		int b = 3;
	
		if (a % b == 0)
		{

			System.Console.WriteLine("É divisível");
		}
		else
		{
			
			System.Console.WriteLine("Não é divisível");
		}
	}
}
*/

/* VERSAO 2 */
/*
class ADivisivelPorB
{
	static void Main ()
	{
		System.Random gerador = new System.Random();

		int a = gerador.Next (1000);

		int b = gerador.Next (5) + 1;

		System.Console.WriteLine("a = " + a);

		System.Console.WriteLine("b = " + b);

		if ( a % b == 0)
		{
			
			System.Console.WriteLine("É divisível");
		}
		else
		{
			
			System.Console.WriteLine("Não é divisível");
		}
	}
}
*/
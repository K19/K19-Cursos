/* VERSAO 1 */
/*
class Saudacao
{
	static void Main ()
	{

		int hora = 22;
		
		if (hora >= 0 && hora < 12)
		{

			System.Console.WriteLine("Bom dia");
		}		

		else if (hora >= 12 && hora < 18)
		{
	
			System.Console.WriteLine("Boa tarde");
		}

		else if (hora >= 18 && hora < 24)
		{

			System.Console.WriteLine("Boa noite");
		}
		
		else
		{
			
			System.Console.WriteLine("Unibanco 30 horas : P");
		}
	}
}
*/

/* VERSAO 2 */
/*
class Saudacao
{
	static void Main ()
	{
		System . Random gerador = new System . Random () ;
		
		int hora = gerador . Next (24) ;
		
		System . Console . WriteLine ( " hora = " + hora ) ;
		
		if ( hora >= 0 && hora < 12)
		{
			
			System . Console . WriteLine ( " Bom dia " ) ;
		}
	
		else if ( hora >= 12 && hora < 18)
		{
			
			System . Console . WriteLine ( " Boa tarde " ) ;
		}
		
		else if ( hora >= 18 && hora < 24)
		{

			System . Console . WriteLine ( " Boa noite " ) ;
		}
		
		else
		{

			System . Console . WriteLine ( " Unibanco 30 horas : P " ) ;
		}
	}
}
*/
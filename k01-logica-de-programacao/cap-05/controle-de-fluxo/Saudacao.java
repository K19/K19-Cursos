/* VERSAO 1 */
/*
class Saudacao {
	public static void main(String[] args) {
		
		int hora = 22;

		if (hora >= 0 && hora < 12) {
			
			System.out.println("Bom dia");
		} else if (hora >= 12 && hora < 18) {

			System.out.println("Boa tarde");
		
		} else if (hora >= 18 && hora < 24) {
			
			System.out.println("Boa noite");
		
		} else {
			
			System.out.println("Unibanco 30 horas : P");
		}
	}
}
*/

/* VERSAO 2 */
/*
class Saudacao {
	public static void main(String[] args) {
		java.util.Random gerador = new java.util.Random();

		int hora = gerador.nextInt(24) ;
		
		System.out.println(" hora = " + hora);

		if (hora >= 0 && hora < 12) {

			System.out.println("Bom dia");
		} else if (hora >= 12 && hora < 18) {

			System.out.println("Boa tarde");
		} else if (hora >= 18 && hora < 24) {

			System.out.println("Boa noite ");
		} else {
			System.out.println("Unibanco 30 horas :P");
		}
	}
}
*/
/* VERSAO 1 */
/*
class ADivisivelPorB {
	public static void main(String[] args) {
		
		int a = 246;

		int b = 3;
		
		if (a % b == 0) {

		System.out.println("É divisível");
		
		} else {

		System.out.println("Não é divisível");
		}
	}
}
*/

/* VERSAO 2 */
/*
class ADivisivelPorB {
	public static void main(String[] args) {
		java.util.Random gerador = new java.util.Random();
		
		int a = gerador.nextInt (1000);
		
		int b = gerador.nextInt (5) + 1;
		
		System.out.println("a = " +a);
		
		System.out.println("b = " + b);
			
		if (a % b == 0) {
			
			System.out.println("É divisível ");
		
		} else {

			System.out.println("Não é divisível");
		}
	}
}
*/
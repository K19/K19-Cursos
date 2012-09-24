/* VERSAO 1 */
/*
class PrecoProduto {
	public static void main(String[] args) {

		double precoDoProduto1 = 5325.12;

		double precoDoProduto2 = 4366.34;

		if (precoDoProduto1 < precoDoProduto2) {

			System.out.println(" O produto 2 é o mais caro. ");

		} else if (precoDoProduto2 < precoDoProduto1) {

			System.out.println("O produto 1 é o mais caro . ");
		}
	}
}
*/

/* VERSAO 2 */
/*
class PrecoProduto {
	public static void main(String[] args) {
		java.util.Random gerador = new java.util.Random();

		double precoDoProduto1 = gerador.nextDouble() * 1000;
		
		double precoDoProduto2 = gerador.nextDouble() * 1000;

		System.out.println("precoDoProduto1 = " + precoDoProduto1);
		
		System.out.println("precoDoProduto2 = " + precoDoProduto2);
		
		if (precoDoProduto1 < precoDoProduto2) {
		
		System.out.println("O produto 2 é o mais caro.");

		} else if (precoDoProduto2 < precoDoProduto1) {

		System.out.println("O produto 1 é o mais caro.");
		}
	}
}

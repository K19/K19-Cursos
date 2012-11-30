/* VERSAO 1 */
/*
class Troca2Posicoes {
	public static void main(String[] args) {
		int [] array = new int[10];
		
		java.util.Random geradorDeNumeroAleatorio = new java.util.Random();

		for (int i = 0; i < array.length; i ++) {
		
			array[i] = i;
		}
		
		for (int i = 0; i < array.length; i ++) {
			
			System.out.println(array[i]);
		}

		for (int i = 0; i < 15; i ++) {
			
			int posicao1 = geradorDeNumeroAleatorio.nextInt(10);
			int posicao2 = geradorDeNumeroAleatorio.nextInt(10);
			int auxiliar = array[posicao1];

			array[posicao1] = array[posicao2];
			array[posicao2] = auxiliar;

		}
		
		System.out.println("----------------------------");

		for (int i = 0; i < array.length; i ++) {
		
			System.out.println(array[i]);
		}
	}
}
*/
/* VERSAO 1 */
/*
class OrdenandoArray {
	public static void main(String[] args) {
		
		int [] array = new int[15];
		java.util.Random geradorDeNumeroAleatorio = new java.util.Random();

		for (int i = 0; i < array.length; i ++) {
		
			array[i] = geradorDeNumeroAleatorio.nextInt(100);
		}

		for (int i = 0; i < array.length; i ++) {
			
			System.out.println(array[i]);
		}

		for (int i = array.length; i >= 1; i --) {
			
			for (int j = 1; j < i; j ++) {
			
				if (array[j - 1] > array[j]) {
			
					int auxiliar = array[j];

					array[j] = array[j - 1];
					array[j - 1] = auxiliar;
				}
			}
		}
		System.out.println("----------------------");
		
		for (int i = 0; i < array.length; i ++) {
		
			System.out.println(array[i]);
		}
	}
}
*/
class ImprimePadrao5 {
	public static void main(String[] args) {
		int penultimo = 0;
		int ultimo = 1;

		System.out.println(penultimo);
		System.out.println(ultimo);

		for(int contador = 0; contador < 28; contador++) {
			int proximo = penultimo + ultimo;
			System.out.println(proximo);

			penultimo = ultimo;
			ultimo = proximo;
		}
	}
}
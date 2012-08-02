class ImprimePadrao3 {
	public static void main(String[] args) {
		String linha = "*";
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println(linha);
			linha += "*";
		}
	}
}
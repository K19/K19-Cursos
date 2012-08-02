public class TestaPoolDeStrings {

	public static void main(String[] args) {
		String nome1 = "Rafael Cosentino";
		String nome2 = "Rafael Cosentino";
		
		// imprime true
		System.out.println(nome1 == nome2);
		// imprime true
		System.out.println(nome1.equals(nome2));
		
		String nome3 = new String("Rafael Cosentino");
		String nome4 = new String("Rafael Cosentino");
		
		// imprime false
		System.out.println(nome3 == nome4);
		// imprime true
		System.out.println(nome3.equals(nome4));
	}
}
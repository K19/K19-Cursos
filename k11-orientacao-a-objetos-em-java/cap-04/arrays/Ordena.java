class Ordena {
	public static void main(String[] args) {
		java.util.Arrays.sort(args);

		for(String arg : args) {
			System.out.println(arg);
		}
	}
}
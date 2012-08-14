class Maior {
	public static void main(String[] args) {
		double maior =  Double.parseDouble(args[0]);
		for(int i = 1; i < args.length; i++) {
			double d = Double.parseDouble(args[i]);
			if(maior < d) {
				maior = d;
			}
		}
		System.out.println(maior);
	}
}
/* VERSAO 1 */
class TestaMetodosConta {
	public static void main(String[] args) {
		Conta c = new Conta();

		c.deposita(1000);
		c.imprimeExtrato();

		c.saca(100);
		c.imprimeExtrato();

		double saldoDisponivel = c.consultaSaldoDisponivel();
		System.out.println("SALDO DISPONÍVEL: " + saldoDisponivel);
	}
}

/* VERSAO 2 */
/*
class TestaMetodosConta {
	public static void main(String[] args) {
		Agencia a = new Agencia(178);
		Conta c = new Conta(a);

		c.deposita(1000);
		c.imprimeExtrato();

		c.saca(100);
		c.imprimeExtrato();

		double saldoDisponivel = c.consultaSaldoDisponivel();
		System.out.println("SALDO DISPONÍVEL: " + saldoDisponivel);
	}
}
*/
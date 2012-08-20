public class TestaGeradorDeExtrato {

	public static void main(String[] args) {
		GeradorDeExtrato gerador = new GeradorDeExtrato();

		ContaPoupanca cp = new ContaPoupanca();
		cp.setSaldo(1000);

		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(1000);

		gerador.imprimeExtratoBasico(cp);
		gerador.imprimeExtratoBasico(cc);		
	}
}
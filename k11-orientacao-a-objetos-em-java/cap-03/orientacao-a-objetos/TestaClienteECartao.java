/* VERSAO 1 */
class TestaClienteECartao {
	public static void main(String[] args) {
		// Criando alguns objetos
		Cliente c = new Cliente();
		CartaoDeCredito cdc = new CartaoDeCredito();

		// Carregando alguns dados
		c.nome = "Rafael Cosentino";
		cdc.numero = 111111;

		// Ligando os objetos
		cdc.cliente = c;

		System.out.println(cdc.numero);
		System.out.println(cdc.cliente.nome);
	}
}

/* VERSAO 2 */
/*
class TestaClienteECartao {
	public static void main(String[] args) {
		// Criando alguns objetos
		Cliente c = new Cliente();
		CartaoDeCredito cdc = new CartaoDeCredito(111111);

		// Carregando alguns dados
		c.nome = "Rafael Cosentino";

		// Ligando os objetos
		cdc.cliente = c;

		System.out.println(cdc.numero);
		System.out.println(cdc.cliente.nome);
	}
}
*/
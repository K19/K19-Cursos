/* VERSAO 1 */
/*
class TestaContaEAgencia {
	public static void main(String[] args) {
		// Criando alguns objetos
		Agencia a = new Agencia();
		Conta c = new Conta();

		// Carregando alguns dados
		a.numero = 178;
		c.saldo = 1000.0;

		// Ligando os objetos
		c.agencia = a;

		System.out.println(c.agencia.numero);
		System.out.println(c.saldo);
	}
}
*/

/* VERSAO 2 */
/*
class TestaContaEAgencia {
	public static void main(String[] args) {
		// Criando alguns objetos
		Agencia a = new Agencia(178);
		Conta c = new Conta();

		// Carregando alguns dados
		c.saldo = 1000.0;

		// Ligando os objetos
		c.agencia = a;

		System.out.println(c.agencia.numero);
		System.out.println(c.saldo);
	}
}
*/

/* VERSAO 3 */
/*
class TestaContaEAgencia {
	public static void main(String[] args) {
		// Criando alguns objetos
		Agencia a = new Agencia(178);
		Conta c = new Conta(a);

		// Carregando alguns dados
		c.saldo = 1000.0;

		System.out.println(c.agencia.numero);
		System.out.println(c.saldo);
	}
}
*/
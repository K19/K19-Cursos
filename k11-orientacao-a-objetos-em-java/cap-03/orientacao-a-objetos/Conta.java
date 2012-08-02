/* VERSAO 1 */
class Conta {
	int numero;
	double saldo;
	double limite;
}

/* VERSAO 2 */
/*
class Conta {
	int numero;
	double saldo;
	double limite = 100;
}
*/

/* VERSAO 3 */
/*
class Conta {
	int numero;
	double saldo;
	double limite = 100;
	Agencia agencia;
}
*/

/* VERSAO 4 */
/*
class Conta {
	int numero;
	double saldo;
	double limite = 100;
	Agencia agencia;

	// ADICIONE OS MÉTODOS ABAIXO
	void deposita(double valor) {
		this.saldo += valor;
	}

	void saca(double valor) {
		this.saldo -= valor;
	}

	void imprimeExtrato() {
		System.out.println("SALDO: " + this.saldo);
	}
	
	double consultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
}
*/

/* VERSAO 5 */
/*
class Conta {
	int numero;
	double saldo;
	double limite = 100;
	Agencia agencia;

	Conta(Agencia agencia) {
		this.agencia = agencia;
	}

	void deposita(double valor) {
		this.saldo += valor;
	}
	void saca(double valor) {
		this.saldo -= valor;
	}
	void imprimeExtrato() {
		System.out.println("SALDO: " + this.saldo);
	}
	
	double consultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
}
*/

/* VERSAO 6 */
/*
class Conta {
	int numero;
	double saldo;
	double limite = 100;
	Agencia agencia;

	Conta(Agencia agencia) {
		this.agencia = agencia;
	}

	void deposita(double valor) {
		this.saldo += valor;
	}
	void saca(double valor) {
		this.saldo -= valor;
	}
	void imprimeExtrato() {
		System.out.println("SALDO: " + this.saldo);
	}
	
	double consultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
	
	void transfere(Conta destino, double valor) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
}
*/

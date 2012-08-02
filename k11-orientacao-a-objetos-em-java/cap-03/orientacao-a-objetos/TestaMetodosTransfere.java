class TestaMetodoTransfere {
	public static void main(String[] args) {
		Agencia a = new Agencia(1234);

		Conta origem = new Conta(a);
		origem.saldo = 1000;

		Conta destino = new Conta(a);
		destino.saldo = 1000;

		origem.transfere(destino, 500);

		System.out.println(origem.saldo);
		System.out.println(destino.saldo);
	}
}
/*VERSAO 1*/
class TestaValeRefeicao {
	public static void main(String[] args) {
		System.out.println(Funcionario.valeRefeicaoDiario);
		Funcionario.valeRefeicaoDiario = 15;
		System.out.println(Funcionario.valeRefeicaoDiario);
	}
}

/*VERSAO 2*/
/*
class TestaValeRefeicao {
	public static void main(String[] args) {
		System.out.println(Funcionario.valeRefeicaoDiario);
		Funcionario.valeRefeicaoDiario = 15;
		System.out.println(Funcionario.valeRefeicaoDiario);

		Funcionario.reajustaValeRefeicaoDiario(0.1);
		System.out.println(Funcionario.valeRefeicaoDiario);
	}
}
*/


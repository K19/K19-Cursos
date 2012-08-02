/* VERSAO 1 */
class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Marcelo Martins";
		f1.cargo = "Diretor";
		f1.salario = 1.800;

		Funcionario f2 = new Funcionario();
		f2.nome = "Rafael Cosentino";
		f2.cargo = "Professor";
		f2.salario = 2.000;

		System.out.println(f1.nome);
		System.out.println(f1.cargo);
		System.out.println(f1.salario);

		System.out.println(f2.nome);
		System.out.println(f2.cargo);
		System.out.println(f2.salario);
	}
}

/* VERSAO 2 */
/*
class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

		// Cadastrando Funcionário
		f1.nome = "Rafael Cosentino";
		f1.salario = 1000;

		// Aumentando em 100 reais o salário do funcionário
		f1.aumentaSalario(100);

		// Imprimindo os dados do funcionário
		System.out.println(f1.consultaDados());
	}
}
*/
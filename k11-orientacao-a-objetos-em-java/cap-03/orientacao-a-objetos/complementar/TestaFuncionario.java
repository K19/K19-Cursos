import java.util.Scanner;

class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario(200);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do funcionário: ");
		String nome = scanner.nextLine();
		f.nome = nome;

		int opc = 1;
		while (opc != 0) {
			System.out.println("\n\n");
			System.out.println("Escolha a opção desejada:");
			System.out.println("0 - Sair");
			System.out.println("1 - Aumentar salário");
			System.out.println("2 - Corrigir nome do funcionário");
			System.out.println("3 - Imprimir dados");
			System.out.println("\n\n");

			String valorTela = scanner.nextLine();
			opc = Integer.parseInt(valorTela);

			if (opc == 1) {
				System.out.println("Digite o quanto você deseja aumentar: ");
				valorTela = scanner.nextLine();
				int aumentar = Integer.parseInt(valorTela);

				if (aumentar < 0) {
					System.out.println("ERRO");
				} else {
					f.salario += aumentar;
					System.out.println("Aumento efetuado com sucesso");
				}
			} else if (opc == 2) {
				System.out.println("Nome atual: " + f.nome);

				System.out.println("Digite o novo nome.");
				valorTela = scanner.nextLine();
				f.nome = valorTela;

				System.out.println("Substituição feita com sucesso.");
			} else if (opc == 3) {
				System.out.println("Dados atuais ");
				System.out.println("Nome : " + f.nome);
				System.out.println("Salário :  " + f.salario);
			}
		}
	}
}
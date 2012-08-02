class TestaAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.nome = "Marcelo Martins";
		a1.rg = "33333333-3";
		a1.dataNascimento = "02/04/1985";
		
		Aluno a2 = new Aluno();
		a2.nome = "Rafael Cosentino";
		a2.rg = "222222222-2";
		a2.dataNascimento = "30/10/1984";
		
		System.out.println(a1.nome);
		System.out.println(a1.rg);
		System.out.println(a1.dataNascimento);
		
		System.out.println(a2.nome);
		System.out.println(a2.rg);
		System.out.println(a2.dataNascimento);

	}
}
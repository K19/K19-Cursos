class TestaAlunoTurma {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		Turma t = new Turma();

		a.nome = "Rafael Cosentino";
		t.periodo = "Tarde";

		a.turma = t;

		System.out.println(a.nome);
		System.out.println(a.turma.periodo);
	}
}
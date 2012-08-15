/*VERSÃO 1*/
public class Funcionario {
	private String nome;
	private double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
/*VERSÃO 2*/
/*
public class Funcionario {
	private String nome;
	private double salario;

	public double calculaBonificacao() {
		return this.salario * 0.1;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
*/
/*VERSÃO 3*/
/*
public class Funcionario {
	private String nome;
	private double salario;

	public double calculaBonificacao() {
		return this.salario * 0.1;
	}
	
	public void mostraDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário: " + this.salario);
		System.out.println("Bonificação: " + this.calculaBonificacao()); 
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
*/



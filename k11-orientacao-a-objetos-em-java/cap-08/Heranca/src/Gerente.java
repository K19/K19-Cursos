/* VERSAO 1 */
/*
class Gerente extends Funcionario {
	private String usuario;
	private String senha;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
*/

/* VERSAO 2 */
/*
public class Gerente extends Funcionario {
	private String usuario;
	private String senha;
	
	public double calculaBonificacao() {
		return this.getSalario() * 0.6 + 100;
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
*/

/* VERSAO 3 */
/*
class Gerente extends Funcionario {
	private String usuario;
	private String senha;
	
	public double calculaBonificacao() {
		return this.getSalario() * 0.6 + 100;
	}
	
	public void mostraDados() {
		super.mostraDados();
		System.out.println("Usuário: " + this.usuario);
		System.out.println("Senha: " + this.senha);
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
*/





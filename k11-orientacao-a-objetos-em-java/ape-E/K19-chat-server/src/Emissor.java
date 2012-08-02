import java.io.PrintStream;

public class Emissor {

	private PrintStream saida;

	public Emissor(PrintStream saida) {
		this.saida = saida;
	}

	public void envia(String mensagem) {
		this.saida.println(mensagem);
	}
}
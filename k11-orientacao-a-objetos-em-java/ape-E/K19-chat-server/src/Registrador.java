/* VERSAO 1 */
/*
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Registrador implements Runnable {

	private Distribuidor distribuidor;
	private ServerSocket serverSocket;

	public Registrador(Distribuidor distribuidor, ServerSocket serverSocket) {
		this.distribuidor = distribuidor;
		this.serverSocket = serverSocket;

	}

	public void run() {
		while (true) {
			try {
				Socket socket = this.serverSocket.accept();

				Scanner entrada = new Scanner(socket.getInputStream());
				PrintStream saida = new PrintStream(socket.getOutputStream());

				Receptor receptor = new Receptor(entrada, this.distribuidor);
				Thread pilha = new Thread(receptor);
				pilha.start();

				Emissor emissor = new Emissor(saida);

				this.distribuidor.adicionaEmissor(emissor);

			} catch (IOException e) {
				System.out.println("ERRO");
			}
		}
	}
}
*/
/* VERSAO 1 */
/*
import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	public static void main(String[] args) throws IOException {
		Distribuidor distribuidor = new Distribuidor();

		ServerSocket serverSocket = new ServerSocket(10000);

		Registrador registrador = new Registrador(distribuidor, serverSocket);
		Thread pilha = new Thread(registrador);
		pilha.start();
	}
}
*/

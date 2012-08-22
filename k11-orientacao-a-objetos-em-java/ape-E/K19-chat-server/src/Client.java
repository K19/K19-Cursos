/* VERSAO 1 */
/*
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("IP DO SERVIDOR", 10000);

		PrintStream saida = new PrintStream(socket.getOutputStream());

		Scanner entrada = new Scanner(socket.getInputStream());

		EmissorDeMensagem emissor = new EmissorDeMensagem(saida);

		TelaK19Chat telaK19Chat = new TelaK19Chat(emissor);

		ReceptorDeMensagem receptor = new ReceptorDeMensagem(entrada,
				telaK19Chat);
		Thread pilha = new Thread(receptor);
		pilha.start();
	}
}
*/

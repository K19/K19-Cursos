import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(10000);

		Socket socket = serverSocket.accept();

		PrintStream saida = new PrintStream(socket.getOutputStream());

		saida.println("Você se conectou ao servidor da K19!");
	}
}
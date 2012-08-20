import java.text.SimpleDateFormat;
import java.util.Date;

public class GeradorDeExtrato {

	public void imprimeExtratoBasico(Conta c) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("DATA: "  + sdf.format(agora));
		System.out.println("SALDO: "  + c.getSaldo());	
	}
}
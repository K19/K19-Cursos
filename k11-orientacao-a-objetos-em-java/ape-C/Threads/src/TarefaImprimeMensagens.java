public class TarefaImprimeMensagens implements Runnable {

	private String msg;

	public TarefaImprimeMensagens(String msg) {
		this.msg = msg;
	}

	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println(i + " : " + this.msg);
		}
	}
}
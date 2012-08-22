/* VERSAO 1 */
/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaAdicionaNoComeco {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();

		long tempo = TestaAdicionaNoComeco.adicionaNoComeco(arrayList);
		System.out.println("ArrayList: " + tempo + "ms");

		tempo = TestaAdicionaNoComeco.adicionaNoComeco(linkedList);
		System.out.println("LinkedList: " + tempo + "ms");

	}

	public static long adicionaNoComeco(List lista) {
		long inicio = System.currentTimeMillis();

		int size = 100000;

		for (int i = 0; i < size; i++) {
			lista.add(0, i);
		}

		long fim = System.currentTimeMillis();

		return fim - inicio;
	}
}
*/

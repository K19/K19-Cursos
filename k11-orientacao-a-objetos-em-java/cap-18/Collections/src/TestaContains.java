/* VERSAO 1 */
/*
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaContains {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		HashSet hashSet = new HashSet();

		long tempo = TestaContains.contains(arrayList);
		System.out.println("ArrayList: " + tempo + "ms");

		tempo = TestaContains.contains(hashSet);
		System.out.println("HashSet: " + tempo + "ms");

	}

	public static long contains(Collection colecao) {

		int size = 100000;

		for (int i = 0; i < size; i++) {
			colecao.add(i);
		}

		long inicio = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			colecao.contains(i);
		}

		long fim = System.currentTimeMillis();

		return fim - inicio;
	}
}
*/

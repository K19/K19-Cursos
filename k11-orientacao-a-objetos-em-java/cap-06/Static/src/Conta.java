/* VERSAO 1 */
public class Conta {
	// ATRIBUTO DE CLASSE
	static int contador;

	// CONSTRUTOR
	Conta() {
		Conta.contador++;
	}

}	
/* VERSAO 2 */
/*
public class Conta {
	// ATRIBUTO DE CLASSE
	static int contador;

	// ATRIBUTO DE INSTANCIA
	int numero;

	// CONSTRUTOR
	Conta() {
		Conta.contador++;
		this.numero = Conta.contador;
	}
	
	static void zeraContador() {
	System.out.println("Contador: " + Conta.contador);
	System.out.println("Zerando o contador de contas...");
	Conta.contador = 0;
}
}
 
*/
/* VERSAO 3 */
/*
public class Conta {
	// ATRIBUTO DE CLASSE
	static int contador;

	// ATRIBUTO DE INSTANCIA
	int numero;

	// CONSTRUTOR
	Conta() {
		Conta.contador++;
		this.numero = Conta.contador;
	}
	
	static void zeraContador() {
	System.out.println("Contador: " + Conta.contador);
	System.out.println("Zerando o contador de contas...");
	Conta.contador = 0;
}
}
 
*/

	

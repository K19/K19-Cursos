package br.com.k19.contas;
/**
 * 
 * Documentação da classe Conta
 * 
 * @author Rafael Cosentino
 * 
 * @author Jonas Hirata
 * 
 * @author Marcelo Martins
 * 
 * @version 1.0
 */
public class Conta {

	/**
	 * Documentação do atributo número
	 */
	private int numero;

	/**
	 * Documentação do construtor
	 * 
	 * @param numero
	 *            documentação do atributo número
	 * 
	 * @throws IllegalArgumentException
	 *             documentação da situação que gera a exception
	 *             IllegalArgumentException
	 */
	public Conta(int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("Número negativo");
		}
		this.numero = numero;
	}
	
	/**
	 * Documentação do método getNumero
	 * 
	 * @return documentação do valor de retorno
	 */
	public int getNumero() {
		return numero;
	}
}
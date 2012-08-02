import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		int opc=1;
		while(opc!=0){
			System.out.println("Gerador de Padrões\n\n Digite a opção desejada:\n1-Padrão");
			System.out.println("2-Padrão\n3-Padrão\n4-Padrão\n5-Padrão\n0-Sair");
			Scanner scanner = new Scanner(System.in);
			String valorTela= scanner.nextLine();
			opc = Integer.parseInt(valorTela);  
			
			if(opc==1){
				for(int contador = 1; contador <= 100; contador++){ 
					int resto = contador % 2;
					if(resto == 1) {
						System.out.println("*");
					} else{
						System.out.println("**");
					}
				}	
			} else if(opc==2){
			    for(int contador = 1; contador <= 100; contador++) {
					int resto = contador % 4;
					if(resto == 0) {
						System.out.println("PI");
					} else {
						System.out.println(contador);
					}
				}
			} else if(opc==3){
			    String linha = "*";
				for(int contador = 1; contador <= 10; contador++) {
					System.out.println(linha);
					linha += "*";
				}
			} else if(opc==4){
			    String linha = "*";
				for(int contador = 1; contador <= 10; contador++) {
					System.out.println(linha);
					int resto = contador % 4;
					if(resto == 0) {
						linha = "*";
					} else {
						linha += "*";
					}
				}
			} else if(opc==5){
				int penultimo = 0;
				int ultimo = 1;
				System.out.println(penultimo);
				System.out.println(ultimo);
				for(int contador = 0; contador < 28; contador++) {
					int proximo = penultimo + ultimo;
					System.out.println(proximo);
					penultimo = ultimo;
					ultimo = proximo;
				}
			}
		
		}
		System.out.println("Operação finalizada");
	}
}
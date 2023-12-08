package loops;

import java.util.Scanner;

	public class Ex6 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
		
			int numero, cont=0, soma=0;
			double media;
	
			
			do {
				System.out.println("Digite o numero: ");
				numero = ler.nextInt();
				if(numero % 3 == 0 && numero != 0) {
					cont++;
					soma += numero;
				}			
			}while(numero != 0 );
			
		
			media = (double) soma / cont;
			
			System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		
			ler.close();
		}
	}

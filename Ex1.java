package loops;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, cont;
	
		
		System.out.println("Digite o número 1: ");
		numero1 = ler.nextInt();
		
		System.out.println("Digite o número 2: ");
		numero2 = ler.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("Intervalo inválido");
		}else {
			for(cont = numero1; cont < numero2; cont++) {
				if(cont%3 == 0 && cont%5 == 0) {
					System.out.println(cont + " é múltiplo de 3 e 5");
				}
			}
		}
				
		ler.close();
	}
}

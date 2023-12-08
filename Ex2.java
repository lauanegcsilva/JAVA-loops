package loops;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero, cont, quantidadePares = 0, quantidadeImpares = 0;
	
		
		for(cont = 0; cont < 10; cont++) {
			System.out.println("Digite o número");
			numero = ler.nextInt();
			if(numero % 2 == 0) {
				quantidadePares++;
				}else {
					quantidadeImpares++;
				}
		}
		
			System.out.println("Total de números pares: " + quantidadePares + "\nTotal números ímpares: " + quantidadeImpares);
				
		ler.close();
	}
}

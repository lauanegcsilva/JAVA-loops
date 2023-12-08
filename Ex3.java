package loops;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade, menor21=0, maior50=0;
	
		System.out.println("Digite uma idade: ");
		idade = ler.nextInt();
		
		while(idade > 0) {
			if(idade < 21) {
				menor21++;
			}if(idade > 50) {
				maior50++;
			}
			System.out.println("Digite uma idade: ");
			idade = ler.nextInt();
		}
		
			System.out.println("Total de pessoas menores de 21 anos: " + menor21 + "\nTotal de pessoas maiores de 50 anos: " + maior50);
				
		ler.close();
	}
}

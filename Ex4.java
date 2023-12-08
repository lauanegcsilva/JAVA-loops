package loops;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		 int idade, identidadeGenero, pessoaDesenvolvedora;
	     int totalBackend = 0, totalFrontendMulheres = 0, totalMobileHomensMais40 = 0, totalFullStackNaoBinariosMenos30 = 0;
	     int totalPessoas = 0;
	     double somaIdades = 0, mediaIdades = 0;

	     char continuar;
	
			
		do {
			System.out.print("Idade: ");
            idade = ler.nextInt();

            System.out.print("Identidade de Gênero: \n1-Mulher Cis \n2-Homem Cis \n3-Não Binário \n4-Mulher Tran \n5-Homem Trans \n6-Outros: ");
            identidadeGenero = ler.nextInt();

            System.out.print("Pessoa Desenvolvedora \n1-Backend \n2-Frontend \n3-Mobile \n4-FullStack: ");
            pessoaDesenvolvedora = ler.nextInt();

            if (pessoaDesenvolvedora == 1) {
                totalBackend++;
            }

            if ((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDesenvolvedora == 2) {
                totalFrontendMulheres++;
            }

            if ((identidadeGenero == 2 || identidadeGenero == 5) && pessoaDesenvolvedora == 3 && idade > 40) {
                totalMobileHomensMais40++;
            }

            if (identidadeGenero == 3 && pessoaDesenvolvedora == 4 && idade < 30) {
                totalFullStackNaoBinariosMenos30++;
            }

            totalPessoas++;
            somaIdades += idade;

            System.out.print("Deseja continuar (S/N): ");
            continuar = ler.next().charAt(0);
            
		}while(continuar == 's' || continuar == 'S');
		
		mediaIdades = somaIdades / totalPessoas ;
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + totalBackend);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalFrontendMulheres);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalMobileHomensMais40);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + totalFullStackNaoBinariosMenos30);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f%n", mediaIdades);

		
		ler.close();
	}
}

package POOSwitchCase;

import java.util.Scanner;

	public class ReprodutorMusical {
	    public void executarAcao() {
	        Scanner scanner = new Scanner(System.in);
	        int escolha;
	        do {
	            System.out.println("Reprodutor Musical:");
	            System.out.println("1. Tocar");
	            System.out.println("2. Pausar");
	            System.out.println("3. Selecionar Música");
	            System.out.println("0. Voltar");

	            escolha = scanner.nextInt();

	            switch (escolha) {
	                case 1:
	                    System.out.println("Tocando música:");
	                    break;
	                case 2:
	                    System.out.println("Pausando música:");
	                    break;
	                case 3:
	                    System.out.println("Selecionando música:");
	                    break;
	                case 0:
	                    System.out.println("Voltando ao menu principal.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (escolha != 0);
	    }
	}



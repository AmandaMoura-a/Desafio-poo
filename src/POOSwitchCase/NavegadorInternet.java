package POOSwitchCase;

import java.util.Scanner;

public class NavegadorInternet {
	    public void executarAcao() {
	        Scanner scanner = new Scanner(System.in);
	        int escolha;
	        do {
	            System.out.println("Navegador na Internet:");
	            System.out.println("1. Exibir Página");
	            System.out.println("2. Adicionar Nova Aba");
	            System.out.println("3. Atualizar Página");
	            System.out.println("0. Voltar");

	            escolha = scanner.nextInt();

	            switch (escolha) {
	                case 1:
	                    System.out.println("Exibindo página da internet: ");
	                    break;
	                case 2:
	                    System.out.println("Adicionando nova aba no navegador: ");
	                    break;
	                case 3:
	                    System.out.println("Atualizando página da internet: ");
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


package POOSwitchCase;

import java.util.Scanner;

public class IPhone {
	

		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int escolha;
	        do {
	            System.out.println("Menu Principal:");
	            System.out.println("1. Reprodutor Musical");
	            System.out.println("2. Aparelho Telefônico");
	            System.out.println("3. Navegador na Internet");
	            System.out.println("0. Sair");

	            escolha = scanner.nextInt();

	            switch (escolha) {
	                case 1:
	                    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
	                    reprodutorMusical.executarAcao();
	                    break;
	                case 2:
	                    AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
	                    aparelhoTelefonico.executarAcao();
	                    break;
	                case 3:
	                    NavegadorInternet navegadorInternet = new NavegadorInternet();
	                    navegadorInternet.executarAcao();
	                    break;
	                case 0:
	                    System.out.println("Saindo do programa...");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (escolha != 0);

	        scanner.close();
	    }
	}


package POOSwitchCase;


	import java.util.Scanner;

	public class AparelhoTelefonico {
	    public void executarAcao() {
	        Scanner scanner = new Scanner(System.in);
	        int escolha;
	        do {
	            System.out.println("Aparelho Telefônico:");
	            System.out.println("1. Ligar");
	            System.out.println("2. Atender Chamada");
	            System.out.println("3. Iniciar Correio de Voz");
	            System.out.println("0. Voltar");

	            escolha = scanner.nextInt();

	            switch (escolha) {
	                case 1:
	                    System.out.println("Ligando o telefone: ");
	                    break;
	                case 2:
	                    System.out.println("Atendendo chamada: ");
	                    break;
	                case 3:
	                    System.out.println("Iniciando correio de voz: ");
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


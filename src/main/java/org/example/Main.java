import java.util.Scanner;
import java.util.Locale;

class ImcCalculado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double saldo = 2000, saque, depositar, valorConta;
        String continuar;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Verificar Saldo");
            System.out.println("2 - Sacar Dinheiro");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Pagar Conta");
            System.out.println("5 - Sair");

            System.out.print("Informe a opção do menu: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: %.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Qual valor pretende sacar? ");
                    saque = sc.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println("Seu saldo atual é de: " + saldo);
                    }
                    break;
                case 3:
                    System.out.print("Qual valor deseja depositar? ");
                    depositar = sc.nextDouble();
                    saldo += depositar;
                    System.out.println("O seu saldo atual é de: " + saldo);
                    break;
                case 4:
                    System.out.print("Qual o valor da conta deseja pagar: ");
                    valorConta = sc.nextDouble();
                    if (saldo < valorConta) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorConta;
                        System.out.println("Seu saldo atual é de: " + saldo);
                    }
                    break;
                case 5:
                    System.out.println("Você saiu do sistema.");
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.print("Deseja realizar outra operação? (sim/não): ");
            continuar = sc.next().toLowerCase();

        } while (continuar.equals("sim"));

        System.out.println("Programa encerrado. Obrigado por usar nosso sistema!");
    }
}

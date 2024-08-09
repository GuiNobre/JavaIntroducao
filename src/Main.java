import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Iniciar dados do cliente*/


        String nome = scanner.nextLine();
        String tipoConta = scanner.nextLine();
        double saldo = scanner.nextDouble();

        System.out.println("""
                Seu nome é %s,
                Sua conta é do tipo %s
                Seu saldo é %.2f
                    
                Opções:
                1. Visualização do saldo
                2. Receber valor
                3. Transferir valor
                4. Sair
                """.formatted(nome, tipoConta, saldo));

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println(saldo);
        }
        else if (opcao == 2) {
            System.out.println("Digite o valor abaixo:");
            double receberValor = scanner.nextDouble();
            System.out.println("O valor ficou igual a: " + (saldo + receberValor));
        }
        else if (opcao == 3) {
            System.out.println("Digite o valor abaixo:");
            double transferirValor = scanner.nextDouble();
            saldo -= transferirValor;
            if (saldo < 0) {
                saldo += transferirValor;
                System.out.println("Transação indisponível, saldo insuficiente");
            } else {
                System.out.println("O saldo ficou igual a: " + saldo);

            }
        }
        else if (opcao == 4) {
            System.out.println("Tarefa finalizada.");
        }
        else {
            System.out.println("Dígito inválido");
        }
    }
}
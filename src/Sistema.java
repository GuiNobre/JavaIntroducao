import java.util.Scanner;


public class Sistema {
    Scanner scanner = new Scanner(System.in);
    public double saldo = 100;

    public void inicio() {
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual tipo de conta?");
        String tipoConta = scanner.nextLine();

        System.out.println("Qual o seu saldo?");
        double saldo = scanner.nextDouble();

        System.out.println("Diga Sim se quer continuar e Não se quer sair");
         String resposta = scanner.nextLine();

        perguntas(resposta);
        }


public void perguntas(String resposta) {
    if (resposta.equals("Sim")) {
        transicao();
    }
    if (resposta.equals("Não")) {
        System.out.println("Fim");

    }
}

    public void transicao() {

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println(saldo);
        } else if (opcao == 2) {
            System.out.println("Digite o valor abaixo:");
            double receberValor = scanner.nextDouble();
            System.out.println("O valor ficou igual a: " + (saldo + receberValor));
        } else if (opcao == 3) {
            System.out.println("Digite o valor abaixo:");
            double transferirValor = scanner.nextDouble();
            saldo -= transferirValor;
            if (saldo < 0) {
                saldo += transferirValor;
                System.out.println("Transação indisponível, saldo insuficiente");
            } else {
                System.out.println("O saldo ficou igual a: " + saldo);

            }
        } else if (opcao == 4) {
            System.out.println("Tarefa finalizada.");
        } else {
            System.out.println("Dígito inválido");
        }

    }


}


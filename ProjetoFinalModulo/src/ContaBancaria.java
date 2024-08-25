import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe seu saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.printf("***********************************\n"+
                "Tipo conta:         Corrente\n" +
                "Nome do cliente:    " + nome + "\n" +
                "Saldo Inicial:      R$ " + saldo + "\n" +
                "***********************************\n\n");

        int opcao = 0;
        while (opcao != 4){
            System.out.println("""
                    Operações:
                     [ 1 ] - Consultar saldo;
                     [ 2 ] - Depósito;
                     [ 3 ] - Saque;
                     [ 4 ] - Sair; \n
                     Digite a opção desejada:""");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atualizado é de R$ " + saldo);
            } else if (opcao == 2) {
                double valor = 0;
                System.out.println("Informe o valor a ser depositado: ");
                valor = scanner.nextDouble();
                if (valor <= 0) {
                    System.out.println("O valor não pode ser zero ou negativo, por favor, tente novamente");
                } else {
                    saldo += valor;
                    System.out.println("Depósito concluído, o saldo atualizado é de R$ " + saldo);
                }
            } else if (opcao == 3) {
                double valor = 0;
                System.out.println("Informe o valor a ser sacado: ");
                valor = scanner.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Saque efetuado, o saldo atual é de R$ " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Obrigado, volte sempre!");
                break;
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        }
        scanner.close();
    }
}
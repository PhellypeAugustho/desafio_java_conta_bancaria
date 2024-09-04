import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        // Obter pela scanner os valores digitados no terminal
        System.out.print("Por favor, digite o número da Agência !: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente !:");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o numero da Conta !: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, Digite seu saldo !: ");
        double saldo = scanner.nextDouble();

        // Exibir as mensagens para o nosso usuario
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque");

        scanner.close();
        // Exibir a mensagem conta criada

        System.out.println("Conta Criada!");

    }
}

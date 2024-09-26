import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Insira o númerod da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Insira o saldo da Conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente );
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}

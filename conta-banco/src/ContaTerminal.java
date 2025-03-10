
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Seja Bem Vindo a sua conta bancaria!, por favor digite seus dados abaixo: ");
        System.out.println("Digite o numero da sua conta: ");

        int numero = leitura.nextInt();

        leitura.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");

        String agencia = leitura.nextLine();

        System.out.println("Por favor, digite o seu nome completo: ");

        String nomeCliente = leitura.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");

        double saldo = leitura.nextDouble();

        leitura.nextLine();

        System.out.println("Olá " + nomeCliente  + "," + "obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + "," +
                "conta: " + numero + "e seu saldo é: " + saldo + " e já está disponivel para saque!!");

    }
}

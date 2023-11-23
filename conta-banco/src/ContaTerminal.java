import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
         System.out.println("Digite o número da conta?");
        int numeroConta = scanner.nextInt();

        String agencia = "067-8";
        String nomeCliente = "Kyron Paraense";
        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Seu saldo disponível para saque é: " + saldo);
    }
}
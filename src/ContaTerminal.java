import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.US); // Configura o Scanner para usar ponto como separador decimal
            
            System.out.println("Qual o número da conta? ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Qual sua agência? ");
            String agencia = scanner.nextLine();
            
            System.out.println("Qual seu nome completo? ");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Qual seu saldo? ");
            double saldo = scanner.nextDouble();
            
            System.out.printf(
                    "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
                    nomeCliente, agencia, numeroConta, saldo
            );
        } // Configura o Scanner para usar ponto como separador decimal
    }
}

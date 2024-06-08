import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a clase scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.next();

        System.out.println("Agora digite o número da conta, por favor !");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o nome do cliente !");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
        + "sua agênca é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + 
        saldoConta + " já está disponivel para saque");

        scanner.close();
    }
}

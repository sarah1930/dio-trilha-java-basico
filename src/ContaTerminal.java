import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola,seja bem vindo ao banco do dindin!");
        String banco = scanner.nextLine();
     
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o Nome do Cliente !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo da Conta !");
        double saldo = scanner.nextDouble();

        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}

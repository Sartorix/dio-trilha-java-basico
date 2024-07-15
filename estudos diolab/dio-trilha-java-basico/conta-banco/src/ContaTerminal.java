import java.util.Scanner;

public class ContaBancaria {
    private int numero;
    private int agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria(int numero, int agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Método para exibir informações da continha
    public void exibirInformacoes() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo: R$ " + saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta:  ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numero, agencia, nomeCliente, saldo);

        // Exibir as informações da conta
        System.out.println("\nDados da conta bancária:");
        conta.exibirInformacoes();

        scanner.close();
    }

    
}

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdPessoasAlemanha;
        double precoAlemanha;

        int qtdPessoasPortugal;
        double precoPortugal;

        int qtdPessoasItalia;
        double precoItalia;

        System.out.println("Digite o valor da viagem para Alemanha: ");
        precoAlemanha = scanner.nextDouble();

        System.out.println("Digite a quantidade de pessoas que vão para a viagem para Alemanha: ");
        qtdPessoasAlemanha = scanner.nextInt();

        System.out.println("Digite o valor da viagem para Portugal: ");
        precoPortugal = scanner.nextDouble();

        System.out.println("Digite a quantidade de pessoas que vão para a viagem para Portugal: ");
        qtdPessoasPortugal = scanner.nextInt();

        System.out.println("Digite o valor da viagem para Italia: ");
        precoItalia = scanner.nextDouble();

        System.out.println("Digite a quantidade de pessoas que vão para a viagem para Italia: ");
        qtdPessoasItalia = scanner.nextInt();

        System.out.println("Valor total (Viagem Alemanha): R$" + (qtdPessoasAlemanha * precoAlemanha));
        System.out.println("Valor total (Viagem Portugal): R$" + (qtdPessoasPortugal * precoPortugal));
        System.out.println("Valor total (Viagem Italia): R$" + (qtdPessoasItalia * precoItalia));
        System.out.println("Valor total (Eurotrip): R$" + ((qtdPessoasAlemanha * precoAlemanha) + (qtdPessoasPortugal * precoPortugal) + ((qtdPessoasItalia * precoItalia))));

        scanner.close();
    }
}

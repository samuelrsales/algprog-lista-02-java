import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoGasolina;
        double litrosComprados;
        double valorTotal;

        System.out.println("Digite o preço da gasolina: ");
        precoGasolina = scanner.nextDouble();
        
        System.out.println("Digite o números de litros: ");
        litrosComprados = scanner.nextDouble();
        
        valorTotal = precoGasolina * litrosComprados;
        System.out.println("Valor total: R$" + valorTotal);

        scanner.close();
    }
}

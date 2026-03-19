import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int number2 = scanner.nextInt();

        System.out.println("Soma: " + (number1 + number2));
        System.out.println("Divisão: " + (number1 - number2));
        System.out.println("Multiplicação: " + (number1 / number2));


        scanner.close();

    }
}

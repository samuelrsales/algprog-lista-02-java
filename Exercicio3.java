import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media;

        System.out.println("Digite sua nota do 1º bimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite sua nota do 2º bimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite sua nota do 3º bimestre: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite sua nota do 4º bimestre: ");
        double nota4 = scanner.nextDouble();

        media = ((nota1 + nota2 + nota3 + nota4) / 4);
        
        System.out.println("A média das suas notas é: " + media);

        scanner.close();
    }
}

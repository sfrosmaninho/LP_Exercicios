import java.util.Scanner; //1. Ler um número inteiro e exibir o seu dobro.

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Digite seu numero: ");

        Scanner in = new Scanner(System.in); // configura o scanner
        number = in.nextInt();

        result = number*2;
        System.out.println("O dobro de " + number + " é " + result);
    }
}
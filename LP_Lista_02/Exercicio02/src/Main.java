import java.util.Scanner; //2. Ler um número inteiro e exibir o seu quadrado.

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Digite seu numero: ");

        Scanner in = new Scanner(System.in); // configura o scanner
        number = in.nextInt();

        result = number * number;
        System.out.println("O quadrado de " + number + " é " + result);

        in.close(); // Adicionado para fechar o Scanner
    }
}
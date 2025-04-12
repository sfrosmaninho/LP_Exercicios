//3. Ler um número real e exibir a quinta parte deste número.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Digite seu numero: ");

        Scanner in = new Scanner(System.in); // configura o scanner
        number = in.nextInt();

        result = number / 5;
        System.out.println("A quinta parte do numero informado" + number + " é " + result);

        in.close(); // Adicionado para fechar o Scanner
    }
}
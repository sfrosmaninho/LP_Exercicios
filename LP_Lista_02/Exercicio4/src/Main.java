//4. Ler duas notas N1 e N2 e exibir a média.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double nota1, nota2, media;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("A média das notas informadas (" + nota1 + " e " + nota2 + ") é " + media);

        in.close(); // Adicionado para fechar o Scanner
    }
}
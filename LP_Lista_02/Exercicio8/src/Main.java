//8. Ler uma medida em polegadas e converter para milímetros.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double milimetros, polegadas;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite as polegadas: ");
        polegadas = in.nextDouble();

        milimetros = polegadas / 25.4;
        System.out.println("Convertendo as polegadas informadas para milimetros, o resultado é: " + milimetros);
    }
}
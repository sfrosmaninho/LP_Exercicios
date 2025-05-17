//7. Ler uma medida em milímetro e converter para polegadas.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double milimetros, polegadas;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite os Milimetros: ");
        milimetros = in.nextDouble();

        polegadas = milimetros / 25.4;
        System.out.println("Convertendo os milimetros informados para polegadas, o resultado é: " + polegadas);
    }
}


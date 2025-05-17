//10. Ler uma medida de distância em milhas e converter para quilômetros.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double milhas, km;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite as milhas: ");
        milhas = in.nextDouble();

        km = milhas / 1.60934;
        System.out.println("Convertendo as milhas informadas para km, o resultado é: " + km);
    }
}
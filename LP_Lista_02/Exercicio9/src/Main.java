//9. Ler uma medida de distância em quilômetros e converter para milhas.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km, milhas;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o KM: ");
        km = in.nextDouble();

        milhas = km / 1.60934;
        System.out.println("Convertendo KM informado para milhas, o resultado é: " + milhas);
    }
}

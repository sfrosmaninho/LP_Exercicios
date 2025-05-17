//5. Ler uma velocidade em $Km/h$ e converter para $m/s$.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double metros_s, km_h;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite os kilometros/h: ");
        km_h = in.nextDouble();

        metros_s = km_h * 3.6;
        System.out.println("Convertendo os kilometros informados para Metros/S, o resultado é: " + metros_s);
    }
}
//6. Ler uma velocidade em $m/s$ e converter para $km/h$.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double metros_s, km_h;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite os Metros/S: ");
        metros_s = in.nextDouble();

        km_h = metros_s * 3.6;
        System.out.println("Convertendo os Metros/S informados para kilometros, o resultado é: " + km_h);
    }
}
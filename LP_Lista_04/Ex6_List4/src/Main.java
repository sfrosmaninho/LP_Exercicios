//6. Peça para o usuário inserir dois números inteiros e exiba todos os números naturais existentes entre os números digitados.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero1, numero2, aux;

        Scanner in = new Scanner(System.in);

        System.out.println("Insira dois numeros inteiros separadospor espaço: ");
        numero1 = in.nextInt();
        numero2 = in.nextInt();

        if(numero1>numero2) {
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;

        }

        for (int i = numero1; i <= numero2; i++)
            System.out.println(i + " ");





    }

}
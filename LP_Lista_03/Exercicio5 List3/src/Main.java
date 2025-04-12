//5. Elabore um programa que calcule a média de um aluno e imprima o conceito:
//        - A se a média >= 8.5
//        - B se a média >= 7 e média < 8.5
//        - C se a média >= 5 e média < 7
//        - D se a média < 5

import java.util.Scanner;
import java.util.SequencedSet;

public class Main {
    public static void main(String[] args) {
        double nota1, nota2, media;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        nota1=in.nextDouble();
        System.out.println("Digite a nota 2");
        nota2=in.nextDouble();

        media=(nota1+nota2)/2;

        if(media >= 8.5){
            System.out.println("Seu conceito é A");
        }else if(media >= 7){
            System.out.println("Seu conceito é B");
        }else if(media >= 5){
            System.out.println("Seu conceito é C");
        } else {

        }

    }
}
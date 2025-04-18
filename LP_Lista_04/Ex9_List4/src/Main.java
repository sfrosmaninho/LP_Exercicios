 //9. Jogo da tabuada: o aplicativo irá exibir as tabuadas do 1 ao 10 uma operação por vez.
 //Entre uma operação e outra o usuário deve inserir o resultado da conta, se o resultado digitado estiver correto o programa exibe
 //a próxima operação caso contrário o jogo é encerrado mostrando a mensagem de que o jogador perdeu (deve exibir a opção jogarnovamente).
 //Caso o jogador complete toda a tabuada sem erros o programa deve exibir uma mensagem parabenizando o jogador (e perguntar se deseja jogar novamente).



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int result;
            char option;
            boolean stop = false;

            Scanner in = new Scanner(System.in);

            do {
                stop = false;
                for (int i = 1; i <= 10; i++) {

                    for (int j = 0; j <= 10; j++) {
                        System.out.println(i + " x " + j + "=");
                        result = in.nextInt();

                        if (result != (i * j)) {
                            stop = true;
                            System.out.println("Voce errou!");
                            break;
                        }
                    }
                    if (stop)
                        break;
                    System.out.println("-------------");
                    if (!stop)
                        System.out.println("Voce venceu!");
                    System.out.println("Voce deseja continuar? \nSim(S) \tNão(N)");
                    option = in.next().charAt(0);
                }
                while (option == 's' || option == 'S') ;
                System.out.println("Obrigada por se esforçar");
            }
        }
    }
}
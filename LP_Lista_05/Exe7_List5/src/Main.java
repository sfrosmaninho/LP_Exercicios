//7. Receber uma matriz 5x5 e encontrar a maior soma entre suas colunas e a maior soma entre suas linhas.


public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4, 5}
                , {5, 4, 3, 2, 1}
                , {2, 3, 4, 5, 1}
                , {3, 4, 5, 1, 2}
                , {4, 5, 1, 2, 3}};

        int maiorLinha = Integer.MIN_VALUE;
        int maiorColuna = Integer.MIN_VALUE;
        int somaLinhas;
        int somaColunas = 0;


        for (int linha = 0; linha < matriz.length; linha++) {
            somaLinhas = 0;
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                somaLinhas += matriz[linha][coluna];
            }
            if (somaLinhas > maiorLinha) {
                maiorLinha = somaLinhas;
            }

        }
        for (int coluna = 0; coluna < matriz.length; coluna++) {
            somaColunas = 0;
            for (int linha = 0; linha < matriz[0].length; linha++) {
                somaColunas += matriz[coluna][linha];
            }
            if (somaColunas > maiorColuna) {
                maiorColuna = somaColunas;

            }
            System.out.println("Maior soma das linhas: " + maiorLinha);
            System.out.println("Maior soma das colunas: " + maiorColuna);

        }

    }
}
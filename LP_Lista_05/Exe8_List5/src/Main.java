//8. Declare e inicialize uma matriz 5x5 em seguida exiba sua diagonal principal.

public class Main {
    public static void main(String[] args) {
        int [] [] matriz = { {1,2,3,4,5}
                            ,{5,4,3,2,1}
                            ,{2,3,4,5,1}
                            ,{3,4,5,1,2}
                            ,{4,5,1,2,3}};

        System.out.print("Diagonal Principal: ");
        for(int i=0;i<matriz.length;i++)
            System.out.print(matriz[i][i] + ", ");
//Exercício 9:
        System.out.print("\nDiagonal Secundária: ");
        for(int i=0; i<matriz.length; i++)
            System.out.print(matriz[i][matriz.length-1-i] + ", ");


    }
}
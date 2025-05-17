//1. Declare e inicialize um vetor de 10 posições, em seguida imprima este vetor em ordem inversa.

public static void main(String[] args) {
    int[] numbers = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int aux;

    for (int i = 0; i < numbers.length / 2; i++) {
        aux = numbers[numbers.length - 1 - i];
        numbers[numbers.length - 1 - i] = numbers[i];
        numbers[i] = aux;
    }

        System.out.println("Ordem inversa:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
    }

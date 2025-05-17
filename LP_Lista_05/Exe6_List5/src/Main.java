import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vetor Original");
        int []vetor = {1,2,3,4,5};
        int aux;

        for(int i=0;i< vetor.length/2;i++){
            aux = vetor[vetor.length-1-i];
            vetor[vetor.length-1-i]=vetor[i];
            vetor[i]=aux;
        }

        System.out.print("\nVetor Invertido: ");
        for(int valor : vetor)
            System.out.print(valor+", ");
    }
}
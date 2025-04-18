import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int maior = 0, menor = 0;

        Scanner in = new Scanner(System.in);

        for(int i=1;i<=5;i++){
            System.out.println("Digite o " + i + "º numero: ");
            int temp = in.nextInt();

            if(i==1) {
                maior = temp;
                menor = temp;

            }else{

                if (temp>maior)
                    maior=temp;

                if(temp<menor)
                    menor=temp;
            }


        }
        System.out.println("Maior = " + maior + "\nMenor = " + menor);
}


}
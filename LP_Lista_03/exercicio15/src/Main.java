import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double value, change;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o dinheiro: ");
        value = in.nextDouble();

        System.out.println("--------------------\n" +
                "Menu:\n" +
                "1. Café Expresso R$ 0,50\n" +
                "2. Café Longo R$ 1,00\n" +
                "3. Capuccino R$ 2,50\n" +
                "4. Chocolate R$ 2,00\n" +
                "------------------------");
        System.out.println("Escolhe uma opção: ");
        option = in.nextInt();

        switch (option){
            case 1:
                System.out.println("Bebida seleciionada: Café expresso.");
                if(value>0.5) {
                    change = value - 0, 5;
                    System.out.printf("Seu troco: R$ %.2f", change % 2f);
                }else{
                    System.out.println("Saldo Insuficiente.")
                }
        }    break;
            case 2:
         System.out.println("Bebida selecionada: Café Longo.");
        if(value>=1){
            change = value - 1;
            System.out.printf("Seu troco: R$ %.2f", change);
        }else{
            System.out.println("Saldo insuficiente.");
        }
        break;
        case 3:
        System.out.println("Bebida selecionada: Capuccino.");
        if(value>=2.5){
            change = value - 2.5;
            System.out.printf("Seu troco: R$ %.2f", change);
        }else{
            System.out.println("Saldo insuficiente.");
        }
        break;
        case 4:
        System.out.println("Bebida selecionada: Chocolate.");
        if(value>=2){
            change = value - 2;
            System.out.printf("Seu troco: R$ %.2f", change);
        }else{
            System.out.println("Saldo insuficiente.");
        }
        break;
        default:
        System.out.println("Opção inválida!");
        break;
    }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Inserisci un numero da 1 a 10");
            int numero = input.nextInt();

            switch(numero){
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Due");
                    break;
                case 3:
                    System.out.println("Tre");
                    break;
                case 4:
                    System.out.println("Quattro");
                    break;
                case 5:
                    System.out.println("Cinque");
                    break;
                case 6:
                    System.out.println("Sei");
                    break;
                case 7:
                    System.out.println("Sette");
                    break;
                case 8:
                    System.out.println("Otto");
                    break;
                case 9:
                    System.out.println("Nove");
                    break;
                case 10:
                    System.out.println("Dieci");
                    break;    
                default:
                    System.out.println("Non ti posso dare il nome");
            }

        }
    }
}
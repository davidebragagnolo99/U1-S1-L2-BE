import java.util.Scanner;

public class Esercizio_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero intero");
        int number = input.nextInt();
        getNumber(number);
        input.close();
    }

    public static void getNumber(int number) {
        switch (number) {
            case 0: {
                System.out.println("zero");
                break;
            }
            case 1: {
                System.out.println("uno");
                break;
            }
            case 2: {
                System.out.println("due");
                break;
            }
            case 3: {
                System.out.println("tre");
                break;
            }
            default:
                System.out.println("Error!");

        }
    }
}

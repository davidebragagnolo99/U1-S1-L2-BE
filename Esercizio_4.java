import java.util.Scanner;

public class Esercizio_4 {
    public static void main(String[] args) {
        timer();
    }
    public static void timer() {
        Scanner insertNumber = new Scanner(System.in);
        System.out.println("Avvia Autodistruzione tra: ");
        int number = insertNumber.nextInt();
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
        insertNumber.close();
    }
}

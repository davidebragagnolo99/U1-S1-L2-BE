import java.util.Scanner;

public class Esercizio_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci del testo");
        String word = input.nextLine();
        System.out.println(stringaPariDispari(word));
        System.out.println("Inserisci un anno");
        int year = input.nextInt();
        System.out.println(annoBisestile(year));
        input.close();
    }

    public static boolean stringaPariDispari(String word) {
        if (word.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

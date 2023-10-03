import java.util.Scanner;

public class Esercizio_3 {
    public static void main(String[] args) {
        stringDivider();
    }
    public static void stringDivider() {
        Scanner string = new Scanner(System.in);
        System.out.println("Inserisci del testo per visualizzare il risultato, altrimenti inserisci \":q\" per terminare");
        String text = string.nextLine();
        if (text.contains(":q")) {
            System.out.println("La calma è la virtù dei morti, che se sei vivo è impossibile che non ti girino i coglioni.");
        }
        while (!text.contains(":q")) {
            String[] textSplitted = text.split("");
            System.out.println(String.join(",", textSplitted));
            break;
        }
        string.close();
    }
}

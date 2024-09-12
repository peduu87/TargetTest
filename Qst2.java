import java.util.Scanner;

public class Qst2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int letterCounter = 0;

        System.out.println("Insira uma palavra para verificar a presença da letra 'A'.");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
                letterCounter++;
            }
        }

        if (letterCounter > 0) {
            System.out.println("\nA letra 'A' aparece " + letterCounter + " vez(es).");
        }
        else {
            System.out.println("\nA palavra não possui a letra 'A'.");
        }
    }
}

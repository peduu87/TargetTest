import java.util.Scanner;

public class Qst1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número para verificar se pertence à sequência de Fibonacci:");
        int number = sc.nextInt();
        int fiboNumber = 0, fiboPastNumber = 0;

        while (fiboNumber <= number) {
            if (number == fiboNumber) {
                System.out.println("\nO número pertence à sequência de Fibonacci.");
                break;
            }
            if (fiboNumber == 0) {
                fiboNumber = 1;
            }
            else {
                fiboNumber += fiboPastNumber;
                fiboPastNumber = fiboNumber - fiboPastNumber;
            }
            if (fiboNumber > number) {
                System.out.println("\nO número não pertence à sequência de Fibonacci.");
                break;
            }
        }
    }
}
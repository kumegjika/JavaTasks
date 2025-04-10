package Exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        System.out.println("🎯 Loja: Gjej numrin sekret nga 1 deri në 100!");

        do {
            System.out.print("Shkruaj numrin tënd: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Numri është më i madh se kaq!");
            } else if (guess > secretNumber) {
                System.out.println("Numri është më i vogël se kaq!");
            } else {
                System.out.println("🎉 Urime! E gjete numrin pas " + attempts + " përpjekjesh!");
            }
        } while (guess != secretNumber);
    }
}

package Exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vendos nje numer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Numri " + number + " eshte çift.");
        } else {
            System.out.println("Numri " + number + " eshte tek.");
        }
    }
}

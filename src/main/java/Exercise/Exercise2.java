package Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vendos emrin: ");
        String name = scanner.nextLine();

        System.out.print("Vendos vitin e lindjes (vetëm vitin): ");
        int birthYear = scanner.nextInt();

        int currentYear = 2025;
        int age = currentYear - birthYear;

        System.out.println("Pershendetje " + name + ", ti je " + age + " vjeç.");
    }
}

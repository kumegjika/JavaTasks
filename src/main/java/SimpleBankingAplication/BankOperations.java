package SimpleBankingAplication;

public class BankOperations {
        public static void deposit(BankAccount account, float amount) {
            if (amount > 0) {
                account.setBalance(account.getBalance() + amount);
                System.out.println("You have deposited: " + amount);
                System.out.println("New Balance: " + account.getBalance());
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public static void withdraw(BankAccount account, float amount) {
            if (amount > 0 && amount <= account.getBalance()) {
                account.setBalance(account.getBalance() - amount);
                System.out.println("You have withdrawn: " + amount);
                System.out.println("New Balance: " + account.getBalance());
            } else if (amount <= 0) {
                System.out.println("Invalid withdrawal amount.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        public static void checkBalance(BankAccount account) {
            System.out.println("Current Balance: " + account.getBalance());
        }
    }

}

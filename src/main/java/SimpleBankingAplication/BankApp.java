package SimpleBankingAplication;

public class BankApp {
        private BankAccount account;
        public static void main(String[] args) {
            BankApp app = new BankApp();
            app.init();
            while (true) {
                printMenu();
                int choice = getChoice();
                if (choice == 0) {
                    System.out.println("Exiting the application.");
                    return;
                }
                executeAction(choice, app);
            }
        }

        private void init() {
            System.out.println("Enter account holder name:");
            String name = Helper.getStringFromUser();
            System.out.println("Enter initial balance:");
            float balance = Helper.getFloatFromUser();
            System.out.println("Enter account number:");
            String accountNumber = Helper.getStringFromUser();
            this.account = new BankAccount(name, balance, accountNumber);
        }

        public static void printMenu() {
            System.out.println("Choose action: \n" +
                    "1 - Deposit \n" +
                    "2 - Withdraw \n" +
                    "3 - Check Balance \n" +
                    "0 - Exit");
        }


        public static int getChoice() {
            int choice;
            try {
                choice = Helper.getIntFromUser();
            } catch (Exception e) {
                choice = -1;
            }
            return choice;
        }

        public static void executeAction(int choice, BankApp app) {
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    float depositAmount = Helper.getFloatFromUser();
                    BankOperations.deposit(app.account, depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    float withdrawAmount = Helper.getFloatFromUser();
                    BankOperations.withdraw(app.account, withdrawAmount);
                    break;
                case 3:
                    BankOperations.checkBalance(app.account);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

}

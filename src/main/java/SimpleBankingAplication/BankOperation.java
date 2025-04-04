package SimpleBankingAplication;

public class BankOperation {

    public class BankAccount {
        private String accountHolder;
        private float balance;
        private String accountNumber;


        public BankAccount(String accountHolder, float balance, String accountNumber) {
            this.accountHolder = accountHolder;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }


        public String getAccountHolder() {
            return accountHolder;
        }

        public void setAccountHolder(String accountHolder) {
            this.accountHolder = accountHolder;
        }

        public float getBalance() {
            return balance;
        }

        public void setBalance(float balance) {
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }
    }

}

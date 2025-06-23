public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(int accountNumber, String accountHolderName, double balance, String type, int interestRate){
        super(accountNumber, accountHolderName, balance, type);
        this.interestRate=interestRate;
    }

}

public class SavingsAccount extends BankAccount {
    private double interestRate;
    public double minimumBalance;
    public SavingsAccount(int accountNumber, String accountHolderName, double balance, int interestRate){
        super(accountNumber, accountHolderName, balance);
        this.interestRate=interestRate;
    }
    public double calculateInterest(){
        return getBalance()*0.035;
    }

}

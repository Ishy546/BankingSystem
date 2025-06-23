public abstract class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String type;
    public void deposit(double deposit){
        this.balance += deposit;
    }
    public double withDraw( double withdrawal){
        balance -= withdrawal;
        return withdrawal;
    }
    public double checkingBalance(){
        return this.balance;
    }
}

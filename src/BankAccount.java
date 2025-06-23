import java.time.LocalDate;

public abstract class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private LocalDate dateCreated;
    public void deposit(double deposit){
        this.balance += deposit;
    }
    public double withDraw( double withdrawal){
        if (withdrawal<=balance){
            balance -= withdrawal;
            return withdrawal;
        }else{
            System.out.println("Withdrawal is more than what you have in your bank account!");
        }
        return null;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getAccountDetails(){
        return "Account Number: "+accountNumber+
        "\nAccount Holder Name: "+ accountHolderName+
        "\nDate Created: "+dateCreated;
    }
    public boolean validateAmount(double amount){
        if (amount>0) return true;
        return false;
    }
}

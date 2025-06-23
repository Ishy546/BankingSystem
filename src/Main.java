import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like to create a Savings Account or Checking Account?");
        String account = reader.nextLine();
        System.out.println("What is your full name?");
        String name = reader.nextLine();
        System.out.println("What is your initial deposit? (Min $15)");
        Double balance = reader.nextDouble();
        String accountNum = "";
        for (int i = 0; i<10; i++){
            accountNum += (str)((int) (Math.random() *10) +1);
        }
        if (account.contains("Savings")){
            SavingsAccount savings = new SavingsAccount(accountNum, name, balance, "Savings", 2.7);
        }
        
    }
}
import java.util.Scanner;
abstract class Account{
    double balance;
    Account(double balance){
        this.balance=balance;
    }
    double getBalance(){
        return balance;
    }
    abstract double calculateInterest();
}
class SavingAccounts extends Account{

    public SavingAccounts(double balance) {
        super(balance);
    }
    
    double calculateInterest(){
      return  balance*0.04;
    }
}

class CurrentAccount extends Account{
   

    public CurrentAccount(double balance) {
        super(balance);
    }
    
  double calculateInterest(){
    return 0.0;
  }
}
public class bank {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter balnace: ");
      double balance = sc.nextInt();
      Account SA = new SavingAccounts(balance);
      Account CA = new CurrentAccount(balance);
      System.out.println("Saving account balnce: " + SA.getBalance());
      System.out.println("Interest: "+ SA.calculateInterest());
      System.out.println("Saving account balnce: " + CA.getBalance());
      System.out.println("Interest: "+ CA.calculateInterest());
  }
}
import java.util.Scanner;
class Payment{
    void pay(double amount){
        System.out.println("Payment");
        System.out.println("Amount: "+ amount);
    }
}
class CreditCard extends Payment{
   
    @Override
    void pay(double amount){
        System.out.println("Payment method: card");
        System.out.println("Amount: "+amount);
    }
}
class UPI extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Payment method: UPI");
        System.out.println("amount: " + amount);
    }
}
public class OnlinePayment{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter choice: ");
        int choice = sc.nextInt();
          System.out.println("Enter amount: ");
        double amount = sc.nextDouble();
        Payment p;
        if(choice == 1){
        p = new CreditCard();
        p.pay(amount);
        }
        else if(choice==2){
            p =new UPI();
            p.pay(amount);
        }
        else{
            System.out.println("Invlid text");
        }
    }
}
import java.util.Scanner;
class BankAccount{
String name;
double balance;
 void setData(String name, double balance){
    this.name=name;
    this.balance=balance;
 }
 void invest(int rupees){
    this.balance +=rupees;
    System.out.println(balance);
 }
 void withdraw(int rupees){
    if(this.balance>=rupees){
        this.balance -=rupees;
        System.out.println(balance );
        }else{
            System.out.println("insufficient value");
        }
    }
 
 void displaybalance(){
    
    System.out.println(balance);
}
}
public class practice3 {
    public static void main(String args[]){
        BankAccount b1=new BankAccount();
        Scanner sc=new Scanner(System.in);
        b1.setData("ayush", 1000);
        b1.displaybalance();
        b1.invest(500);
        b1.displaybalance();
        b1.withdraw(700);
        b1.displaybalance();
        b1.withdraw(1000);

        //try to remove this displayBalance call after every operation
        sc.close();

    }
}

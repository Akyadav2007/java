import java.util.Scanner;

public class DigitsThatRefusetoLetGo {
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=a;
            int sum=0;
           
           for(int temp=a;temp>0;temp=temp/10){
                   int c=temp%10;
                   int fact=1;
                   for(int i=1;i<=c;i++){
                           fact=fact*i;
                           
                   }
                   sum=sum+fact;
           }
            if(sum==b){
                    System.out.println("TRUE");
            }
            else{
                 System.out.println("FALSE");
                 }
    sc.close();
    }
}

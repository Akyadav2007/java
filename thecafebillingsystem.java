
import java.util.Scanner;
public class thecafebillingsystem{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int p1=sc.nextInt();
  int p2=sc.nextInt();
  int p3=sc.nextInt();
  int sum=p1+p2+p3;
  int avg=sum/10;
   sum=sum+avg;
  System.out.println(sum);
  sc.close();
}  
}
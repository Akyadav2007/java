
import java.util.Scanner;
public class chefandtheevintclub {
    


  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
      long n=sc.nextLong();
      long x=sc.nextLong();
      long  y=sc.nextLong();
      long net=x-y;
      long days;
      if (n<=x){
        days=1;
      }else{
        days=(n-x+net-1)/net+1;
        
      }
      System.out.println(days);
    }
    sc.close();
  }
}
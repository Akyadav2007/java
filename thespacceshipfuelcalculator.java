 import java.util.Scanner;
public class thespacceshipfuelcalculator {
   

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=1;i<=t;i++){
      int n=sc.nextInt();
      long fact = 1;
      for(int j = 1 ; j <= n; j++){
        fact *= j;
      }
      System.out.println(fact);
      sc.close();
    }
  }
}

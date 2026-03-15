import java.util.Scanner;

public class thespeaceshipcalcuator {
    public static void main(String args []){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
   
    for(int i=1;i<=a;i++){
      int n=sc.nextInt();
      long fact=1;
    for(int j=1;j<=n;j++){
      fact=fact*j;
    }
    System.out.println(fact);
    }
    sc.close();
  }
}

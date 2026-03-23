import java.util.Scanner;
public class lovemathinnumber {
  public static long gcd(long a, long b){
   while(b!=0){
    long temp=b;
    b=a%b;
    a=temp;
  }
    return a;
  }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=1;i<=t;i++){
        long a=sc.nextLong();
        long b=sc.nextLong();
        long gcdValue=gcd(a,b);
        long lcmValue=(a/gcdValue)*b;
        System.out.println(gcdValue+" "+lcmValue);
      }
      sc.close();
    }
}
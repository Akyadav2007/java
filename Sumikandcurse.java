import java.util.Scanner;

public class Sumikandcurse {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++){
        long b=sc.nextLong();
        long temp=b;
        long sum=0;
        while(temp>0){
          sum+=temp%10;
          temp/=10;
        }
          if(b%sum==0){
            System.out.println("Harshad");
          }else{
            System.out.println("Not Harshad");
          }
        }
      
      sc.close();
      
    }
}
import java.util.Scanner;

public class nimgame {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=0;i<a;i++){
        long b=sc.nextLong();
        if(b%4==0){
          System.out.println("false");
          
        }else{
          System.out.println("true");
        }
      }
      sc.close();
    }
}
import java.util.Scanner;

public class thelastrideoffarewellparty {
     public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++){
        int b=sc.nextInt();
        int car=(b+3)/4;
        System.out.println(car); 
      }
      sc.close();
    }
}


import java.util.Scanner;

public class perfectnumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++){
        int b=sc.nextInt();
        int sum=0;
        
        
        for(int j=1;j<b;j++){
        if(b%j==0){
          sum+=j;
          
        }
        }
      if(sum==b){
        System.out.println("true");
      }else{
        System.out.println("false");
      }
      }
      sc.close();
    }
}
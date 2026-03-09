import java.util.Scanner;

public class thealternatedaysmystery {
      public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++){
        int b=sc.nextInt();
        int evensum=0;
        int oddsum=0;
        for(int j=1;j<=b;j++){
          int c=sc.nextInt();
          if(j%2==0){
            evensum+=c;
            
          }else{
            oddsum+=c;
          }
          
        }
        if(evensum>oddsum){
          System.out.println(evensum);
          
        }else{
          System.out.println(oddsum);
              }
      }
      sc.close();
    }
}

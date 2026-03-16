import java.util.Scanner;

public class divibleduel{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      while(a>0){
        int x=sc.nextInt();
        int y=sc.nextInt();
       int evensum=0;
        int oddsum=0;
        int num=x;
        while(num<=y){
          if(num%x==0){
            if(num%2==0){
            evensum+=num;
            }
          else{
            oddsum+=num;
           }
          }
        num++;
      }
      if(evensum>=oddsum){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
      a--;
    }
      sc.close();
    }
}
import java.util.Scanner;
public class thesecretvaultpasscode{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=1;i<=t;i++){
      int a=sc.nextInt();
      int sum=0;
      int count=1;
      while(a>0){
        int digit=a%10;
        if(count%2!=0){
          sum=sum+digit;
        }else{
          sum=sum-digit;
        }
        a=a/10;
        count++;
      }
      System.out.println(sum);
      
    }
    sc.close();
  }
}
import java.util.Scanner;
public class lovetriangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++){
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int max=0;
        if(a>=b && a>=c){
          max=a;
          
        }else if(b>=a && b>=c){
          max=b;
        }else{
          max=c;
        }
        System.out.println(max);
        
      }
      sc.close();
    }
}
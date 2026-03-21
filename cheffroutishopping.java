   import java.util.Scanner;
public class cheffroutishopping {

  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int z=sc.nextInt();
    int total=((x*a)+(y*b));
    if(total<=z){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
    sc.close();
  }
} 


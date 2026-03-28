 import java.util.Scanner;
public class chefandhailstone{
  public static void main(String args []){
     Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      long  n=sc.nextLong();
       long steps=0;
      
      while(n!=1){
        if(n%2==0){
          n=n/2;
        }
      else{
        n=n*3+1;
      }
        steps++;
      }
      System.out.println(steps);
    }
    sc.close();
  }
} 

import java.util.Scanner;

public class chefandthedigitdetective{
    

  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
  for(int i=1;i<=t;i++){
    String N=sc.next();
    int D=sc.nextInt();
    int count=0;
    for(int j=0;j<N.length();j++){
      if(N.charAt(j)-'0' == D){
        count++;
      }
    }
      System.out.println(count);    
  }
  sc.close();
  }
}


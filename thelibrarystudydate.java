import java.util.Scanner;

public class thelibrarystudydate {
      public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if((x>10 || y<5) && (z==0 ||x+y>z)){
                    
                    System.out.println("True");
            }else{
                    System.out.println("False");
            }
            sc.close();
    }
}

import java.util.Scanner;

public class thenearestcount {
            public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      for(int i=1;i<=a;i++){
      int x=sc.nextInt();
      int y=sc.nextInt();      
      int z;
        if(x>y){
          z=x-y;
        }else{
          z=y-x;
        }
        int ans=(z+1)/2;
        System.out.println(ans);
        
      }
      sc.close();
    }

}

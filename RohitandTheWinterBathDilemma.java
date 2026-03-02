  import java.util.Scanner;
public class RohitandTheWinterBathDilemma {
  

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            for(int i=1;i<=T;i++){
                    int X=sc.nextInt();
                    int Y=sc.nextInt();
                    int r=2*Y;
                         if(X<r){
                         
                            System.out.println(0);
                    }else{
                                 System.out.println(X/r);
                         }
            }
            sc.close();
    }
}
}

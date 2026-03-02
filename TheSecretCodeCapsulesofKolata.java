import java.util.Scanner;
public class TheSecretCodeCapsulesofKolata {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
           int  T = sc.nextInt();
           for(int i=1;i<=T;i++){
                    int N=sc.nextInt();
                     int count =0;
                    count+=N/2000;
                    N=N%2000;
                    count+=N/500;
                    N=N%500;
                    count+=N/100;
                    N=N%100;
                 System.out.println(count+N);
                    
            }
            sc.close();
    }
}

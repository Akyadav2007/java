import java.util.Scanner;

public class thesecuritycode{
    
    static boolean isPrime(int N){
        if(N<=1){
            return false;
        }
        for(int i = 2; i<N; i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
        int code1 = sc.nextInt();
        int code2 = sc.nextInt();

        if (isPrime(code1) && isPrime(code2)) {
            System.out.println("Vault Opened");
        } else {
            System.out.println("Alarms Triggered");
        }
        }
        sc.close();
    }
}

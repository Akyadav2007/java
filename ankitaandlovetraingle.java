import java.util.Scanner;

public class ankitaandlovetraingle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while(a > 0){

            int b = sc.nextInt(); 
            int c = sc.nextInt(); 
            int d = sc.nextInt(); 

            int min;

            if(b > d){
                min = b;
            }else{
                min = d;
            }

            if(min <= c){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

            a--;
        }

        sc.close();
    }
}
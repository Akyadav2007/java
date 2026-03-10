import java.util.Scanner;

public class theevenconpiracy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 

        for (int i = 1; i <= a; i++) {

            int b = sc.nextInt(); 
            int oddcount = 0;     

            for (int j = 1; j <= b; j++) {
                int c = sc.nextInt();

                if (c % 2 != 0) {
                    oddcount++;
                }
            }

            if (oddcount % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}
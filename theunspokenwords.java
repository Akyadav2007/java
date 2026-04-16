
import java.util.Scanner;

public class theunspokenwords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long moves = 0;
        while (a > 0 && b > 0) {
            if (a == b) {
                moves++;
                break;
            }
            if (a > b) {
                moves += a / b;
                a %= b;
            } else {
                moves += b / a;
                b %= a;
            }
        }
        System.out.println(moves);
    }
}

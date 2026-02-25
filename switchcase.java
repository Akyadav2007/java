import java.util.Scanner;
public class switchcase{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        switch(days){
            case 1->System.out.println("monday");
            case 2->System.out.println("tuesday");
            case 3->System.out.println("wednesday");
            case 4->System.out.println("thrusday");
            case 5->System.out.println("friday");
            case 6->System.out.println("saturday");
            case 7->System.out.println("sunday");
            default->System.out.println("invalid");
        }
        sc.close();

    }
}
import java.util.Scanner;

public class theboywhomeasuredhisworth {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            for(int i=1;i<=a;i++){
                    int b=sc.nextInt();
                    if(b%4==0){
                            System.out.println("Good");
                    }else{
                            System.out.println("Not Good");
                    }
            }
            sc.close();
    }
}

import java.util.Scanner;

public class piyushseccret {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            for(int i=1;i<=a;i++){
                    int mean=0;
                    int b=sc.nextInt();
                    int c=sc.nextInt();
                    int d=sc.nextInt();
                   
                     if(b<=c && b<=d){
                            mean=b;
                    }else if(c<=b && c<=d){
                           mean=c;
                    }else{
                    mean=d;
                    }
                    int e=mean*10;
                    int r=(b-mean)+(c-mean)+(d-mean);
                    int rcoins=r*3;
                    int total=e+rcoins;
                    System.out.println(total);
            }
            sc.close();
    }
}

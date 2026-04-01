 
    import java.util.Scanner;
public class theolympicjudge{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    //int n=s.nextInt();
   double sum=0; 
    for(int i=1;i<=5;i++){
      int sc = s.nextInt();
      
      sum+=sc;
    }
    double avg=sum/5.0;
    // int avg=(int)avg;
    System.out.println((int)avg);
    s.close();
  }
}


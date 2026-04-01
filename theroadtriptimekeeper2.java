
import java.util.Scanner;
class car{
  int speed;
  int CalculateDistance(int time){
    return (time+speed -1)/speed;
  }
}
public class theroadtriptimekeeper2 {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int speed=sc.nextInt();
    int n=sc.nextInt();
    car mycar=new car();
    mycar.speed=speed;
    for(int i=0;i<n;i++){
    int time=sc.nextInt();
    System.out.print(mycar.CalculateDistance(time)+" ");
    }
    sc.close();  
}
}

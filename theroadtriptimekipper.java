
    import java.util.Scanner;
class  car{
  int speed;
  int calculateTime(int distance){
    return distance/speed;
  }
}
public class theroadtriptimekipper {
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int speed=sc.nextInt();
    int n=sc.nextInt();
    car mycar=new car();
    mycar.speed=speed;
    for(int i=0;i<n;i++){
      int distance=sc.nextInt();
      System.out.print(mycar.calculateTime(distance)+" ");
    }
    sc.close();
  }
}


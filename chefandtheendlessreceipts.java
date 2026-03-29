import java.util.Scanner;
public class chefandtheendlessreceipts{

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    long sum=0;
    while(sc.hasNextLong()){
      sum+=sc.nextLong();
    }
    System.out.println(sum);
    sc.close();
  }
}


  import java.util.Scanner;

public class chefandalternatingleader {
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int result = 0;
    int index = 0;
    while(sc.hasNextInt()){
      int num=sc.nextInt();
      if(index % 2 == 0){
        result += num;
      }else{
        result -= num;
      }
      index++;
    }
    System.out.println(result);
  }
}


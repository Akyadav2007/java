import java.util.Scanner;
class rectangle{
  int length;
  int width;

int area(){
  return length*width;
  
}
 int Perimeter(){
  return 2*(length+width);
}
}
public class rectangleblueprint{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    rectangle myBox=new rectangle();
    myBox.length=sc.nextInt();
    myBox.width=sc.nextInt();
    System.out.println("Area: "+myBox.area());
    System.out.println("Perimeter: "+myBox.Perimeter());
    sc.close();
  }
}

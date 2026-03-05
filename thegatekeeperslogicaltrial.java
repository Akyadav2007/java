import java.util.Scanner;

public class thegatekeeperslogicaltrial {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
          for(int i=0;i<t;i++){
                  int age=sc.nextInt();
                  boolean hasID=sc.nextBoolean();
                  boolean hasTicket =sc.nextBoolean();
                  if(age>=18&& hasID && hasTicket){
                          System.out.println("true");
                  }else{
                          System.out.println("false");
                  }
          }  
            sc.close();
          
    }
}

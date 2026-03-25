import java.util.Scanner;

public class chefandthesmallnotes {
    public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int t=sc.nextInt();
    int [] notes={2000,500,100,1};
    for(int i=1;i<=t;i++){
      int n=sc.nextInt();
      int count=0;
      for(int j=0;j< notes.length;j++){
        count+= n/notes[j];
        n=n%notes[j];
        
      }
      System.out.println(count);
    }
    sc.close();
    
  }
}

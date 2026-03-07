import java.util.Scanner;
public class chefandthesugerintake {
   
        public  static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int x=sc.nextInt();
          int sum=0;
          int count=0;
          for(int i=0;i<n;i++){
            int s=sc.nextInt();
            if(sum+s<=x){
              sum+=s;
              count++;
            }else{
              break;
            }
              
          }
          System.out.println(count);
          sc.close();
        }
}


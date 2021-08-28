//arithmetic progression for 2 combined aritmetic series
import java.util.*;
public class apfor2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nth value");
        int n=sc.nextInt();
        if(n%2==0){
            int a1=0,a2=7;
            int diff=a2-a1;
            n=n/2;
             int term=a1+(n-1)*diff;
             System.out.println(" the nth term is "+term);
             
            
            
        }
        else
        {
            int a1=0,a2=6;
            int diff=a2-a1;
            n=(n/2)+1;
             int term=a1+(n-1)*diff;
             System.out.println(" the nth term is "+term);
        }
    }    
}

//arithmetic progression for one series 
import java.util.*;

public class ap {
    public static void main(String[]args)
    {
        int term;
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the first term");
        int a1=sc.nextInt();
        System.out.println(" enter the second term");
        int a2=sc.nextInt();
        System.out.println(" enter the  term to find ");
        int n=sc.nextInt();
        int d=a2-a1;
        term=a1+((n-1)*d);
        System.out.println(" "+term); 
        
    }
    
}

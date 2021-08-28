import java.io.*;
import java.util.*;

public class palindrome {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int n=sc.nextInt();
        int sum=0,r,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
            
        }
        if(temp==sum){
            System.out.println("the number is palindrome");
        }
        else
            System.out.println("the number is not palindrome");
           }
    
    
}

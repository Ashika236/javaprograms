 /*A special numer is a number if the sum of the factorial of digits of a number (N) is equal to the number itself.
 for example 145 is a special number 1!+4!+5!=145
 154 is not a special number 1!+5!+4!=145*/
 
import java.util.*;
public class specialnumber {
    public static void main(String[]args){
       int n,number,last_digit,sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       number=sc.nextInt();
       n=number;
       while(number>0){
           last_digit=number%10;
           int fact=1;
           for(int i=1;i<=last_digit;i++){
               fact=fact*i;
               
           }
           sum=sum+fact;
           number=number/10;
           
       }
       if(n==0){
           System.out.println(n+ "is not a special number");
       }
       else if(n==sum){
           System.out.print(n+ " is a special number\n");
         
       }
       else
           System.out.println(n+"is not a special number");
    }
    
}

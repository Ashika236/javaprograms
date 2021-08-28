//Special numbers between a range of number 
//for a range
import java.util.*;
public class specialnumber1 {
    static int factorial[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};  
public static void main(String args[])   
{  
Scanner in = new Scanner(System.in);  
boolean Special = false;  
System.out.print("Enter the upper range: ");  
int n = in.nextInt();   
for(int i=1; i<=n; i++)  
{  
if(isSpecialNumber(i))  
{    
System.out.print(i+"\t");  
Special = true;  
}  
}  
if(!Special)  
System.out.println("No special numbers found.");  
}   
private static boolean isSpecialNumber(int n)  
{  
int digit, sum=0, temp=n;  
while(temp != 0)  
{       
digit = temp%10;  
sum = sum + factorial[digit];  
temp = temp/10;  
}  
return sum == n;  

}
    


}

import java.util.*;
public class armstrong {
          
//driver code  
public static void  main(String args[])     
{     
int num, temp, digits=0, last=0, sum=0,flag=0;
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the number: ");  
//reads the limit from the user  
num=sc.nextInt();  
  temp=num;
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = num;   
while(temp>0)   
{   
//determines the last digit from the number      
last = temp % 10;   
//calculates the power of a number up to digit times and add the resultant to the sum variable  
sum +=  (Math.pow(last, digits));   
//removes the last digit   
temp = temp/10;   
}  
//compares the sum with n  
if(num==sum)
    flag=1; 
else
    flag=0;

if(flag==1)
{  
System.out.print("Armstrong ");  
}  
  else
 
{  
System.out.print("Not Armstrong ");  
}  
}   

  
}


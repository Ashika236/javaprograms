/*sorting the strings accepted from the user
input:
bangalore
delhi
agra
chennai

output:
Agra
bangalore
chennai
delhi
*/
import java.util.*;
public class sortingstring {
    public static void main(String[]args){
        //String str[]={"bangalore","delhi","agra","chennai"};
        String  temp;
        String str[]=new String[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n= sc.nextInt();
        System.out.println("enter names ");
        for(int i=0;i<=n;i++)
        {
            str[i]=sc.nextLine();
            
        }
        
        
     
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                //ascneding order
                if(str[i].compareTo(str[j])<0)//descending orderif(str[i].compareTo(str[j])>0)
                {
                    temp=str[j];
                    str[j]=str[i];
                    str[i]=temp;
                }
            }
        }
        System.out.println("the sorted array is ");
        for(int i=0;i<=n;i++){
        System.out.println(" "+str[i]);
        }
       
        
    }
    
}

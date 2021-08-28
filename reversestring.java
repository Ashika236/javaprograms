/*reversing a string*/







import java.util.*;
public class reversestring {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        StringBuilder sb= new StringBuilder();
String rev;
for(int i = str.length() - 1; i >= 0; i--)
{
sb.append(str.charAt(i));
    //rev=rev+str.charAt(i);
}
System.out.println(sb.toString());
}
}

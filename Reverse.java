//Program to reverse an string
import java.util.Scanner;
class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your original string");
		String s=sc.nextLine();
		System.out.println("your Reversed string is");
		reversewithoutarray(s);
		System.out.println();
		reversewitharray(s);
	}
	public static void reversewithoutarray(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>-1;i--)
		{
			rev+=s.charAt(i);
		}
		System.out.print(rev);
	}
	public static void reversewitharray(String s)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
		String str=new String(ch);
		System.out.print(str);
	}
}

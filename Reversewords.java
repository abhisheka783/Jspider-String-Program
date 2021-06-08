//Program to reverse words an string
import java.util.Scanner;
class Reversewords
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your original string");
		String s=sc.nextLine();
		System.out.println("your Reversed string is");
		System.out.println();
		reversewords(s);
		
	}
	public static void reversewords(String s)
	{
		String[] str=s.split(" ");
		for(String w:str)
		{
			w=reverse(w);
			System.out.print(w+" ");
		}
	}
	public static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		return rev;
	}
}

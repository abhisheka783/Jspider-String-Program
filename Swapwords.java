//Program to swap words an string
import java.util.Scanner;
class Swapwords
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your original string");
		String s=sc.nextLine();
		System.out.println("your swapped string is");
		System.out.println();
		swapwords(s);
		
	}
	public static void swapwords(String s)
	{
		String[] str=splitmethod(s);
		String temp="";
		for(int i=0;i<str.length/2;i++)
		{
			temp=str[i];
			str[i]=str[str.length-1-i];
			str[str.length-1-i]=temp;
		}
		for(String i:str)
			System.out.print(i+" ");
	}
	public static int spacing(String s)
	{
		int space=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				space++;
		}
		return space;
	}
	public static String[] splitmethod(String s)
	{
		String[] str=new String[spacing(s)];
		String res="";
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
				res+=s.charAt(i);
			else
			{
				str[j]=res;
				j++;
				res="";
			}
		}
		str[j++]=res;
		return str;
	}
}

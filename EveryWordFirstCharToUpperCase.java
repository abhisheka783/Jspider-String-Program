//wap to convert every word first char into upper case from given string
import java.util.Scanner;
class EveryWordFirstCharToUpperCase
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String s=sc.nextLine();
		System.out.println("Your Required string ");
		System.out.println(initcap(s));
	}
	public static String initcap(String s)
	{
		char[] ch=s.toCharArray();
		ch[0]=(char)(ch[0]-32);
		for(int i=1;i<ch.length;i++)
		{
			if(ch[i]== ' ')
				ch[i+1]=(char)(ch[i+1]-32);
		}
		return new String(ch);
	}
}

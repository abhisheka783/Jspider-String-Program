//wap to convert all upper case to lower case without using toLowerCase();
import java.util.Scanner;
class Uppertolower
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String s=sc.nextLine();
		System.out.println("Your string in lower case");
		String lower=lowercase(s);
		System.out.println(lower);
	}
	public static String lowercase(String s)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char)(ch[i]+32);
		}
		return new String(ch);
	}
}

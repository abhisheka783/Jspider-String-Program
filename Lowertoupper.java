//wap to convert all lower case to upper case without using toUpperCase();
import java.util.Scanner;
class Lowertoupper
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String s=sc.nextLine();
		System.out.println("Your string in Upper case");
		String upper=uppercase(s);
		System.out.println(upper);
	}
	public static String uppercase(String s)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char)(ch[i]-32);
		}
		return new String(ch);
	}
}

//wap to remove empty spaces from given string
import java.util.Scanner;
class Removeemptyspaces 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String s=sc.nextLine();
		System.out.println("Your string without Space");
		String nospace=removespace(s);
		System.out.println(nospace);
	}
	public static String removespace(String s)
	{
		String nospace="";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!= ' ')
				nospace+=ch[i];
		}
		return nospace;
	}
}

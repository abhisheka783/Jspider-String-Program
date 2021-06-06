//wap to remove all special character from string
import java.util.Scanner;
class RemoveSpecialCharacter
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String s=sc.nextLine();
		System.out.println("Your string without special character");
		String nospecial=removespecial(s);
		System.out.println(nospecial);
	}
	public static String removespecial(String s)
	{
		String nospecial="";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
				nospecial+=ch[i];
			else if(ch[i]>=97 && ch[i]<=122)
				nospecial+=ch[i];
			else if(ch[i]>=48 && ch[i]<=57)
				nospecial+=ch[i];
			else
				continue;
		}
		return nospecial;
	}
}

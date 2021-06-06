//wap to convert all lower case to upper case and vice versa without using toUpperCase();
import java.util.Scanner;
class Casechange
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String s=sc.nextLine();
		System.out.println("Your string in reverse case");
		String upperlower=casechanging(s);
		System.out.println(upperlower);
	}
	public static String casechanging(String s)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
				ch[i]=(char)(ch[i]+32);
			else if(ch[i]>=97 && ch[i]<=122)
				ch[i]=(char)(ch[i]-32);
			else
				ch[i]=ch[i];
		}
		return new String(ch);
	}
}

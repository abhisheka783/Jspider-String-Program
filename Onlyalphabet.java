//wap to print only alphabet from string
import java.util.Scanner;
class Onlyalphabet
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String s=sc.nextLine();
		System.out.println("Your string with only alphabet");
		String alphabet=onlyalphabet(s);
		System.out.println(alphabet);
	}
	public static String onlyalphabet(String s)
	{
		String alphabet="";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>='A' && ch[i]<='Z')||(ch[i]>='a' && ch[i]<='z'))
				alphabet+=ch[i];
		}
		return alphabet;
	}
}

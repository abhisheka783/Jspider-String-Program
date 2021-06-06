//check weather the string is palindrome or not
import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		if(ispalindrome(s))
			System.out.println("Entered string is Palindrome");
		else
			System.out.println("Entered string is not Palindrome");
	}
	public static boolean ispalindrome(String s)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			if(ch[i]!=ch[ch.length-1-i])
				return false;
		}
		return true;
	}
}

//wap to convert numeric string to number
import java.util.Scanner;
class Tonumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String s=sc.nextLine();
		System.out.println("Your string into number is");
		int number=converttonumber(s);
		System.out.println(number);
	}
	public static int converttonumber(String s)
	{
		char[] ch=s.toCharArray();
		int num=0;
		for(char i:ch)
			num=num*10+i-48;
		return num;
	}
}

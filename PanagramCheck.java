//wap to check wether the string is Panagram or not
import java.util.*;
class  PanagramCheck
{
	public static void main(String[] args) throws Exception 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your string of more than 26 character");
			String s = sc.nextLine();
			if(isPanagramCheck(s))
				System.out.println("Panagram ");
			else
				System.out.println("Not Panagram");
		
	}

	public static boolean isPanagramCheck(String s)
	{
		String afterspace = RemoveSpace(s);
		afterspace.toLowerCase();
		int a[] = new int[26];
		for(int i = 0; i < afterspace.length(); i++)
			a[afterspace.charAt(i) - 'a']++;
		for(int x : a)
		{
			if(x == 0)
				return false;
		}
		return true;
	}

	public static String RemoveSpace(String s){
		String nospace = "";
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != ' ')
				nospace += s.charAt(i);
		}
		return nospace;
	}

}
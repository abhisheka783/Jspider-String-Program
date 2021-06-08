//Program to check wether two string is anagram or not
import java.util.Scanner;
import java.util.*;
class AnagramCheck
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 1st string");
		String s1=sc.nextLine();
		System.out.println("Enter your 2nd string");
		String s2=sc.nextLine();
		System.out.println();
		if(anagram(s1,s2))
			System.out.println("anagram");
		else
			System.out.println("Not an anagram");
		
	}
	public static String removespace(String s)
	{
		String nospace="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				nospace+=s.charAt(i);
		}
		return nospace;
	}
	public static boolean anagram(String a,String b)
	{
		String s1=removespace(a);
		String s2=removespace(b);

		char[] str1=s1.toLowerCase().toCharArray();
		char[] str2=s2.toLowerCase().toCharArray();

		Arrays.sort(str1);
		Arrays.sort(str2);

		return Arrays.equals(str1,str2);
	}
}
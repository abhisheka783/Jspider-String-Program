//count no. of occurence of an character in an array
import java.util.Scanner;
class OccurenceOfCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your original string");
		String s=sc.nextLine();
		System.out.println();
		occurence(s);
	}
	public static void occurence(String s)
	{
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			if((ch[i]) != '$')
			{
				for(int j=i+1;j<ch.length;j++)
				{	
					if((ch[j]) != '$')
					{
						if(ch[i]==ch[j])
						{
							count++;
							ch[j]= '$';
						}
					}
				}
				if(ch[i]==' ')
					System.out.println("space occurs "+count+" times ");
				else
					System.out.println(ch[i]+ " occurs "+count+" times ");
			}
		}
	}
}

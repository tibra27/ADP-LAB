import java.util.*;
class NotHexadecimal extends Exception
{
	NotHexadecimal(String msg)
	{
		super(msg);
	}
}
class Hexa
{
	public static int test(String s)
	{
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			char c=s.charAt(i);
			if((c>='0' && c<='9') || (c>='A' && c<='F'))
			{
				continue;
			}
			else
			{
				return 0;
			}
		}
		return 1;
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		String s=sc.next();
		if(test(s)==1)
		{
			System.out.println(s+" is a Hexadecimal number!!!");
		}
		else
		{
			try
			{
				throw new NotHexadecimal("Not a Hexadecimal number!!!");
			}
			catch(NotHexadecimal a)
			{
				a.printStackTrace();
			}
			finally
			{
				System.out.println("The input string was::"+s);
			}
		}
	}
}

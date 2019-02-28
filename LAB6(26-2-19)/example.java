import java.util.*;
class RangeException  extends Exception
{
	RangeException (String msg)
	{
		super(msg);
	}
}
class example
{
	public static double add(String []arr)
	{
		double sum=0.0;
		int c=0;
		try
		{
			for(int i=0;i<arr.length;i++)
			{
				double x=Double.parseDouble(arr[i]);
				if(x<0 || x>1)
				{
					throw new RangeException("Number is not in range!!!");
				}
				c++;
				sum+=x;
			}
		}
		catch(RangeException a)
		{
			a.printStackTrace();
		}
		catch(NumberFormatException b)
		{
			b.printStackTrace();
		}
		finally
		{
			System.out.println("THANK YOU!!!!!");
		}
		if(c==arr.length)
		{
			return sum;
		}
		else
		{
			return -1000.0;
		}
		
	}
	public static void main(String []args)
	{
		System.out.print("Enter the number of elements:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String []arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		double y=add(arr);
		if(y!=-1000.0)
		{
			System.out.println("Sum of elements:"+y);
		}
		
	}
}

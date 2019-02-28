import java.util.*;
import java.lang.*;
class MyBeer
{
	public static void main(String []args)
	{
		int n=Integer.parseInt(args[0]);
		Random rand = new Random();
		int c=0;
		for(int i=0;i<1000;i++)
		{
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j] = rand.nextInt(n);
				if(j==a[j])
				{
					c++;
					break;
				}
			}
		}	
		double res=c/1000.0;
		System.out.println("Probability is:"+res);
	}
}

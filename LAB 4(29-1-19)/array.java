import java.util.Scanner;
interface Function
{
	public abstract int evaluate(int parameter);
}
class Half implements Function
{
	public int evaluate(int parameter)
	{
		return(parameter/2);
	}
}
class array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		Integer [] arr=new Integer[n];
		System.out.println("Enter elements of array");
		int i;
		for(i=0;i<n;i++)
		{
			int val = sc.nextInt();
			arr[i]=val;
		}
		Half h=new Half();
		for(i=0;i<n;i++)
		{
			arr[i]=h.evaluate(arr[i]);
		}
		System.out.println("updated array is::");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
}

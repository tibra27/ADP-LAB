import java.util.*;
class function
{
	public static void d()
	{
		int []arr=new int[10];
		try
		{
			for(int i=0;i<10;i++)
			{
				arr[i]=i+1;
			}
			System.out.println("arr[20]="+arr[20]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Exception in d()");
			throw new ArrayIndexOutOfBoundsException();
		}
		
		
	}
	public static void c()
	{
		try
		{
			d();
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Exception in c()");
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public static void b()
	{
		try
		{
			c();
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Exception in b()");
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public static void a()
	{
		try
		{
			b();
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Exception in a()");
			throw new ArrayIndexOutOfBoundsException();
		}
	}	
	public static void main(String []args)
	{
		try
		{
			a();
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Exception in main()");
		}	
	}
}

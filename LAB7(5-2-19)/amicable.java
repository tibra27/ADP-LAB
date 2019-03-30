import java.util.*;
class generate extends Thread
{
	int num,sum;
	public generate(int a)
	{
		num=a;
		sum=0;
	}
	public synchronized void run()
	{
		System.out.println("In Thread"+getName());
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		//this.notify();
	}
	public int getnum()
	{
		return num;
	}
	public int getsum()
	{
		return sum;
	}
}
class amicable
{
	public static void main(String []args)
	{
		System.out.println("ENTER FIRST NUMBER::");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER::");
		int b=sc.nextInt();
		generate g1=new generate(a);
		generate g2=new generate(b);
		g1.setName("CSA");
		g2.setName("CSB");
		g1.start();
		g2.start();
		/*synchronized(g1)
		{
			try
			{
				g1.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		synchronized(g2)
		{
			try
			{
				g2.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}*/
		try
		{
			g1.join();
			g2.join();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("In Thread "+Thread.currentThread().getName());
		if((g1.getnum()==g2.getsum())  && (g2.getnum()==g1.getsum()))
		{
			System.out.println(g1.getnum()+" and "+g2.getnum()+" are amicable.");
		}
		else
		{
			System.out.println(g1.getnum()+" and "+g2.getnum()+" are not amicable.");
		}
	}
}

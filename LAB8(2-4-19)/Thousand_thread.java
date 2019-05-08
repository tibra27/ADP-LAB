class shared
{
	int sum;
	public shared()
	{
		sum=0;
	}
}
class Thread_class extends Thread
{
	shared s1=null;
	public Thread_class(shared s1)
	{
		this.s1=s1;
	}
	public void run()
	{
		synchronized(s1)
		{
			s1.sum+=1;
			System.out.println(Thread.currentThread().getName()+"::"+s1.sum);
		}
	}
}
class Thousand_thread
{
	public static void main(String args[])
	{
		shared s1=new shared();
		Thread_class array[]=new Thread_class[1000];
		for(int i=0;i<1000;i++)
		{
			array[i]=new Thread_class(s1);
		}
		for(int i=0;i<1000;i++)
		{
			array[i].start();
		}
		try
		{
			for(int i=0;i<1000;i++)
			{
				array[i].join();
			}
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}

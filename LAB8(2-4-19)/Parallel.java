class shared
{
	double sum;
	double arr[]=new double[9000000];
	int flag;
	public shared()
	{
		sum=0;
		flag=0;
		for(int i=1;i<=9000000;i++)
		{
			arr[i-1]=i*1.0/2;
		}
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
			for(int i=s1.flag;i<s1.flag+9000;i++)
			{
				s1.sum+=s1.arr[i];
			}
			s1.flag+=9000;
			System.out.println(Thread.currentThread().getName()+"::"+s1.sum);
		}
	}
}
class Parallel
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
		System.out.println(Thread.currentThread().getName()+"::"+s1.sum);
	}
}

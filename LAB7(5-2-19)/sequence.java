import java.util.*;
class help
{

}
class even extends Thread
{
	help h=null;
	even(help h)
	{
		this.h=h;
	}
	public void run()
	{
		try
		{
			sleep(500);              //so that odd can run first
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		synchronized(h)
		{
		 	for(int i=2;i<=1000;i+=2)
			{
				try
				{
					sleep(50);
				}
				catch(InterruptedException ex)
				{
					ex.printStackTrace();
				}
			 	System.out.println(getName()+" : "+i);
			 	h.notify();
			 	try
				 {
				 	h.wait();
				 }
				 catch(InterruptedException ex)
				 {
				 	ex.printStackTrace();
				 }
			 }
			 h.notify();
		}
	}
}
class odd extends Thread
{
	help h=null;
	odd(help h)
	{
		this.h=h;
	}
	public void run()
	{
		synchronized(h)
		{
			for(int i=1;i<=1000;i+=2)
			{
				try
				{
					sleep(50);
				}
				catch(InterruptedException ex)
				{
					ex.printStackTrace();
				}
			 	System.out.println(getName()+"  : "+i);
			 	h.notify();
			 	try
				{
				 	h.wait();
				}
				catch(InterruptedException ex)
				{
				 	ex.printStackTrace();
				 }
			}
			h.notify();
		}

	}
}
class sequence
{
	public static void main(String []args)
	{
		help h=new help();
		odd o=new odd(h);
		even e=new even(h);
		o.setName("ODD");
		e.setName("EVEN");
		o.start();
		e.start();
	}
}

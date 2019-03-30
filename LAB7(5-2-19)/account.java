import java.util.*;
class common
{
    int balance;
    common()
    {
        balance=600;
    }
    common(int balance)
    {
        this.balance=balance;
    }
}
class father extends Thread
{
    common c=null;
    father(common c)
    {
        this.c=c;
    }
    public void run()
    {
        Random r=new Random();
        while(true)
        {
            synchronized(c)
            {
                while(c.balance<=2000)
                {
                    int amount=r.nextInt(200)%200+1;
                    c.balance+=amount;
                    System.out.println("Amount deposited:"+amount);
                    System.out.println("Current balance="+c.balance);
                    try
                    {
                        sleep(200);
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                }
                try
                {
                    c.notify();
                    Thread.sleep(200);
                    c.wait();
                }
                catch(InterruptedException ex)
                {
                     ex.printStackTrace();
                }
            }
        }
    }
}
class son extends Thread
{
    common c=null;
    son(common c)
    {
        this.c=c;
    }
    public void run()
    {
        try
		{
			Thread.sleep(100);    //sleep as first parent should be run
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
        Random r=new Random();
        while(true)
        {
            synchronized(c)
            {
                while(c.balance>=500)
                {
                    int amount=r.nextInt(150)%150+1;
                    c.balance-=amount;
                    System.out.println("Amount withdrawal:"+amount);
                    System.out.println("Current balance="+c.balance);
                    try
                    {
                        sleep(200);
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                }
                try
                {
                    c.notify();
                    Thread.sleep(200);
                    c.wait();
                }
                catch(InterruptedException ex)
                {
                     ex.printStackTrace();
                }
            }
        }
    }
}
class account
{
    public static void main(String []args)
    {
        common c=new common();
        father f=new father(c);
        son s=new son(c);
        f.setName("FATHER");
        s.setName("Son");
        f.start();
        s.start();
        try
        {
            f.join();
            s.join();
        }
        catch(InterruptedException ex)
        {
            System.out.println(ex);
        }
    }
}
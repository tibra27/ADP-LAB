import java.lang.*;
import java.util.*;
class Sine extends Thread
{
	public void run()
	{
		for(int i=0;i<=360;i++)
		{
			double y;
			y=Math.sin(Math.toRadians(i));
			System.out.println("sin("+i+")="+y);
		}
	}
}
class Cosine extends Thread
{
	public void run()
	{
		for(int i=0;i<=360;i++)
		{
			double y;
			y=Math.cos(Math.toRadians(i));
			System.out.println("cos("+i+")="+y);
		}
	}
}
class calculate
{
	public static void main(String []args)
	{
		System.out.print("::HERE IS THE SINE AND COSINE SERIES::");
		Sine s=new Sine();
		Cosine c=new Cosine();
		s.start();
		c.start();
	}
}

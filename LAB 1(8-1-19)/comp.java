public class comp
{
	float real,img;
	public comp(float a,float b)
	{
		this.real=a;
		this.img=b;
	}
	public static void show(comp c)
	{
		if(c.img<0)
		{
			System.out.printf("%.1f%.1fi\n",c.real,c.img);
		}
		else
		{
			System.out.printf("%.1f+%.1fi\n",c.real,c.img);
		}
		
	}
	public static comp add(comp c1,comp c2)
	{
		comp c=new comp(0,0);
		c.real=c1.real+c2.real;
		c.img=c1.img+c2.img;
		return(c);
	}
	public static comp sub(comp c1,comp c2)
	{
		comp c=new comp(0,0);
		c.real=c1.real-c2.real;
		c.img=c1.img-c2.img;
		return(c);
	}
	public static comp mul(comp c1,comp c2)
	{
		comp c=new comp(0,0);
		c.real=(c1.real*c2.real)-(c1.img*c2.img);
		c.img=(c1.img*c2.real)+(c1.real*c2.img);
		return(c);
	}
	public static comp div(comp c1,comp c2)
	{
		comp c=new comp(0,0);
		float z=(c2.real*c2.real)+(c2.img*c2.img);
		c.real=((c1.real*c2.real)+(c1.img*c2.img))/z;
		c.img=((c1.img*c2.real)-(c1.real*c2.img))/z;
		return(c);
	}
	public static void main(String[] args)
	{
			comp c1=new comp(3,4);
			comp c2=new comp(2,5);
			comp c=add(c1,c2);
			System.out.printf("addition is::");
			show(c);
			c=sub(c1,c2);
			System.out.printf("subtraction is::");
			show(c);
			c=mul(c1,c2);
			System.out.printf("multiplication is::");
			show(c);
			c=div(c1,c2);
			System.out.printf("division is::");
			show(c);
			
	}
}

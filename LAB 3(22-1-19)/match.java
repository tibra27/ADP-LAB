class match
{
	private String name;
	private int w;
	private int x;
	private int y;
	private int z;
	public match(String n,int w1,int x1,int y1,int z1)
	{
		name=n;
		w=w1;
		x=x1;
		y=y1;
		z=z1;
	}
	public void avgrun()
	{
		int s;
		int i;
		s=w+x+y+z;
		float avg;
		avg=s/4;
		System.out.println("average of "+name+" = "+avg);
	}
	public int totalrun()
	{
		int s;
		int i;
		s=w+x+y+z;
		System.out.println("total of "+name+" = "+s);
		return(s);
	}
	public int max_total(int t1,int t2,int t3,int t4,int t5)
	{
		int q=Math.max(t1,Math.max(Math.max(t2,t3),Math.max(t4,t5)));
		return(q);
	}
	public static void main(String args[])
	{
		match m1=new match("DHONI",45,130,10,75);
		m1.avgrun();
		int t1;
		t1=m1.totalrun();
		match m2=new match("SACHIN",75,170,60,55);
		m2.avgrun();
		int t2;
		t2=m2.totalrun();
		match m3=new match("DRAVID",51,45,125,65);
		m3.avgrun();
		int t3;
		t3=m3.totalrun();
		match m4=new match("YUVRAJ",40,70,65,40);
		m4.avgrun();
		int t4;
		t4=m4.totalrun();
		match m5=new match("GANGULY",35,90,55,120);	
		m5.avgrun();
		int t5;
		t5=m5.totalrun();
		
		int mx=m1.max_total(t1,t2,t3,t4,t5);
		if(mx==t1)
		{
			System.out.println("Highest total is of:DHONI");
		}
		if(mx==t2)
		{
			System.out.println("Highest total is of:SACHIN");
		}
		if(mx==t3)
		{
			System.out.println("Highest total is of:DRAVID");
		}
		if(mx==t4)
		{
			System.out.println("Highest total is of:YUVRAJ");
		}
		if(mx==t5)
		{
			System.out.println("Highest total is of:GANGULY");
		}
	}		
}


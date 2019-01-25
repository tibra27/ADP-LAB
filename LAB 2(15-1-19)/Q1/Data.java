class Data
{
	private	int day;
	private	int month;
	private	int year;
	public Data()
		{
			day=12;
			month=3;
			year=1993;
		}
	public Data(Data d)
		{
			day=d.day;
			month=d.month;
			year=d.year;
		}
	public Data(int a,int b,int c)
		{
			day=a;
			month=b;
			year=c;			
		}
	public void show()
		{
			System.out.println("day="+day);
			System.out.println("month="+month);
			System.out.println("year="+year);
			System.out.println("");			
		}	
		
	public static void main(String args[])
		{
			Data d1=new Data();
			Data d2=new Data(27,9,1997);
			Data d3=new Data(d1);
			d1.show();
			d2.show();
			d3.show();
		}		
}

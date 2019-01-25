#include<bits/stdc++.h>
using namespace std;
class Data
{
	int day;
	int month;
	int year;
	public:
		Data()
		{
			day=12;
			month=3;
			year=1993;
		}
		Data(int x,int a=12,int b=10,int c=2000)
		{
			day=a;
			month=b;
			year=c;			
		}
		Data(Data &d)
		{
			day=d.day;
			month=d.month;
			year=d.year;
		}
		void show()
		{
			cout<<"day="<<day<<endl;
			cout<<"month="<<month<<endl;
			cout<<"year="<<year<<endl;
			cout<<endl;
		}
};
int main()
{	
	Data d1,d2;
	d1=Data();
	d2=Data(27,9,1997);
	Data d3(20,10,1);
	Data d4=d3;
	d1.show();
	d2.show();
	d3.show();
	d4.show();
	return 0;
}

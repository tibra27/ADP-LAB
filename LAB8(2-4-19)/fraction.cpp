#include<bits/stdc++.h>
using namespace std;
class fraction
{
	int a,b;
	public:
		fraction()
		{
		}
		fraction(int x,int y)
		{
			a=x;
			b=y;
		}
		int operator==(fraction & f)
		{
			float x,y;
			x=a*1.0/b;
			y=f.a*1.0/f.b;
			if(x==y)
			{
				return(1);
			}
			else
			{
				return 0;
			}
		}
		int operator>(fraction & f)
		{
			float x,y;
			x=a*1.0/b;
			y=f.a*1.0/f.b;
			if(x>y)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		int operator<(fraction & f)
		{
			float x,y;
			x=a*1.0/b;
			y=f.a*1.0/f.b;
			if(x<y)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		fraction operator+(fraction & f)
		{
			fraction temp;
			temp.a=a*f.b+b*f.a;
			temp.b=b*f.b;
			int x=__gcd(temp.a,temp.b);
			temp.a/=x;
			temp.b/=x;
			return(temp);
		}
		fraction operator-(fraction & f)
		{
			fraction temp;
			temp.a=a*f.b-b*f.a;
			temp.b=b*f.b;
			int x=__gcd(temp.a,temp.b);
			temp.a/=x;
			temp.b/=x;
			return(temp);
		}
		fraction operator*(fraction & f)
		{
			fraction temp;
			temp.a=a*f.a;
			temp.b=b*f.b;
			int x=__gcd(temp.a,temp.b);
			temp.a/=x;
			temp.b/=x;
			return(temp);
		}
		fraction operator/(fraction & f)
		{
			fraction temp;
			temp.a=a*f.b;
			temp.b=b*f.a;
			int x=__gcd(temp.a,temp.b);
			temp.a/=x;
			temp.b/=x;
			return(temp);
		}
		void show()
		{
			cout<<"a/b="<<a<<"/"<<b<<endl;
		}
};
int main()
{
	int x,y;
	cout<<"Enter first fraction::"<<endl;
	cout<<"Enter a/b as a b::";
	cin>>x>>y;
	fraction f1(x,y);
	cout<<"Enter second fraction::"<<endl;
	cout<<"Enter a/b as a b::";
	cin>>x>>y;
	fraction f2(x,y);
	fraction f3;
	while(1)
	{
		cout<<"1.compare  2.addition  3.subtraction  4.multiplication  5.division  6.Exit"<<endl;
		int i;
		cin>>i;
		if(i==1)
		{
			if(f1==f2)
			{
				cout<<"both fractions are equal!"<<endl;
			}
			else
			{
				if(f1>f2)
				{
					cout<<"fraction1>fraction2"<<endl;
				}
				else if(f1<f2)
				{
					cout<<"fraction1<fraction2"<<endl;
				}
			}			
		}
		else if(i==2)
		{
			f3=f1+f2;
			f3.show();
		}
		else if(i==3)
		{
			f3=f1-f2;
			f3.show();
		}
		else if(i==4)
		{
			f3=f1*f2;
			f3.show();
		}
		else if(i==5)
		{
			f3=f1/f2;
			f3.show();
		}
		else
		{
			break;
		}
		
	}
	return 0;
}

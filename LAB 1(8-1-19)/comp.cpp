#include<bits/stdc++.h>
using namespace std;
class comp
{
    float real,img;
    public:
	void input()
	{
		float a,b;
		cout<<"enter real part::";
		cin>>a;
		real=a;
		cout<<"enter imaginary part::";
		cin>>b;
		img=b;
	}
	void show()
	{
		if(img<0)
		{
			cout<<real<<"-i"<<-1*img<<endl;
		}
		else
		{
			cout<<real<<"+i"<<img<<endl;
		}
	}
	comp operator +(comp c)
	{
		comp ans;
		ans.real=real+c.real;
		ans.img=img+c.img;
		return ans;
	}
	comp operator -(comp c)
	{
		comp ans;
		ans.real=real-c.real;
		ans.img=img-c.img;
		return ans;
	}
	comp operator *(comp c)
	{
		comp ans;
		ans.real=(real*c.real)-(img*c.img);
		ans.img=(real*c.img)+(img*c.real);
		return ans;
	}
	comp operator /(comp c)
	{
		comp ans;
		float z=(c.real*c.real)+(c.img*c.img);
		float x=((real*c.real)+(img*c.img))/z;
		float y=((img*c.real)-(real*c.img))/z;
		ans.real=x;
		ans.img=y;
		return ans;
	}
};
int main()
{
	comp c1,c2;
	c1.input();
	c1.show();
	c2.input();
	c2.show();
	comp x;
	cout<<"choose options::"<<endl<<"1.add"<<endl<<"2.sutract"<<endl<<"3.multiply"<<endl<<"4.division"<<endl<<"5.exit"<<endl;
	while(1)
	{
		
		int ch;
		cin>>ch;
		if(ch==5)
		{
			break;
		}
		if(ch==1)
		{
			x=c1+c2;
			cout<<"addition is:";
			x.show();	
		}
		if(ch==2)
		{
			x=c1-c2;
			cout<<"subtraction is:";
			x.show();	
		}
		if(ch==3)
		{
			x=c1*c2;
			cout<<"multiplication is:";
			x.show();	
		}
		if(ch==4)
		{
			x=c1/c2;
			cout<<"division is:";
			x.show();	
		}
	}
	return 0;
}

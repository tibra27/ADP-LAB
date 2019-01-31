#include<bits/stdc++.h>
using namespace std;
class Product
{
	int product_id;
	string name;
	int cat_id;
	float unit_price;
	public:
		void read()
		{
			cout<<"give details of product::"<<endl;
			cout<<"enter Product id::";
			cin>>product_id;
			cout<<"enter name::";
			cin>>name;
			cout<<"enter Category id::";
			cin>>cat_id;
			cout<<"enter unit price::";
			cin>>unit_price;
		}
		void update(float p)
		{
			unit_price=p;
		}
		void show()
		{
			cout<<"product id="<<product_id<<endl;
			cout<<"name="<<name<<endl;
			cout<<"category id="<<cat_id<<endl;
			cout<<"price="<<unit_price<<endl;
		}
};
class ElectricalProduct : public Product
{
	int voltage_range;
	int wattage;
	public:
		void input()
		{
			read();
			cout<<"give details of electrical product::"<<endl;
			cout<<"enter voltage range::";
			cin>>voltage_range;
			cout<<"enter wattage::";
			cin>>wattage;
		}
		void change()
		{
			float p;
			cout<<"enter wattage value to update::";
			cin>>wattage;
			cout<<"enter updated price value::";
			cin>>p;
			update(p);
		}
		void display()
		{
			cout<<"Electrical product details are::"<<endl;
			show();
			cout<<"voltage range="<<voltage_range<<endl;
			cout<<"wattage="<<wattage<<endl;
		}
};
int main()
{
	ElectricalProduct p1;
	p1.input();
	p1.change();
	p1.display();
	return 0;
}

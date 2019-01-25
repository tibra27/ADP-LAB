#include<bits/stdc++.h>
using namespace std;
class Student
{
	int admno;
	char name[20];
	float marksEng;
	float marksMaths;
	float marksSci;
	float total;
	public:
		void readData()
		{
			cout<<"enter admission no. of student"<<endl;
			cin>>admno;
			cout<<endl<<"enter name of the student"<<endl;
			cin>>name;
			cout<<endl<<"enter marks in english,maths and science"<<endl;
			cin>>marksEng>>marksMaths>>marksSci;
			cout<<endl;
		}
		void compute()
		{
			total=marksEng+marksMaths+marksSci;
		}
		void showData()
		{
			cout<<"admission no.::"<<admno<<endl;
			cout<<"name::"<<name<<endl;
			cout<<"marks in English::"<<marksEng<<endl;
			cout<<"marks in Maths::"<<marksMaths<<endl;
			cout<<"marks in Science::"<<marksSci<<endl;
			cout<<"total marks::"<<total<<endl;
		}
		
};
int main()
{
	Student s1;
	s1.readData();
	s1.compute();
	s1.showData();
	return 0;
}


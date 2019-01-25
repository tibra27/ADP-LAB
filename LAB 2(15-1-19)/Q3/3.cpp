#include<bits/stdc++.h>
#include<string.h>
using namespace std;
class Student
{
	int rollno;
	char name[20];
	float marks[4];
	float grade;
	void compute()
	{
		float ans=0;
		for(int i=0;i<4;i++)
		{
			ans+=marks[i];
		}
		grade=ans/40;
	}
	public:
		Student()
		{
			
		}
		Student(const Student &s)
		{
			rollno=s.rollno;
			strcpy(name,s.name);
			for(int i=0;i<4;i++)
			{
				marks[i]=s.marks[i];
			}
			grade=s.grade;
		}
		void readData()
		{
			cout<<"enter rollno::";
			cin>>rollno;
			cout<<"enter name::";
			cin>>name;
			cout<<"enter marks in 4 subjects::";
			cin>>marks[0]>>marks[1]>>marks[2]>>marks[3];
			compute();
		}
		void displayData()
		{
			cout<<"rollno::"<<rollno<<endl;
			cout<<"name::"<<name<<endl;
			cout<<"grade::"<<grade<<endl;
		}
		void sortName(Student* s,int n)
		{	
			vector<Student> v;
			for(int i=0;i<n;i++)
			{
				v.push_back(s[i]);
			}
			for(int i=0;i<n-1;i++)
			{
				for(int j=0;j<n-i-1;j++)
				{
					if(strcmp(v[j].name,v[j+1].name)>0)
					{
						Student asd=v[j];
						v[j]=v[j+1];
						v[j+1]=asd;
					}
				}
			}
			for(int i=0;i<4;i++)
			{
				v[i].displayData();
				cout<<endl;
			}
		}
};
int main()
{
	Student s[4];
	for(int i=0;i<4;i++)
	{
		s[i].readData();
		s[i].displayData();
	}
	s[0].sortName(s,4);
	
	return 0;
}


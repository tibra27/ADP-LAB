#include<bits/stdc++.h>
using namespace std;
enum result
{
	correct,incorrect,unanswered
};
class report
{
	int cor,incor,unans;
	public:
		char correctans[8]={'C','A','B','D','B','C','C','A'};
		char solution[8];
		enum result res[8];
		report(vector<char> v)
		{
			cor=0;
			incor=0;
			unans=0;
			for(int i=0;i<8;i++)
			{
				solution[i]=v[i];
			}
			find();
		}
		void find()
		{
			for(int i=0;i<8;i++)
			{
				if(solution[i] == correctans[i])
				{
					res[i] = correct;
					cor++;
				}
				else
				{
					if(solution[i] == 'X')
					{
						res[i] =(enum result)unanswered;
						unans++;
					}
					else
					{
						res[i] =(enum result)incorrect;
						incor++;
					}
				}
			}
		}
		void print()
		{
			cout<<setw(15)<<"Question"<<setw(20)<<"Submitted Ans"<<setw(15)<<"Correct Ans"<<setw(10)<<"Result"<<endl;
			for(int i=1;i<=8;i++)
			{
				if(res[i-1]==0)
				{
					cout<<setw(11)<<i<<setw(17)<<solution[i-1]<<setw(15)<<correctans[i-1]<<setw(20)<<"correct"<<endl;
				}
				else if(res[i-1]==1)
				{
					cout<<setw(11)<<i<<setw(17)<<solution[i-1]<<setw(15)<<correctans[i-1]<<setw(20)<<"incorrect"<<endl;
				}
				else
				{
					cout<<setw(11)<<i<<setw(17)<<solution[i-1]<<setw(15)<<correctans[i-1]<<setw(20)<<"unanswered "<<endl;
				}
				
			}
			cout<<"Number of correct answers:"<<cor<<endl;
			cout<<"Number of incorrect answers:"<<incor<<endl;
			cout<<"Number of unanswered answers:"<<unans<<endl;
			if(cor>=5)
			{
				cout<<"The candidate is passed"<<endl;
			}
			else
			{
				cout<<"The candidate is failed"<<endl;
			}
		}
		
};
int main()
{
	vector<char> v;
	cout<<"enter your answers:\n";
	for(int i=0;i<8;i++)
	{
		char c;
		cin>>c;
		v.push_back(c);
	}
	report r(v);
	r.print();
	return 0;
}

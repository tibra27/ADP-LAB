#include<bits/stdc++.h>
using namespace std;
int main()
{
	cout<<"GAME IS STARTED!!!"<<endl;
	srand(time(0));
	int t_a=0,t_b=0;
	vector<int> a,b;
	while(1)
	{
		int a1,b1;
		cout<<"PLAYER_1 YOUR TURN:";
		cin>>a1;
		cout<<"PLAYER_2 YOUR TURN:";
		cin>>b1;
		int t1,t2;
		while(1)
		{
			t1=rand()%1001;
			if(find(a.begin(),a.end(),t1)!=a.end())
			{
				continue;	
			}
			break;
		}
		a.push_back(t1);
		while(1)
		{
			t2=rand()%1001;
			if(find(b.begin(),b.end(),t2)!=b.end())
			{
				continue;	
			}
			break;
		}
		b.push_back(t2);
		if(t1>t2)
		{
			t_a+=(t1-t2);
		}
		else
		{
			t_b+=(t2-t1);
		}
		cout<<"A's TOTAL SCORE IS:"<<t_a<<endl;
		cout<<"B's TOTAL SCORE IS:"<<t_b<<endl;
		if(t_a>t_b)
		{
			cout<<"WINNER IS:A"<<endl;
		}
		else
		{
			cout<<"WINNER IS:B"<<endl;
		}
		cout<<endl<<"DO YOU WANT TO PLAY MORE?     Y/N"<<	endl;
		char ch;
		cin>>ch;
		if(ch=='N')
		{
			break;
		}
	}
	return 0;
}

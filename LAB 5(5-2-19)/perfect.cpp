#include<bits/stdc++.h>
using namespace std;
int main()
{
	string s;
	cout<<"Enter the string:";
	cin>>s;
	int n=s.size();
	map<char,int> m;
	int f=0;
	for(int i=0;i<n;i++)
	{
		char x=(char)s[i];
		if(m.find(x)!=m.end())
		{
			cout<<"Not a perfect string!!!"<<endl;
			f=1;
			break;
		}
		else
		{
			m[x]=1;
		}
	}
	if(f==0)
	{
		cout<<"Perfect string!!!"<<endl;
	}
	return 0;
}

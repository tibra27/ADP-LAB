#include<bits/stdc++.h>
using namespace std;
bool check(string s,int n)
{
	int f=0;
	for(int i=0;i<n-2;i++)
	{
		for(int j=i+1;j<n-1;j++)
		{
			if(s[j]==s[i])
			{
				int x=i,y=j;
				while(x<=j-1)
				{
					if(s[x]!=s[y])
					{
						f=1;
						break;
					}
					x++;
					y++;
				}
				if(f==0)
				{
					return false;
				}
				else
				{
					f=0;
				}
			}
		}
	}
	return true;
}
int main()
{
	string s;
	cout<<"enter the password::";
	cin>>s;
	int n=s.length();
	int f=0;
	if(n>=5 && n<=12)
	{
		int c1=0,c2=0;
		for(int i=0;i<n;i++)
		{
			int asc=(int)s[i];
			if(asc>=97 && asc<=122)
			{
				c1++;
			}
			else if(asc>=48 && asc<=57)
			{
				c2++;
			}
			else
			{
				f=1;
				break;
			}
		}
		if((c1==0 || c2==0) && f!=1)
		{
			cout<<"invalid password..password must include atleast one lower case and one digit"<<endl;
		}
		else if(n==c1+c2)
		{
			if(check(s,n))
			{
				cout<<"valid password!!!"<<endl;
			}
			else
			{
				cout<<"invalid password..immediate pattern not allowed!"<<endl;
			}
		}
		else
		{
			cout<<"Uppercase and special symbol is not allowed!"<<endl;
		}
	}
	else
	{
		cout<<"Length of password must be in range 5-12!"<<endl;
	}
	
	return 0;
}

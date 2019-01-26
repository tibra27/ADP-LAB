#include<bits/stdc++.h>
using namespace std;
int expr_eval(string s)
{
	stack<int> sval;
	stack<char> sop;
	for(int i=0;i<s.length();i++)
	{
		if(s[i]=='(')
		{
			sop.push(s[i]);
		}
		else if(s[i]==' ')
		{
			continue;
		}
		else if(isdigit(s[i]))
		{
			int q=0;
			while(i<s.length() && isdigit(s[i]))
			{
				q=10*q+(s[i]-'0');
				i++;
			}
			i--;
			sval.push(q);
		}
		else if(s[i]=='(')
		{
			sop.push(s[i]);
		}
		else if(s[i]==')')
		{
			int v1,v2;
			char op;
			op=sop.top();
			sop.pop();
			sop.pop();
			v1=sval.top();
			sval.pop();
			v2=sval.top();
			sval.pop();
			if(op=='+')
			{
				int x=v1+v2;
				sval.push(x);
			}
			if(op=='-')
			{
				int x=v2-v1;
				sval.push(x);
			}
			if(op=='*')
			{
				int x=v1*v2;
				sval.push(x);
			}
			if(op=='/')
			{	
				int x=v2/v1;
				sval.push(x);
			}
			
		}
		else
		{
			sop.push(s[i]);
		}
	}
	return(sval.top());
}
int main()
{
	cout<<"enter the expression::";
	string s;
	cin>>s;
	int ans=expr_eval(s);
	cout<<s<<" = "<<ans<<endl;
	return 0;
}

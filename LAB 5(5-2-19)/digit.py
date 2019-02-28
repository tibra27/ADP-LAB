d=input("Enter the number:")
a={}
n=len(d)
for i in range(0,10):
	a[i]=0;
for i in range(0,n):
	x=int(d[i])
	a[x]+=1
f=max(a.values())
for i in range(0,10):
	if a[i]==f:
		print("Most frequent digit is:",i)
		break;

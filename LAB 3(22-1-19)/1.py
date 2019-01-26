x=input("enter the string\n")
n=len(x)
count={}
for i in range(65,91):
	count[i]=0
for i in range(97,123):
	count[i]=0
for i in range(0,n):
	if (ord(x[i]) in range(65,91)) or (ord(x[i]) in range(97,123)):
		count[ord(x[i])]+=1
mx=max(count.values())
for i in range(65,91):
	if count[i]==mx:
		print(chr(i),end=" ")
for i in range(97,123):
	if count[i]==mx:
		print(chr(i),end=" ")	
print("\n")

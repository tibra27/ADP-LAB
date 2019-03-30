import threading
import time

x=0
y=0
s1=0
s2=0
def A(lock):
    lock.acquire()
    global x,s1
    print("thread name:",threading.current_thread().name,end="  ")
    x=int(input("Enter first number:"))

    for i in range (1,x):
        if(x%i ==0):
            s1+=i
    lock.release()



def B(lock):
    lock.acquire()
    global y,s2
    print("thread name:",threading.current_thread().name,end="  ")
    y=int(input("Enter second number:"))
    for i in range (1,y):
        if(y%i ==0):
            s2+=i
    lock.release()




lock=threading.Lock()

csa=threading.Thread(target=A, args=(lock,),name="CSA")

csb=threading.Thread(target=B, args=(lock,),name="CSB")

csa.start()
# time.sleep(2)
csb.start()

csa.join()
csb.join()
if(x==s2 and y==s1):
    print("numbers are amicable")
else:
    print("numbers are not amicable")

//g++ -std=c++11 account.cpp -lpthread
#include<bits/stdc++.h>
#include<pthread.h>
#include<mutex>
#include<stdlib.h>
#include<unistd.h>

using namespace std;
int balance=600;
mutex mut;
void * deposit(void * a)
{
    while(1)
    {
        mut.lock();
        while(balance<=2000)
        {
            int amount=rand()%200+1;
            balance+=amount;
            cout<<"Amount deposited::"<<amount<<endl;
            cout<<"Current balance="<<balance<<endl;
            sleep(1);
        }
        mut.unlock();
    }
}
void * withdraw(void *a)
{
    while(1)
    {
        mut.lock();
        while(balance>=500)
        {
            int amount=rand()%150+1;
            balance-=amount;
            cout<<"Amount withdrawal::"<<amount<<endl;
            cout<<"Current balance="<<balance<<endl;
            sleep(1);
        }
        mut.unlock();
    }
}
int main()
{
    pthread_t father,son;
    pthread_create(&father,NULL,&deposit,NULL);
    pthread_create(&son,NULL,&withdraw,NULL);
    pthread_join(father,NULL);
    pthread_join(son,NULL);
    return 0;
}


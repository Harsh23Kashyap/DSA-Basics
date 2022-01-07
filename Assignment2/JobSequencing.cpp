#include<iostream>
#include<cstring>
using namespace std;

void sortDescending(string J[], int d[], int p[], int n )
{
    int i, j;  
    for (i = 0; i < n-1; i++)      
      
    for (j = 0; j < n-i-1; j++)  
    {
        if (p[j] < p[j+1])  //sort according to profit
        {
            int temp= p[j];
            p[j]=p[j+1];
            p[j+1]=temp;
            string buff=J[j];
            J[j]=J[j+1];
            J[j+1]=buff;
            temp=d[j];
            d[j]=d[j+1];
            d[j+1]=temp;
        }
             
    }  
}
int main()
{
    int n=5;
    string Jobs[]={ "J1", "J2", "J3" , "J4", "J5"};
    int deadline[]={4,2,3,2,1};
    int profit[]={80,25,5,65,30};
    sortDescending(Jobs,deadline, profit,n);

    int i,j;
    string JobSequence[n];
    
    bool slot[n];
    for (i=0;i<n;i++)
        slot[i]=false;


    int prof=0;
    
    for (i=0;i<n;i++)
    {
        for(j=deadline[i];j>0;j--)
        {
            if(slot[j]==false)
            {
                
                JobSequence[j]=Jobs[i];
                slot[j]=true;
                prof=prof+profit[j];
                break;
            }
        }
    }
    cout<<"Profit "<<prof<<endl;
    for (i=0;i<n;i++)
    {
        if(JobSequence[i].size()!=0)
        {
            cout<<JobSequence[i]+", ";
        }
    }
    cout<<endl;
    return 0;
}
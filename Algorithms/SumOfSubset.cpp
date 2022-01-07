#include <iostream>
#include <cstdlib>
#include <cmath>
using namespace std;
bool check=true;
bool promising(int *S, int i, int total, int weight, int W)
{
    if(weight+total>=W && (weight==W || weight+S[i+1]<=W))
        return true;
    return false;
}
void pass(int *S,int *x, int n)
{
    for (int i = 0; i < n; i++) 
    {
        if(x[i]==1)
        {
            cout<<S[i]<<",  ";
            x[i]=0;
        }
    }
    cout<<endl;
}
void sumSubset(int *S,int i, int weight, int total,int W, int *include, int n)
{
    include[0]=check?1:0;
    if(promising(S,i,total,weight,W))
    {
        if(weight==W)
        {
            include[i+1]=0;
            pass(S,include,n);
            
        }
        else
        {
            //including
            include[i+1]=1;
            sumSubset(S,i+1,weight+S[i+1],total-S[i+1],W,include,n);

            //excluding
            include[i+1]=0;
            sumSubset(S,i+1,weight,total-S[i+1],W,include,n);
        }
    }
}
int main()
{
    int S[]= {5,10,12,13,15,18};
    int n=sizeof(S)/sizeof(int);
    int include[n];
    int W=30;
    int total = 73;
    int weight=0;
    cout<<"\n\tSOLUTION SET "<<endl;
    sumSubset(S,0,weight+S[0],total,W, include,n);
    check=false;
    sumSubset(S,0,weight,total-S[0],W, include,n);
    
    return 0;
}
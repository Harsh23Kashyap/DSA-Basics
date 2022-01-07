#include <iostream>
#include <cstdlib>
#include <cmath>
using namespace std;
bool Place(int k, int i, int *x)
{
    for (int j=0;j<k;j++)
    {
        if(x[j]==i || (abs(j-k)==abs(x[j]-i)))
            return false;
    }
    return true;
}
void print(int *x,int n)
{
    cout<<"\n\tSOLUTION"<<endl;
    int count=0;
    for (int i = 0; i < n; i++) 
    {
        bool newline=true;
		for (int j = 0; j < n; j++)
        {
            if(x[count]==j && newline)
            {
                newline=false;
                cout<<"Q"<<((count++)+1)<<"    ";
            }
            else
                cout<<"--"<<"    ";
        }
		cout<<endl;
	}
}
void NQueen(int k, int n, int *x)
{
    for (int i=0;i<n;i++)
    {
        if (Place(k,i,x))
        {
            x[k]=i;
            if(k+1==n)
                print(x,n);
            else
                NQueen(k+1,n, x);
        }
    }
}
int main()
{
    cout<<"Size of NQueen problem : ";
    int n;
    cin>>n;
    cout<<"The Nqueen solution to "<<n<<"size matrix is "<<endl;
    int k=0;
    int x[n];
    NQueen(k,n, x) ;
    return 0;
}
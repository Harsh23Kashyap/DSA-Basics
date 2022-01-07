#include <iostream>
#include <cmath>
using namespace std;
#define n 4
void Print(int s[n][n+1],int i,int j)
{
    if(i==j)
        cout<<" A"<<(i)<<". ";
    else
    {
        cout<<"(";
        Print(s,i,s[i][j]);
        Print(s,s[i][j]+1,j);
        cout<<")";
    }
}
void MatrixChainOrder(int *p, int m[n][n], int s[n-1][n-1])
{
    for (int l=1; l<n;l++)
    {
        for (int i=0;i< n-l;i++)
        {
            int j=i+l;
            for (int k=i;k<j; k++)
            {
                int q=m[i][k]+m[k+1][j]+p[i]*p[k+1]*p[j+1];
                if (q<m[i][j])
                {
                    m[i][j]=q;
                    s[i][j-1]=k+1;
                }
            }
        }
    }
    int copy[n][n+1];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n+1;j++)
        {
            if(i==0 || j==0 || j==1)
                copy[i][j]=-1;
            else
                copy[i][j]=s[i-1][j-2];
        }
    }
    Print(copy,1,n);
}

// Driver code
int main()
{
    int A[]= {1,2,3,4};
    int size[4][2]={{40,20},{20,30},{30,10},{10,30}};
    int p[n+1];
    p[0]=size[0][0];
    for (int i=1;i<n+1;i++)
        p[i]=size[i-1][1];
    int m[n][n];
    int s[n-1][n-1];
    for(int i=0;i< n; i++)
    {
        for (int j=0;j<n; j++)
        {
            if(i==j)
                m[i][i]=0;
            else if(i>j)
                m[i][j]=-1;
            else 
                m[i][j]=INT_MAX;
        }
    }
    for(int i=0;i< n-1; i++)
    {
        for (int j=0;j<n-1; j++)
        {
            if(i>j)
                s[i][j]=-1;
        }
    }
    cout<<"The solution pattern is : ";
    MatrixChainOrder(p,m,s);
    cout<<endl;
    return 0;
}
 
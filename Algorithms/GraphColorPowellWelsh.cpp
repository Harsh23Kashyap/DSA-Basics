#include <iostream>
#include <cmath>
using namespace std;
#define v 4
void print(int *color)
{
    cout<<"m-color colourable"<<endl;
    cout<<"Vertex\t        Color"<<endl;
    int mx=-1;
    for(int i=0;i<v;i++)
    {
        cout<<i<<"\t     C"<<(color[i])<<endl;
        mx=max(mx,color[i]);
    }
    cout<<"Uses only "<<(mx)<<" color."<<endl;
}
void Powell(int G[v][v],int degree[2][v])
{
    int c=1;
    int color[v];
    for(int i=0;i<v;i++)
        color[i]=-1;
    color[degree[0][0]]=1;
    for(int ind=1;ind<v; ind++)
    {
        c=1;
        int cv=degree[0][ind];
        for(int k=0;k<ind;k++)
        {
            int prev=degree[0][k];
            if(G[cv][prev]==0)
            {
                color[cv]=c;
                continue;
            }
            else
            {
                c++;
            }
        }
        color[cv]=c;
    }
    print(color);
}
void sort(int arr[2][v])
{
    int i, j;
    for (i = 0; i < v-1; i++)    
    {
        for (j = 0; j < v-i-1; j++)
        {
            if (arr[1][j] < arr[1][j+1])
                {
                    int temp=arr[1][j];
                    arr[1][j]=arr[1][j+1];
                    arr[1][j+1]=temp;
                    temp=arr[0][j];
                    arr[0][j]=arr[0][j+1];
                    arr[0][j+1]=temp;
                }
        }
    }
                
}
int main()
{
    int graph[v][v];
    int color[v];
    for(int i=0;i<v;i++)
    {
        color[i]=-1;
        for(int j=0;j<v;j++)
            graph[i][j]=0;
    }
    
    /*
    for(int i=0;i<e;i++)
    {
        cout<<"  "<<i+1<<"\t";
        int v1,v2;
        cin>>v1>>v2;
        graph[v1][v2]=1;
        graph[v2][v1]=1;
    }
    */
    graph[0][1]=1;
    graph[0][2]=1;
    graph[1][2]=1;
    graph[2][3]=1;
    graph[1][0]=1;
    graph[2][0]=1;
    graph[2][1]=1;
    graph[3][2]=1;
    int degree[2][v];
    for(int i=0;i<v; i++)
    {
        degree[0][i]=i;
        degree[1][i]=0;
        for (int j=0;j<v;j++)
        {
            if(graph[i][j]!=0)
                degree[1][i]++;
        }
    }
    sort(degree);
    cout<<"Vertex\tDegree"<<endl ;
    for(int i=0;i<v;i++)
        cout<<"V"<<degree[0][i]<<"    "<<degree[1][i]<<endl;
    cout<<"\nAdjacency Matrix\n";
    for(int i=0;i<v; i++)
    {
        for (int j=0;j<v;j++)
        {
            cout<<graph[i][j]<<"  ";
        }
        cout<<"\n";
    }
    cout<<"\n";
    Powell(graph,degree);
    return 0;
}

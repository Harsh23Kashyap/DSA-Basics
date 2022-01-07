#include <iostream>
#include <cmath>
using namespace std;
#define v 4
#define maximum 3
bool check=false;
bool allowed(int G[v][v],int vertex,int *color)
{
    for (int i=0;i<v; i++)
    {
        if(G[vertex][i]!=0)
        {
            if(color[i]==color[vertex])
                return false;
        }
    }
    return true;
}
void print(int *color)
{
    check=true;
    cout<<"m-color colourable"<<endl;
    cout<<"Vertex\t        Color"<<endl;
    int mx=-1;
    for(int i=0;i<v;i++)
    {
        cout<<i<<"\t     C"<<(color[i]+1)<<endl;
        mx=max(mx,color[i]);
    }
    cout<<"Uses only "<<(mx+1)<<" color."<<endl;
}
void mColor(int G[v][v],int vertex,int *color)
{
    if(vertex==v)
        print(color);
    if(vertex==0)
    {
        color[vertex]=0;
        mColor(G,vertex+1,color);
    }
    for(int i=0;i<maximum;i++)
    {
        color[vertex]=i;
        if(allowed(G,vertex,color))
            mColor(G,vertex+1,color);
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
    cout<<"Adjacency Matrix\n";
    for(int i=0;i<v; i++)
    {
        for (int j=0;j<v;j++)
        {
            cout<<graph[i][j]<<"  ";
        }
        cout<<"\n";
    }
    cout<<"\n";
    mColor(graph,0,color);
    if(!check)
        cout<<"Not possible to color using "<<maximum<<" colors"<<endl;
    return 0;
}

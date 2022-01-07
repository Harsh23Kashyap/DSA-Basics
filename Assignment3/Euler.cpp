#include<iostream>
#include<cstring>
using namespace std;
//int graph[40][40];
void isEuler( int graph[40][40],int size)
{
    int deg=0,odddegree=0;
    for(int i=0;i<size; i++)
    {
        for (int j=0;j<size;j++)
        {
            if(graph[i][j]==1)
                deg++;
        }
        if(deg==0)
        {
            cout<<"Not a Connected Graph/ Not Eulerian"<<endl;
        }
        if(deg%2!=0)
        {
            cout<<i<<endl;
            odddegree++;
        }
    }
    if(odddegree==2)
        cout<<"Euler path\n";
    else if(odddegree==0)
        cout<<"Euler circuit\n";
    return;

}
int main()
{
    cout<< " Enter no. of vertices : ";
    int v;
    cin>>v;
    cout<< " Enter no. of edges : ";
    int e;
    cin>>e;
    cout<< " Edge   Node1   Node2 \n ";
    int graph[40][40];
    for(int i=0;i<v+1;i++)
    {
        for(int j=0;j<v+1;j++)
            graph[i][j]=0;
    }
    for(int i=0;i<e;i++)
    {
        cout<<"  "<<i+1<<"\t";
        int v1,v2;
        cin>>v1>>v2;
        graph[v1][v2]=1;
        graph[v2][v1]=1;
    }
    for(int i=0;i<v+1; i++)
    {
        for (int j=0;j<v+1;j++)
        {
            cout<<graph[i][j]<<"  ";
        }
        cout<<"\n";
    }
    isEuler(graph,v);
    return 0;
}




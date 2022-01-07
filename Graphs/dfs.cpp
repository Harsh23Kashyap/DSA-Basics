// A simple representation of graph using STL,
// for the purpose of competitive programming
#include<iostream>
#include <vector>
using namespace std;
 
// A utility function to add an edge in an
// directed graph.
void addEdge(vector<int> adj[], int u, int v)
{
    adj[u].push_back(v);
}
// fn to count no. of incoming edges
int* incomingEdge(vector<int> adj[], int V)
{
    int *incoming= new int[V];
    for(int i=0;i<V;i++)
        incoming[i]=0;
    for (int i=0;i<V;i++)
    {
        for (int j=0; j<adj[i].size(); j++)
            incoming[adj[i][j]]++;
    }
    return incoming;
}
 
// fn to display
void displayAdjacencyList(vector<int> adj[], int V)
{
    cout<<"ADJACENCY LIST"<<endl;
    int *incoming= new int[V];
    for (int i=0;i<V;i++)
    {
        cout<<"| "<< i<<" | ";
        for (int j=0; j<adj[i].size(); j++)
        {
            cout<<" --> "<<adj[i][j];
        }
        cout<<endl;
    }
    return ;
}
void DFS(vector<int> adj,int start,bool visited[],int dis[], int fin[], int count)
{
    visited[start]=true;
    count++;
    dis[start]=count;
    for(int i=0;i< adj[start].size();i++) 
    {
        int curr=adj[start][i];
        if(!visited[curr])
            DFS(adj,curr,visited,dis,fin,count);
    }
    count++;
    fin[start]=count;
}
void preDfs(vector<int> adj,int V,int start)
{
    bool *visited=new bool[V];
    int *discovery=new int[V];
    int *finish=new int[V];
    int count=0;
    for(int i=0;i<V;i++)
        visited[i]=false;
    for (int i=0; i<V;i++) 
    {
        if(visited[i]==false)
            DFS(adj,start,visited,discovery,finish, count);
    }
}


// Driver code
int main()
{
    int V = 6;
    vector<int> adj[V];
    addEdge(adj, 1, 2);
    addEdge(adj, 2, 3);
    addEdge(adj, 3, 4);
    addEdge(adj, 3, 5);
    addEdge(adj, 1, 4);
    addEdge(adj, 4, 5);
    int* incoming=incomingEdge(adj, V);
    displayAdjacencyList(adj,V);
    cout<<"Kahn Algo\n";
    return 0;
}
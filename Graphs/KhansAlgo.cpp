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
void KahnAlgo(vector<int> adj[], int incoming[],int V)
{
    vector<int> S;
    vector<int> L;
    for(int i=0;i< V;i++)
    {
        if(incoming[i]==0)
            S.push_back(i);
    }
    while(S.size()!=0)
    {
        int curr= S.front();
        S.erase(S.begin());
        L.push_back(curr);
        for(int j=0;j<adj[curr].size();j++)
        {
            int temp=adj[curr][j];
            if(--incoming[temp] ==0)
                S.push_back(curr);
            adj[curr].erase(S.begin()+j);
        }
    }
    for(int i=0;i< V;i++)
    {
        if(incoming[i]!=0)
            cout<<"Graph has atleast one cycle"<<endl;
            return ;
    }
    cout<<"Topologically sorted order\n";
    for (auto& it : L) 
    {
        cout << it << " -> ";
    }
    return ;
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
    for(int i=0;i< adj[1].size();i++) 
    {
        cout << adj[1][i] << " -> ";
    }
    ///KahnAlgo(adj, incoming, V);
    return 0;
}
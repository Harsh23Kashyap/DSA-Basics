int main()
{
    /*cout<< " Enter no. of vertices : ";
    int v;
    cin>>v;
    cout<< " Enter no. of edges : ";
    int e;
    cin>>e;
    cout<< " Edge   Node1   Node2 \n ";
    */
    int graph[v][v];
    int parent[v];
    bool visited[v];
    for(int i=0;i<v;i++)
    {
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
   int source=0;
   int sink=5;
    graph[0][1]=16;
    graph[0][2]=13;
    graph[1][2]=10;
    graph[2][1]=4;
    graph[1][3]=12;
    graph[3][2]=9;
    graph[2][4]=14;
    graph[4][3]=7;
    graph[3][5]=20;
    graph[4][5]=4;
    
    for(int i=0;i<v; i++)
    {
        for (int j=0;j<v;j++)
        {
            cout<<graph[i][j]<<"  ";
        }
        cout<<"\n";
    }
    cout<<"\nFORD FULKERSON"<<endl;
    FordF(graph,parent, visited,source, sink);
    return 0;
}

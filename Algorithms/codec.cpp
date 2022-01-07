#include<iostream>
using namespace std ;
class graph {
public: 
    map<int, vector<int>> connections;
    void addEdge(int a, int b) {
        connections[a].push_back(b);
    }
    
};
bool BFS_APPLY(graph g, int src, int dest, int v, int pred[])
{
    queue<int> queue1;   
    bool visited[v+1];  
    for (int i = 0; i < v; i++) {
        visited[i] = false;
        // dist[i] = INT_MAX;
        pred[i] = -1;
    }
    visited[src] = true;
    // dist[src] = 0;
    queue1.push(src);
    while (!queue1.empty()) {
        int u = queue1.front();
        queue1.pop();
        for (int child : g.connections[u]) {
            if (visited[child] == false) {
                visited[child] = true;
                // dist[child] = dist[u] + 1;
                pred[child] = u;
                
                queue1.push(child);        
                if (child == dest)
                    return true;
            }
        }
    }
    return false ;
}
void printShortestDistance(graph g,int s,int dest, int v)
{
    int pred[v+1];
    if (BFS_APPLY(g, s, dest, v, pred) == false) {
        return;
    }
    vector<int> path;
    int crawl = dest;
    path.push_back(crawl);
    while (pred[crawl] != -1) {
        path.push_back(pred[crawl]);
        crawl = pred[crawl];
    }
    for (int i = path.size() - 1; i >= 0; i--)
        cout << path[i] << " ";
    cout<<endl;
}
void print(graph g,int n,int m,int start)
{
    printShortestDistance(g,start,1,n*m+1);
    printShortestDistance(g,start,m,n*m+1);
    printShortestDistance(g,start,((n-1)*m)+1,n*m+1);
    printShortestDistance(g,start,n*m,n*m+1);
}
int main() {
    int n, m,start;
    cin>>n>>m>>start;
    graph g;
    int x;
    int V,N,E,S,W,ne,es,wn,sw;
    int size = n*m + 1;
    int *mat = new int[size];
    for(int i=0;i<size;i++){
        mat[i]=new int[size];
    }
     for(int i=1;i<=m*n;i++) {
        for(int j=1;j<=m*n;j++){
            mat[i][j]=0;
        }
    }
    for(int i=0;i<n*m;i++) {
        cin >> V >> N >> ne>>E>>es >> S >> sw >> W>>wn;
       
        if(E == 1) {
            g.addEdge(V,V+1);
            mat[V][V+1]=1;
        }
         if(W==1) {
            g.addEdge(V,V-1);
            mat[V][V-1]=1;
        }
         if(N==1) {
            g.addEdge(V,V-m);
            mat[V][V-m]=1;
        }
        if(wn==1) {
            g.addEdge(V,V-m-1);
            mat[V][V-m-1]=1;
        }
             if(S==1) {
            g.addEdge(V,V+m);
            mat[V][V+m]=1;
        }
        if(ne==1)
        {
            g.addEdge(V,V-m+1);
            mat[V][V-m+1]=1;
        }
        if(es==1) {
            g.addEdge(V,V+m+1);
            mat[V][V+m+1]=1;
        }
   
        if(sw==1) {
            g.addEdge(V,V+m-1);
            mat[V][V+m-1]=1;
        }
       

    }
    // g.print();
    print(g,n,m,start);

return 0;
}
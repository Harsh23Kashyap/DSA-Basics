import java.io.*;
import java.util.*;
class Graph
{
    public static int V; // No. of vertices
    public static LinkedList<Integer> adj[]; //Adjacency Lists

    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    void print()
    {
        for (int i=0;i<V;i++)
        {
            System.out.println("Vertex "+i);
            for (int j=0;j<adj[i].size();j++)
            {
                System.out.println("-> "+ adj[i].get(j));
            }
        }
    }
    public static void DFS(int source)
    {
        int visited[]= new int[V];
        for(int i=0;i<visited.length;i++)
            visited[i]=0;
        int discover[]=new int[V];
        int full[]=new int [V];
        int distance[]=new int [V];
        distance[source]=0;
        int predecessor[]=new int [V];
        predecessor[source]=-1;
        System.out.println("\n\t DEPTH FIRST SEARCH ");
        DFSearch(source,visited, discover, full, distance, predecessor);
        System.out.println("Displaying other details ");
        System.out.println("Distance ");
        for (int i=0; i<V;i++)
        {
            System.out.println("Distance of vertex "+i+" from "+source+" is "+distance[i]);
        }
        System.out.println("Predecessor ");
        for (int i=0; i<V;i++)
        {
            System.out.println("Predecessor of vertex "+i+" is "+predecessor[i]);
        }
        for (int i=0; i<V;i++)
        {
            System.out.println("Discovery time of vertex "+i+" is "+discover[i]);
        }
        for (int i=0; i<V;i++)
        {
            System.out.println("Final time of vertex "+i+" is "+full[i]);
        }
    }
    static int time=0;
    public static void DFSearch(int s, int v[], int d[], int f[], int dis[], int pre[])
    {
        System.out.print(s+" -> ");
        v[s]=1;
        time++;
        d[s]=time;
        for (int i=0;i<adj[s].size();i++)
        {
            int curr=adj[s].get(i);
            if(v[curr]==1)
                continue;
            else
            {
                dis[curr]=dis[s]+1;
                pre[curr]=s;
                DFSearch(curr,v,d,f,dis,pre);
            }
        } 
        time++;  
        f[s]=time;
    }
    public static void BFSearch(int s)
    {
        int d[]=new int[V]; //distnace
        int p[]= new int[V];  //predecessor
        int v[]= new int[V];    //visisted
        for(int i=0;i<v.length;i++)
            v[i]=0;
        d[s]=0;
        p[s]= -1;
        Queue <Integer>q = new LinkedList<>();
        q.add(s);
        v[s]=1;
        while(!q.isEmpty())
        {
            int x=q.peek();
            q.remove();
            System.out.print(x+ " -> ");
            for(int i=0; i< adj[x].size();i++)
            {
                int curr=adj[x].get(i);
                if(v[curr]==1)
                    continue;
                else
                {
                    q.add(curr);
                    d[curr]=d[x]+1;
                    p[curr]=x;
                    v[curr]=1;
                }
            }
        }
        System.out.println("Displaying other details ");
        System.out.println("Distance ");
        for (int i=0; i<V;i++)
        {
            System.out.println("Distance of vertex "+i+" from "+s+" is "+d[i]);
        }
        System.out.println("Predecessor ");
        for (int i=0; i<V;i++)
        {
            System.out.println("Predecessor of vertex "+i+" is "+p[i]);
        }
    }
    //vertex degree
    public static void operations() 
    {
        System.out.println("\n OTHER VALUES");
        System.out.println("No. of vertex : "+V);
        int edge=0;
        for (int i=0;i<V; i++)
        {
            System.out.println("Degree of vertex "+i+" is : "+adj[i].size());
            edge+=adj[i].size();
        }
        edge/=2;
        System.out.println("Total edges : "+edge);
    }
    // Driver method to
    public static void main(String args[])
    {
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(4, 3);
        g.addEdge(3, 1);
        g.addEdge(3, 4);
        g.addEdge(3, 2);
        g.addEdge(2, 1);
        g.addEdge(2, 3);

        System.out.println("Displaying graph");
        g.print();
        System.out.println("\n\t BREADTH FIRST SEARCH ");
        g.BFSearch(0);
        g.DFS(0);
        g.operations();
    }
}
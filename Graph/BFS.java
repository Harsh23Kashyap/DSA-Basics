import java.io.*;
import java.util.*;
public class BFS extends Graph
{

    public static void main(String[] args) 
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
        System.out.println("Breadth First Search");
        g.BFSearch(0);
    }

}

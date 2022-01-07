import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Main
{
    public static ArrayList<ArrayList<Integer> > graph;
    public static int v;
	public static void main(String args[])
	{
		Scanner scr= new Scanner(System.in);
        int row=0, col=0, s=0;
		try{
            row=scr.nextInt();
            col=scr.nextInt();
            s=scr.nextInt();
        }catch (Exception e){};
		v = row*col;
        int input[][]=new int[v+1][9];
        try{
            for(int i=1;i<v+1;i++)
            {
                for(int j=0;j<9;j++)
                {
                    input[i][j]=scr.nextInt();
                }
            }
        }catch (Exception e){};
        createGraph( input, row , col);
        //printPath();
        int leftupcorner= 1;
        int rightupconer=col;
        int leftdowncorner=(row-1)*col+1;
        int rightdowncorner = row*col;
        printShortestDistance( s, leftupcorner, v+1);
        printShortestDistance( s, rightupconer, v+1);
        printShortestDistance( s, leftdowncorner, v+1);
		printShortestDistance( s, rightdowncorner, v+1);
		scr.close();
	}

    static void createGraph( int input[][], int row, int col)
    {
        graph= new ArrayList<ArrayList<Integer> >(v+1);
		for (int i = 0; i <=v; i++) 
        {
			graph.add(new ArrayList<Integer>());
		}
        for(int i=1;i<=v;i++)
        {
            //for(int j=0;j<9;j++)
            //    System.out.print(input[i][j]+" ");
            //System.out.println("Vertex "+i+" done.");
            if(input[i][1]==1 )
                addEdge( i , i-col);
            if(input[i][2]==1 )
                addEdge( i , i-col+1);
            if(input[i][3]==1 )
                addEdge( i , i+1);  
            if(input[i][4]==1 )
                addEdge( i , i+col+1);
            if(input[i][5]==1)
                addEdge( i , i+col);
            if(input[i][6]==1)
                addEdge( i , i+col-1);
            if(input[i][7]==1 )
                addEdge( i , i-1);
            if(input[i][8]==1)
                addEdge( i , i-col-1);
        }
    }

	static void addEdge(int i, int j)
	{
		graph.get(i).add(j);
	}

	static void printShortestDistance( int s, int dest, int v)
	{
		int pred[] = new int[v];
        if (BFS( s, dest, v, pred) == false) 
            return;
		int successor = dest;
        LinkedList<Integer> path = new LinkedList<Integer>();
		path.add(successor);
        //finding printing parent
		while (pred[successor] != -1) 
        {
			path.add(pred[successor]);
			successor = pred[successor];
		}
        ///SHortest path
		for (int i = path.size() - 1; i >= 0; i--) 
        {
			System.out.print(path.get(i) + " ");
		}
        System.out.println();
	}
    /*
    static void printPath()
    {
        System.out.println("Path is :-");
        for (int i = 1; i < graph.size(); i++) {
            System.out.println("\ngraphacency list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(" -> "+graph.get(i).get(j));
            }
            System.out.println();
        }
    }*/

    public static boolean BFS(int src,int dest, int v, int pred[])
	{
		LinkedList<Integer> Q = new LinkedList<Integer>();
		boolean visited[] = new boolean[v];
		for (int i = 0; i < v; i++) 
        {
			visited[i] = false;
			pred[i] = -1;
		}
		visited[src] = true;
		Q.add(src);

		while (!Q.isEmpty()) 
        {
			int initial = Q.remove();
			for (int i = 0; i < graph.get(initial).size(); i++) 
            {
				if (!(visited[graph.get(initial).get(i)]))
                {
					visited[graph.get(initial).get(i)] = true;
                    //pred ko badhao
					pred[graph.get(initial).get(i)] = initial;
                    // add kro 
					Q.add(graph.get(initial).get(i));
					if (graph.get(initial).get(i) == dest)
						return true;
				}
			}
		}
		return false;
	}
}

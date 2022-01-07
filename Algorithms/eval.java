import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
class MergeSort
{
	void merge(int arr[][], int l, int xm, int r, int u, int ym , int d)
	{
		int leftlen = xm - l + 1;
		int rightlen = r - xm;
        int uplen = ym -  u +1;
        int downlen = d - ym;

		int LU[][] = new int[uplen][leftlen];
		int RU[][] = new int[uplen][rightlen];
        int LD[][] = new int[downlen][leftlen];
        int RD[][] = new int[downlen][rightlen];

		for (int i = 0; i < uplen; ++i)
        {
            for(int j=0;j< leftlen; j++)
            {
			    LU[i][j] = arr[u + i][l + j];
            }
        }
        

        for (int i = 0; i < uplen; ++i)
        {
            for(int j=0;j< rightlen; j++)
            {
			    RU[i][j] = arr[u + i][xm + 1 + j];
            }
        }

        for (int i = 0; i < downlen; ++i)
        {
            for(int j=0;j< leftlen; j++)
            {
			    LD[i][j] = arr[ym + 1 + i][l + j];
            }
        }
        
        for (int i = 0; i < downlen; ++i)
        {
            for(int j=0;j< rightlen; j++)
            {
			    RD[i][j] = arr[ym + 1 + i][xm + 1 + j];
            }
        }
        if(LU[0].length==1)
            sortSingle(LU, 0, 0);
        else if (LU.length==1)
            sortSingle(LU, 1, 0);
        if(RU[0].length==1)
            sortSingle(RU, 0, 0);
        else if (RU.length==1)
            sortSingle(RU, 1, 0);
        if(LD[0].length==1)
            sortSingle(LD, 0, 0);
        else if (LD.length==1)
            sortSingle(LD, 1, 0);
        if(RD[0].length==1)
            sortSingle(RD, 0, 0);
        else if (RD.length==1)
            sortSingle(RD, 1, 0);
		int yi = 0, yj = 0, xi = 0, xj = 0 ;
        int ii=u,jj=l;
        
        System.out.println("Working");
        System.out.println("LU");
        printArray(LU);
        System.out.println("LD");
        printArray(LD);
        System.out.println("RU");
        printArray(RU);
        System.out.println("RD");
        printArray(RD);
        //COMPARING ROWS 
        //UP
        
        boolean check =false;
        for(int z=0; z<uplen; z++)
        {
            
            System.out.println("UP arr[ii][jj]=["+ii+"]["+jj+"]");
            System.out.println("COMPARING  LU["+z+"]["+xi+"] with RU["+z+"]["+xj+"]");
            check=false;
            while(xi<leftlen  && xj<rightlen)
            {
                if(LU[z][xi]<= RU[z][xj])
                {
                    check=true;
                    arr[ii][jj]=LU[z][xi];
                    xi++;
                }
                else
                {
                    check=true;
                    arr[ii][jj]=RU[z][xj];
                    xj++;
                }
                System.out.println("arr[ii][jj]=["+ii+"]["+jj+"]="+arr[ii][jj]);
                jj++;
            }
            while(xi<leftlen)
            {
                check=true;
                arr[ii][jj]=LU[z][xi]; 
                System.out.println("arr[ii][jj]=["+ii+"]["+jj+"]="+arr[ii][jj]);
                xi++;
                jj++;
            }
            while(xj<rightlen)
            {
                check=true;
                arr[ii][jj]=RU[z][xj];
                System.out.println("arr[ii][jj]=["+ii+"]["+jj+"]="+arr[ii][jj]);
                xj++;
                jj++;
            }
                ii++;
                xi=0;
                xj=0;
            
            jj=l;
            System.out.println("UP "+check);
        }
        
        for (int i = 0; i < uplen; ++i)
        {
            for(int j=0;j< leftlen; j++)
            {
			    LU[i][j] = arr[u + i][l + j];
            }
        }
        System.out.println("\nLEFT UP ");
        printArray(LU);
        for (int i = 0; i < uplen; ++i)
        {
            for(int j=0;j< rightlen; j++)
            {
			    RU[i][j] = arr[u + i][xm + 1 + j];
            }
        }
        System.out.println("\nRIGHT UP ");
        printArray(RU);
        ii=ym+1;
        xi=0;
        xj=0;
        check=false;
        //DOWN
         for(int z=0; z<downlen; z++)
         {
                System.out.println("DOWN arr[ii][jj]=["+ii+"]["+jj+"]");
                System.out.println("COMPARING  LD["+z+"]["+xi+"] with RD["+z+"]["+xj+"]");
             check=false;

             while(xi<leftlen  && xj<rightlen)
             {
                 if(LD[z][xi]<= RD[z][xj])
                 {
                     check=true;
                     arr[ii][jj]=LD[z][xi];
                     xi++;
                 }
                 else
                 {
                     check=true;
                     arr[ii][jj]=RD[z][xj];
                     xj++;
                 }
                 System.out.println("arr[ii][jj]=["+ii+"]["+jj+"]="+arr[ii][jj]); 
                 jj++;
             }
            while(xi<leftlen)
            {
                check=true;
                arr[ii][jj]=LD[z][xi];
                System.out.println("arr[ii][jj]=["+ii+"]["+jj+"]="+arr[ii][jj]); 

                xi++;
                jj++;
            }
            while(xj<rightlen)
            {
                check=true;
                arr[ii][jj]=RD[z][xj];
                System.out.println("arr[ii][jj]=["+ii+"]["+jj+"]="+arr[ii][jj]); 

                xj++;
                jj++;
            }
            ii++;
                xi=0;
                xj=0;
            
            jj=l;
         }
         for (int i = 0; i < downlen; ++i)
        {
            for(int j=0;j< leftlen; j++)
            {
			    LD[i][j] = arr[ym + 1 + i][l + j];
            }
        }
        System.out.println("\nLEFT DOWN ");
        printArray(LD);
        for (int i = 0; i < downlen; ++i)
        {
            for(int j=0;j< rightlen; j++)
            {
			    RD[i][j] = arr[ym + 1 + i][xm + 1 + j];
            }
        }
        System.out.println("\nRIGHT DOWN");
        printArray(RD);
        ii=u;
        jj=l;
        check=false;
        //Comparing columns
        //LEFT
        for(int z=0; z<leftlen; z++)
        {
            check=false;
            System.out.println("LEFT arr[ii][jj]=["+ii+"]["+jj+"]");
            System.out.println("COMPARING  LU["+yi+"]["+z+"] with LD["+yj+"]["+z+"]");
            while(yi<uplen  && yj<downlen)
            {
                System.out.println("uplen "+uplen+" downlen"+downlen+" leftlen "+leftlen);
                System.out.println("COMPARING  LU["+yi+"]["+z+"] with LD["+yj+"]["+z+"]");
                if(LU[yi][z]<= LD[yj][z])
                {
                    check=true;
                    arr[ii][jj]=LU[yi][z];
                    yi++;
                }
                else
                {
                    check=true;
                    arr[ii][jj]=LD[yj][z];
                    yj++;
                }
                System.out.println("arr[ii][jj]=["+ii+"]["+jj+"]="+arr[ii][jj]); 

                ii++;
            }
           while(yi<uplen)
           {
                check=true;
               arr[ii][jj]=LU[yi][z];
               System.out.println("arr[ii][jj]=["+ii+"]["+jj+"]="+arr[ii][jj]); 

               yi++;
               ii++;
           }
           while(yj<downlen)
           {
               check=true;
               arr[ii][jj]=LD[yj][z];
               System.out.println("arr[ii][jj]=["+ii+"]["+jj+"]="+arr[ii][jj]); 

               yj++;
               ii++;
           }
           jj++;
                yi=0;
                yj=0;
            
           ii=u;
        }
        
        for (int i = 0; i < uplen; ++i)
        {
            for(int j=0;j< leftlen; j++)
            {
			    LU[i][j] = arr[u + i][l + j];
            }
        }
        System.out.println("\nLEFT UP ");
        printArray(LU);
        for (int i = 0; i < downlen; ++i)
        {
            for(int j=0;j< leftlen; j++)
            {
			    LD[i][j] = arr[ym + 1 + i][l + j];
            }
        }
        System.out.println("\nLEFT DOWN ");
        printArray(LD);
        jj=xm+1;
        yi=0;
        yj=0;
        check=false;
        //RIGHT
        for(int z=0; z<rightlen; z++)
        {
            System.out.println("Right arr[ii][jj]=["+ii+"]["+jj+"]");
            System.out.println("COMPARING  RU["+yi+"]["+z+"] with RD["+yj+"]["+z+"]");
            check=false;
            while(yi<uplen  && yj<downlen)
            {
                if(RU[yi][z]<= RD[yj][z])
                {
                    check=true;
                    arr[ii][jj]=RU[yi][z];
                    yi++;
                }
                else
                {
                    check=true;
                    arr[ii][jj]=RD[yj][z];
                    yj++;
                }
                System.out.println("arr[ii][jj]=["+ii+"]["+jj+"]="+arr[ii][jj]); 

                ii++;
            }
           while(yi<uplen)
           {
               check=true;
               arr[ii][jj]=RU[yi][z]; 
               System.out.println("arr[ii][jj]=["+ii+"]["+jj+"]="+arr[ii][jj]); 
               
               yi++;
               ii++;
           }
           while(yj<downlen)
           {
               check=true;
               arr[ii][jj]=RD[yj][z];
               System.out.println("arr[ii][jj]=["+ii+"]["+jj+"]="+arr[ii][jj]); 

               yj++;
               ii++;
           }
           jj++;
                yi=0;
                yj=0;
            
           ii=u;
        }
		for (int i = 0; i < uplen; ++i)
        {
            for(int j=0;j< rightlen; j++)
            {
			    RU[i][j] = arr[u + i][xm + 1 + j];
            }
        }
        System.out.println("\nRIGHT UP ");
        printArray(RU);
        for (int i = 0; i < downlen; ++i)
        {
            for(int j=0;j< rightlen; j++)
            {
			    RD[i][j] = arr[ym + 1 + i][xm + 1 + j];
            }
        }
        System.out.println("\nRIGHT DOWN");
        printArray(RD);
        printArray(arr);
	}
    static void partialprint(int arr[][], int u, int d, int l, int r)
	{
		for (int i = u; i <= d; ++i)
        {
            for(int j=l;j<=r;j++)
            {
			    System.out.print(arr[i][j] + " ");
            }
		    System.out.println();
        }
        System.out.println();

        
	}
	void sort(int arr[][], int u, int d, int l, int r)
	{
		if (l < r && u<d) 
        {
			
			int xaxis=l+ (r-l)/2;
            int yaxis=u +(d-u)/2;
            System.out.println("The four sets are : ");
            System.out.println("Left Up :");
            partialprint(arr, u,yaxis,l, xaxis);
            System.out.println("Right Up :");
            partialprint(arr, u,yaxis,xaxis+1, r);
            System.out.println("Left Down :");
            partialprint(arr, yaxis+1,d,l, xaxis);
            System.out.println("Right Down :");
            partialprint(arr, yaxis + 1,d,xaxis+1, r);
            System.out.println();
			sort(arr, u,yaxis,l, xaxis);
            sort(arr, u,yaxis,xaxis+1, r);
            sort(arr, yaxis+1,d,l, xaxis);
			sort(arr, yaxis + 1,d,xaxis+1, r);
			merge(arr, l,xaxis, r, u , yaxis, d);
		}
	}
	static void printArray(int arr[][])
	{
		int row = arr.length;
        int col= arr[0].length;
		for (int i = 0; i < row; ++i)
        {
            for(int j=0;j<col;j++)
            {
			    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}
    static void sortSingle(int arr[][], int check , int val)
    {
        if(check==0)
        {
            int n=arr.length;
            for (int i = 0; i < n-1; i++)
            {
                for (int j = 0; j < n-i-1; j++)
                {
                    if (arr[j][val] > arr[j+1][val])
                    {
                        int temp = arr[j][val];
                        arr[j][val] = arr[j+1][val];
                        arr[j+1][val] = temp;
                    }
                }
            }
        }
        else
        {
            int n=arr[0].length;
            for (int i = 0; i < n-1; i++)
            {
                for (int j = 0; j < n-i-1; j++)
                {
                    if (arr[val][j] > arr[val][j+1])
                    {
                        int temp = arr[val][j];
                        arr[val][j] = arr[val][j+1];
                        arr[val][j+1] = temp;
                    }
                }
            }
        }
    
    }
	public static void main(String args[]) throws IOException
	{

        Scanner scr=new Scanner(System.in);
        File file1 = new File("Eval.txt");
        PrintStream stream1 = new PrintStream(file1);
        System.out.println("From now on "+file1.getAbsolutePath()+" will be your console");
        System.setOut(stream1);
		//int arr[][] = {{18 ,4 ,16 ,8 },{23, 13 ,20 ,11 },{28, 24 ,26, 25 },{1 ,30 ,15 ,19}};
        //int arr[][] = {{18 ,4 ,16 ,8 },{23, 13 ,20 ,11 },{28, 24 ,26, 25 },{1 ,30 ,15 ,19},{2,3,4,5},{6,7,8,9}};
        int row=0;
        int col=0;
        try
        {
            row=scr.nextInt();
            col=scr.nextInt();
        }catch(Exception e){};
        int arr[][]=new int [row][col];
        //int arr[][] = {{18 ,9 ,11} ,{1,4,15 },{13,23,20}};
        for(int i=0;i< row;i++)
        {
            for(int j=0;j<col;j++)
            {
                try
                {
                    arr[i][j]=scr.nextInt();
                }catch(Exception e){};
            }
        }
		MergeSort ob = new MergeSort();
        printArray(arr);
        System.out.println();
        if(arr[0].length==1)
            sortSingle(arr, 0, 0);
        else if (arr.length==1)
            sortSingle(arr, 1, 0);
        ob.sort(arr, 0, arr.length - 1,0, arr[0].length-1);
		printArray(arr);
        scr.close();
	}
}

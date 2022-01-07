/* C/C++ program to solve N Queen Problem using
backtracking */
#define N 4
#include <iostream>
using namespace std;
/* A utility function to print solution */
void printSolution(int board[N][N])
{
    int count =1;
	for (int i = 0; i < N; i++) 
    {
		for (int j = 0; j < N; j++)
        if(board[i][j]==1)
			cout<<"Q"<<count++<<"    ";
        else
            cout<<"--"<<"    ";
		cout<<endl;
	}
}

bool isSafe(int board[N][N], int row, int col)
{
	int i, j;

	for (i = 0; i < row; i++)
		if (board[i][col]==1)
			return false;

	for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
		if (board[i][j]==1)
			return false;
	for (i = row, j = col; i >= 0 && j < N; i--, j++)
		if (board[i][j]==1)
			return false;

	return true;
}

bool solveNQueenRecursively(int board[N][N], int row)
{
	if (row >= N)
		return true;

	for (int i = 0; i < N; i++) 
    {
		if (isSafe(board, row, i)) 
        {
			board[row][i] = 1;
			if (solveNQueenRecursively(board, row + 1))
				return true;
			board[row][i] = 0; 
            // BACKTRACK
		}
	}
	return false;
}

bool solveNQueen()
{
    for(int i=0;i< N; i++)
    {
        int board[N][N] = { 0 };
        board[0][i]=1;
        if (solveNQueenRecursively(board, 1) == true) 
        {    
            printSolution(board);
            cout<<"\n\n";
        }
    }
	return true;
}

int main()
{
    cout<<"Queens can be placed like this for "<<N<<" X "<<N<<"-\n";
	solveNQueen();
	return 0;
}

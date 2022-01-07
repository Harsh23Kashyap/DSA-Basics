#include <iostream>
#include <cmath>
using namespace std;

int knapSack(int W, int wt[], int val[], int n)
{
 
    if (n == 0 || W == 0)
        return 0;
 
    if (wt[n - 1] > W)
        return knapSack(W, wt, val, n - 1);

    else
        return max(val[n - 1]+ knapSack(W - wt[n - 1],wt, val, n - 1), knapSack(W, wt, val, n - 1));
}
 
// Driver code
int main()
{
    int val[] = { 40,30,50,10 };
    int wt[] = { 2,5,10,5 };
    int W =16;
    int n = sizeof(val) / sizeof(val[0]);
    cout << "\nThe max value is : "<<knapSack(W, wt, val, n)<<endl;
    return 0;
}
 
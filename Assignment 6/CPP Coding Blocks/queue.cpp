#include <iostream>
#include <queue>
using namespace std;
int main()
{
    int inp;
    queue<int> q;
    cout<< "Taking input "<<endl;
    for (int i=0; i<2; i++)
    {
        cin>>inp;
        q.push(inp);
    }

    cout<<q.empty();
    cout<< "Output "<<endl;
    while(!q.empty())
    {
        int k=q.front();
        q.pop();
        cout<<k<<endl;
    }
    cout<<q.empty();
    return 0;
}

#include <iostream>
#include <queue>
using namespace std;
int main()
{
    int inp;
    priority_queue<int> pq;
    cout<< "Taking input "<<endl;
    for (int i=0; i<2; i++)
    {
        cin>>inp;
        pq.push(inp);
    }

    cout<<pq.empty();
    cout<< "Output "<<endl;
    while(!pq.empty())
    {
        int k=pq.top();
        pq.pop();
        cout<<k<<endl;
    }
    cout<<pq.empty();
    return 0;
}

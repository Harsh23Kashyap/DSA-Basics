#include <iostream>
#include <stack>
using namespace std;
int main()
{
    int inp;
    stack<int> s;
    cout<< "Taking input "<<endl;
    for (int i=0; i<2; i++)
    {
        cin>>inp;
        s.push(inp);
    }

    cout<<s.empty();
    cout<< "Output "<<endl;
    while(!s.empty())
    {
        int k=s.top();
        s.pop();
        cout<<k<<endl;
    }
    cout<<s.empty();
}
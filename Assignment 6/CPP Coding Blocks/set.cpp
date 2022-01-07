#include <set>
#include <iostream>
using namespace std;
int main()
{
    int arr[]={3,2,1,10,20,40,30,60, 40,60};
    int n= sizeof(arr)/sizeof(int);
    set <int> s;
    for (int i=0;i<n;i++)
        s.insert(arr[i]);
    for(auto it=s.begin();it!=s.end();it++)
        cout<<*it<<endl;
}
#include <set>
#include <iostream>
using namespace std;
int main()
{
    int arr[]={3,2,1,10,20,40,30,60, 40,60};
    int n= sizeof(arr)/sizeof(int);
    multiset <int> s(arr,arr+n);
    cout<<"before"<<endl; 
    for(auto it=s.begin();it!=s.end();it++)
        cout<<*it<<endl;
    s.erase(10);
    cout<<"After"<<endl;
    for(auto it=s.begin();it!=s.end();it++)
        cout<<*it<<endl;
}
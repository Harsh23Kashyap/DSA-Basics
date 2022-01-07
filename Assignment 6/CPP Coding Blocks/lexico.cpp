#include <iostream>
#include <cstring>
#include <string>
#include <vector>
using namespace std;
int main()
{
    int n;
    vector <int> v;
    cin>>n;
    int el;
    for(int i=0;i<n;i++)
    {
        cin>>el;
        v.push_back(el);
    }
    for(int i=0;i<n;i++)
    {
        cin>>el;
        v.push_back(el);
    }
    sort(v.begin(),v.end());
    int i=0;
    for(auto it=v.begin();i!=n;it++,i++)
    {
       v.pop_back();
    }
    cout<<v.back()<<endl;
}
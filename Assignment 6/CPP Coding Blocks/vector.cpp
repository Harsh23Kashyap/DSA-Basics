#include <iostream>
#include <vector>
using namespace std;
int main()
{
    vector <int> v1(10,0);
    vector<int>::iterator it;
    for(it=v1.begin();it!=v1.end();it++)
    {
        cout<<(*it)<<", ";
    }
    cout<<endl;
    v1.push_back(3);
    v1.insert(v1.begin()+3,4,100);
    v1.erase(v1.begin()+1,v1.begin()+9);
    for(int x:v1)
    {
        cout<<x<<", ";
    }
    
    cout<<endl<<v1.capacity()<<endl;
    cout<<v1.size()<<endl;
    cout<<v1.max_size()<<endl;

    return 0;
}
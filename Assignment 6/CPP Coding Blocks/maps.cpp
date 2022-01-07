#include <iostream>
#include <map>
#include <string>
using namespace std;
int main()
{
    int inp;
    map<string, int> m;
    cout<< "Taking input "<<endl;
    m.insert(make_pair("Mango",100));
    m["Banana"]=50;
    string key;
    cin>>key;
    auto it= m.find(key);
    for(auto it=m.begin();it!=m.end();it++)
        cout<<it->first<<" and "<<it->second<<endl;
    if(it!=m.end())
        cout<<"Price of "<<key<< " is "<<m[key]<<endl;
    else
        cout<< "Not present";
    m.erase(key);
    if (m.count(key)!=0)
        cout<<"Price of "<<key<< " is "<<m[key]<<endl;
    else
        cout<< "Not present"<<endl;
    
}

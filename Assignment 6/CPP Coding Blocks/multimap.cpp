#include <iostream>
#include <map>
#include <string>
using namespace std;
int main()
{
    int inp;
    multimap <string, int> m;
    m.insert(make_pair("Bat",20));
    m.insert(make_pair("Bat",40));
    m.insert(make_pair("Bat",60));
    //m["Bat"]=30;
    for(auto it=m.begin();it!=m.end();it++)
        cout<<it->first<<" and "<<it->second<<endl;
}

#include <iostream>
#include <list>
using namespace std;
int main()
{
    list<string> l1 ;
    l1.push_back("pineapple");
    l1.push_back("apple");
    l1.push_back("banana");
    l1.push_back("mango");
    l1.push_back("guava");

    list<string>::iterator it;
    for( it=l1.begin();it!=l1.end();it++)
    {
        cout<<(*it)<<"->";
    }
    l1.sort();
    l1.reverse();
    cout<<endl;
    for(string x:l1)
    {
        cout<<x<<"->";
    }


    return 0;
}
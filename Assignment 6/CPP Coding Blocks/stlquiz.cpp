#include <iostream>
#include <algorithm>
#include <set>
using namespace std;
int main()
{
    set<int>s;
    s.insert(1);
    s.insert(5);
    s.insert(7);
    s.insert(2);
    s.insert(12);
    s.insert(10);
    auto it = s.lower_bound(15);
    cout<< *it <<endl;
    return 0;
}
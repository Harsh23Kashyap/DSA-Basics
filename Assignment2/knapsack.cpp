#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;
class object
{
public:
    int id, p, w;
    float pw, x;

    object(int id, int p, int w, float pw)
    {
        this->id = id;
        this->p = p;
        this->w = w;
        this->pw = pw;
    }
};
bool sortbyprofitbyweight(object &a, object &b)
{
    return (double)a.pw > b.pw;
}
int main()
{
    cout << "Enter the number of items" << endl;
    int n;
    cin >> n;
    vector<object> obj;
    int id, profit, weight;
    for (int i = 0; i < n; i++)
    {
        cin >> id >> profit >> weight;
        float pw = profit / weight;
        object a(id, profit, weight, pw);
        obj.push_back(a);
    }
    sort(obj.begin(), obj.end(), sortbyprofitbyweight);
    int i = 0, totalprofit = 0;
    int k;
    cout << "Enter the capacity of knapsack" << endl;
    cin >> k;
    while (k > 0)
    {
        obj[i].x = min(obj[i].w, k);
        k = k - obj[i].x;
        obj[i].x = obj[i].x / obj[i].w;
        totalprofit = totalprofit + obj[i].p * obj[i].x;
        i++;
    }
    cout << "MaximumProfit" << totalprofit << endl;
    return 0;
}
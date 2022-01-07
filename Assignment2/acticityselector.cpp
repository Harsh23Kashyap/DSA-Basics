#include<iostream>
#include<cstring>
using namespace std;

int main()
{
    int n=11;
    string Activity[]={ "A1", "A2", "A3" , "A4", "A5", "A6", "A7", "A8", "A9", "A10"};
    int start[]={1,2,2,4,7,8,9,9,10,12};
    int finish[]={3,5,4,8,10,9,13,10,12,14};

    string finalres=" A1, ";

    int k=0,m=1;
    for (int m=1;m<n;m++)
    {
        if(start[m]>=finish[k])
        {
            finalres+=Activity[m]+", ";
            k=m;
        }
    }
    cout<<finalres<<endl;
    return 0;
}
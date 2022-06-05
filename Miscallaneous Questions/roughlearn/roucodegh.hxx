#include <iostream>
using namespace std;

struct code
{
    int H;
    int P;
};
int main()
{
	int T;
	cin>>T;
	struct code ar[T];
	for(int i=0;i<T;i++)
	{
	    cin>>ar[i].H>>ar[i].P;
	}

    for(int i=0;i<T;i++)
    {
        while(ar[i].P>0&&ar[i].H>0)
        {
            ar[i].H=ar[i].H-ar[i].P;
            ar[i].P=ar[i].P/2;
        }
        if(ar[i].P>0)
        cout<<"1"<<endl;
        else
        cout<<"0"<<endl;
    }
	return 0;
}
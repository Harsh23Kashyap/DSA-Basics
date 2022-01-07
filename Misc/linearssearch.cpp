#include <iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter size of array : ";
    cin>>n;
    int arr[n];
    cout<<"Enter values of array"<<endl;
    for(int i=0;i<n;i++)
        cin>>arr[i];
    int s;
    cout<<"Enter element to be searched ";
    cin>>s;
    for (int i=0;i< n;i++)
    {

        if(arr[i]==s)
        {
            cout<<"Found"<<endl;
            return 1;
        }
    }
    cout<<"Not Found"<<endl;
}
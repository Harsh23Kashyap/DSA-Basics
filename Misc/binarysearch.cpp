#include <iostream>
using namespace std;
//recursive call
int binarySearchRecursive(int arr[], int l, int r, int x) 
{ 
	if (r >= l) 
    { 
		int mid = (l + r) / 2; 

		if (arr[mid] == x) 
			return mid; 

		if (arr[mid] > x) 
			return binarySearchRecursive(arr, l, mid - 1, x); 

		return binarySearchRecursive(arr, mid + 1, r, x); 
	} 
	return -1; 
} 

int binarySearchIterative(int arr[],int n,int s)
{
    int l=0;
    int r=n-1;
    int result=-1;
    while(l<=r)
    {
        int mid=(l+r)/2;
        if(s==arr[mid])
        {
            cout<<"Found in array at "<<mid<<endl;
            result=1;
            break;
        }
        else if(arr[mid]<s)
            l=mid+1;
        else
            r=mid-1;
        
    }
    if(result == -1) 
        cout<<"Not Found in array."<<endl;
}
int main()
{
    int n;
    cout<<"enter size of array : ";
    cin>>n;
    int arr[n];
    cout<<"Enter values of array"<<endl;
    for(int i=0;i<n;i++)
        cin>>arr[i];
    sort(arr, arr+n);
    int s;
    cout<<"Enter element to be searched : ";
    cin>>s;
    binarySearchIterative(arr,n,s);
    int result = binarySearchRecursive(arr, 0, n - 1, s);
    (result == -1) ? cout << "Found in array\n": cout << "Found in  array at  " << result<<endl; 
    return 0;
}

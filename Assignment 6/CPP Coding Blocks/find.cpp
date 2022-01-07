
#include <iostream> 
#include <algorithm>
using namespace std; 

// driver code 
int main() 
	{ 
        
		int arr[] = { 10,20,30,40,40,40,50,100,1100}; 
		int n = sizeof(arr) / sizeof(int); 
        cout<<"Enter Key : ";
        int key;
        cin>>key;
        //find fn
        int* it= find(arr,arr+n,key);
        int index = it - arr;
        if(index==n)
        {
            cout<<key<<" is not present"<<endl;

        }
        else
        {
            cout<<key<<" is present at index "<<index<<endl;
        }
        bool present = binary_search(arr,arr+n,key);
        cout<<present<<endl;
        int* lb=lower_bound(arr,arr+n,key);
        cout<<(lb-arr)<<" Lower Bound "<<endl;
        int* up=upper_bound(arr,arr+n,key);
        cout<<(up-arr)<<" Upper Bound "<<endl;
        cout<<"Occurence and freq of "<<key<<" is "<<(up-lb)<<endl;

	} 

// C++ program to find the element 
// occurring odd number of times 
#include <iostream> 
#include <algorithm>
using namespace std; 

// driver code 
int main() 
	{ 
        
		int arr[] = { 2, 3, 5, 4, 5, 2, 14, 3, 5, 2, 4, 4, 2 }; 
		int n = sizeof(arr) / sizeof(int); 
        cout<<"Enter Key : ";
        int key;
        cin>>key;
        auto it= find(arr,arr+n,key);
        int index = it - arr;
        if(index==n)
        {
            cout<<key<<" is not present"<<endl;

        }
        else
        {
            cout<<key<<" is present at index "<<index<<endl;
        }
        
	} 

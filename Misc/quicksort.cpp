#include <iostream>
using namespace std; 

void swap(int* a, int* b) 
{ 
	int t = *a; 
	*a = *b; 
	*b = t; 
} 

int partition (int arr[], int low, int high) 
{ 
	int pivot = arr[high]; 
	int i = (low - 1); 
	for (int j = low; j <= high - 1; j++) 
	{  
		if (arr[j] < pivot) 
		{ 
			i++; 
			swap(&arr[i], &arr[j]); 
		} 
	} 
	swap(&arr[i + 1], &arr[high]); 
	return (i + 1); 
} 

void quickSortRecursive(int arr[], int low, int high) 
{ 
	if (low < high) 
	{ 
		int pi = partition(arr, low, high); 
		quickSortRecursive(arr, low, pi - 1); 
		quickSortRecursive(arr, pi + 1, high); 
	} 
} 
void quickSortIterative(int arr[], int l, int h) 
{ 
    int stack[h - l + 1]; 
    int top = -1; 
    stack[++top] = l; 
    stack[++top] = h; 
    while (top >= 0) 
    { 
        h = stack[top--]; 
        l = stack[top--]; 
        int p = partition(arr, l, h); 
        if (p - 1 > l) 
        { 
            stack[++top] = l; 
            stack[++top] = p - 1; 
        } 
  
        if (p + 1 < h) 
        { 
            stack[++top] = p + 1; 
            stack[++top] = h; 
        } 
    } 
} 
  
/* Function to print an array */
void printArray(int arr[], int size) 
{ 
	int i; 
	for (i = 0; i < size; i++) 
		cout << arr[i] << " "; 
	cout << endl; 
} 

// Driver Code
int main() 
{ 
	int arr[] = {10, 7, 8, 9, 1, 5}; 
	int n = sizeof(arr) / sizeof(arr[0]); 
    cout << "Given array is : \n"; 
	printArray(arr, n); 
	quickSortRecursive(arr, 0, n - 1); 
	cout << "\nSorted array revursively is : \n"; 
	printArray(arr, n); 

    int copy[] = {10, 7, 8, 9, 1, 5}; 
	int cn = sizeof(copy) / sizeof(copy[0]); 
    cout << "\nGiven array is : \n"; 
	printArray(copy, n); 
	quickSortRecursive(copy, 0, n - 1); 
	cout << "\nSorted array iteratively is : \n"; 
	printArray(arr, n); 
	return 0; 
} 


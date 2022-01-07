#include<iostream>
using namespace std;

void merge(int arr[], int l, int m, int r)
{
	int k;
	int n1 = m - l + 1;
	int n2 = r - m;
	int L[n1], R[n2];

	for(int i = 0; i < n1; i++)
		L[i] = arr[l + i];
	for(int j = 0; j < n2; j++)
		R[j] = arr[m + 1+ j];

	int i = 0;
	int j = 0;
	k = l;
	
	while (i < n1 && j < n2)
	{
		if (L[i] <= R[j])
		{
			arr[k] = L[i];
			i++;
		}
		else
		{
			arr[k] = R[j];
			j++;
		}
		k++;
	}

	while (i < n1)
	{
		arr[k] = L[i];
		i++;
		k++;
	}

	while (j < n2)
	{
		arr[k] = R[j];
		j++;
		k++;
	}
}
void mergeSortRecursive(int arr[], int l, int r)
{
	if (l < r)
	{
		int m = l + (r - l) / 2;
		mergeSortRecursive(arr, l, m);
		mergeSortRecursive(arr, m + 1, r);
		merge(arr, l, m, r);
	}
}
int min(int x, int y) 
{ 
	return (x<y)? x :y; 
}
 
void mergeSortIterative(int arr[], int n)
{
   int curr_size;  
   int left_start; 
   for (curr_size=1; curr_size<=n-1; curr_size = 2*curr_size)
   {
       for (left_start=0; left_start<n-1; left_start += 2*curr_size)
       {
           int mid = min(left_start + curr_size - 1, n-1);
           int right_end = min(left_start + 2*curr_size - 1, n-1);
           merge(arr, left_start, mid, right_end);
       }
   }
}

void printArray(int A[], int size)
{
	for(int i = 0; i < size; i++)
		printf("%d ", A[i]);
		
	cout << "\n";
}

int main()
{
	int arr[] = { 12, 11, 13, 5, 6, 7 };
	int arr_size = sizeof(arr) / sizeof(arr[0]);

	cout << "Given array is \n";
	printArray(arr, arr_size);

	mergeSortRecursive(arr, 0, arr_size - 1);

	cout << "\nSorted array Recursively is \n";
	printArray(arr, arr_size);

	int copy[] = { 12, 11, 13, 5, 6, 7 };
	int copy_size = sizeof(copy) / sizeof(copy[0]);

	cout << "\n\nGiven array is \n";
	printArray(copy, copy_size);

	mergeSortIterative(copy, arr_size);

	cout << "\nSorted array Iteratively is \n";
	printArray(arr, arr_size);
	return 0;
}


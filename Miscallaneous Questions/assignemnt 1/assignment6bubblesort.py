#Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order. Code the Bubble sort with the following elements:

def bubbleSort(arr): 
    n = len(arr) 
    for i in range(n-1): 

        for j in range(0, n-i-1): 
  
            # traverse the array from 0 to n-i-1 
            # Swap if the element found is greater 
            # than the next element 
            if arr[j] > arr[j+1] : 
                arr[j], arr[j+1] = arr[j+1], arr[j] 
  
# Driver code to test above 
import array as arr
a = arr.array('i',[64, 34, 25, 12, 22, 11, 90] )
  
bubbleSort(a) 
  
print ("Sorted array is:") 
for i in range(len(a)): 
    print(a[i], end="   ")
print('')
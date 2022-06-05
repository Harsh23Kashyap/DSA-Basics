
# Returns index of x in arr if present, else -1 
def binary_search(arr, low, high, x): 

	while ( high >= low ):

		mid = (int)((high + low)/2)

		if arr[mid] == x: 
			return mid 

		elif arr[mid] > x: 
			high = mid-1 

		else: 
			low= mid + 1

	else: 
		# Element is not present in the array 
		return -1

# Test array
import array as arr 
n= int(input("Enter no. of elements : "))
a= arr.array('d',[])
for i in range (n):
    p = int(input("Enter value of "+str(i)+"th element : "))
    a.append(p)
 
x = int(input("Enter search element : "))

# Function call 
result = binary_search(a, 0, len(a)-1, x) 

if result != -1: 
	print("Element is present at index", str(result)) 
else: 
	print("Element is not present in array") 

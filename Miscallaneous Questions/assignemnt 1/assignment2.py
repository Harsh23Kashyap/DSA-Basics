#PYTHON
#Design the logic to remove the duplicate elements from an Array and after the deletion the array should contain the unique elements.
import array as arr
a = arr.array('i',[])
n= int(input("Enter number of elements "))
for i in range (n):
    c = int(input("Enter value of "+ str(i)+"th element "))
    a.append(c)
print("\n")

size = len(a);       

for i in range (size):
    j=1+i
    while(j<size):
        if(a[i] == a[j]):
            k=j
            while(k<size):
                a[k] = a[k + 1]
            size=size-1
            j=j-1
        j=j+1
    
print("\nElements are ")
for i in range (size):
    print(a[i])
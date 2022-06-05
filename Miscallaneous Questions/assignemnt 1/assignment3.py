#PYTHON
#Implement the logic to
#Reverse the elements of an array
import array as arr
a = arr.array('i',[])
n= int(input("Enter number of elements "))
for i in range (n):
    c = int(input("Enter value of "+ str(i)+"th element "))
    a.append(c)
m = (int)(n/2)
for i in range (m):
    d= a[i]
    a[i]= a[n-1-i]
    a[n-i-1] = d
for i in range (n):
    print(a[i], end=" ")
print("\n")

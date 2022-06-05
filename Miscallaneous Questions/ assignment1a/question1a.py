#Space required to store any two-dimensional array is
 #. Assuming array is used to store elements of the following
#matrices, implement an efficient way that reduces the space requirement.
#(a) Diagonal Matrix
import array as arr
a= arr.array('i',[])
n= int(input("Enter rows and columns for matrix (nXn) : "))
for i in range (n):
    c = int(input("Enter value for diagonal ["+ str(i)+","+str(i)+"] th element : "))
    a.append(c)
for i in range (n):
    for j in range (n):
        if i==j:
            print(a[i],end="  ")
        else:
            print("0",end="  ")
    print("")

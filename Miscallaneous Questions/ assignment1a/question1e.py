#Space required to store any two-dimensional array is
 #. Assuming array is used to store elements of the following
#matrices, implement an efficient way that reduces the space requirement.
#(b) SYMMETRIC Matrix.
import array as arr
a= arr.array('i',[])
n= int(input("Enter rows and columns for matrix (nXn) : "))
print("\nSYMMETRIC MATRIX")
u=0
for i in range (n**2):
    c = int(input("Enter value for diagonal ["+ str((int)(i/n))+","+str(i%n)+"] th element : "))
    a.append(c)
for i in range (n):
    for j in range (n):
        print(a[u],end="  ")
        u=u+1
    print("")

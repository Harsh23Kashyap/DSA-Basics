#Space required to store any two-dimensional array is
 #. Assuming array is used to store elements of the following
#matrices, implement an efficient way that reduces the space requirement.
#(b) Upper triangular Matrix.
import array as arr
d= arr.array('i',[])
n= int(input("Enter rows and columns for matrix (nXn) : "))
print("\nUPPER TRIANGULAR MATRIX")
p = (n*(n-1)//2)
for i in range (p):
    c = int(input("Enter element : "))
    d.append(c)
u=0
for i in range (n):
    for j in range (n):
        if (j>i):
            print(d[u],end="  ")
            u=u+1
        else:
            print("0",end="  ")
    print("")
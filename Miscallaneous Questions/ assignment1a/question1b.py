#Space required to store any two-dimensional array is
 #. Assuming array is used to store elements of the following
#matrices, implement an efficient way that reduces the space requirement.
#(b) Tri diagonal Matrix.
import array as arr
ud= arr.array('i',[])
d= arr.array('i',[])
ld= arr.array('i',[])
n= int(input("Enter rows and columns for matrix (nXn) : "))
print("\nUPPER DIAGONAL")
for i in range (n-1):
    c = int(input("Enter value for diagonal ["+ str(i)+","+str(i+1)+"] th element : "))
    ud.append(c)
print("\nDIAGONAL")
for i in range (n):
    c = int(input("Enter value for diagonal ["+ str(i)+","+str(i)+"] th element : "))
    d.append(c)
print("\nLOWER DIAGONAL")
for i in range (n-1):
    c = int(input("Enter value for diagonal ["+ str(i+1)+","+str(i)+"] th element : "))
    ld.append(c)
u=0
l=0
for i in range (n):
    for j in range (n):
        if (i-j==1):
            print(ud[u],end="  ")
            u=u+1
        elif(i==j):
            print(d[i],end="  ")
        elif (i-j==-1):
            print(ld[l],end="  ")
            l=l+1
        else:
            print("0",end="  ")
    print("")
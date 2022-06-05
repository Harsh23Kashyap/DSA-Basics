#DesigntheLogictoFindaMissingNumberinaSortedArray.
import array as arr
a = arr.array('i',[])
b = arr.array('i',[])
n= int(input("Enter number of elements "))
sum= n*(n+1)/2
for i in range (n):
    a.append(i+1)
usersum=0
for i in range (n-1):
    c = int(input("Enter value of "+ str(i)+"th element "))
    b.append(c)
    usersum=usersum+c
print("The missing element is "+str(int(sum-usersum)))
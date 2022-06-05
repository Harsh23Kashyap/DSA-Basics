import random as rd
import math 
n = int(input("Enter number\n"))
for i in range (1,n+1):
    for j in range (i, n):
        k = j*j + i*i
        c=( int)(math.sqrt(k))
        if (c==k):
            print(str(i)+"^2 + "+str(j)+"^2 = "+str(k) )
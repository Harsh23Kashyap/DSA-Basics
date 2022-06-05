#PYTHON ASSIGNMENT 1 QUESTION 1
#1) Develop a Menu driven program to demonstrate the following operations o Arrays
# ——MENU——- 
# 1.CREATE 
# 2.DISPLAY
#3.INSERT 
# 4.DELETE
#5.SEARCHp
#  6.EXIT

m=0
a= []
while True:
    print("——MENU——- \n1.CREATE \n2.DISPLAY\n3.INSERT \n4.DELETE\n5.SEARCH \n6.EXIT\n")
    ch = int(input("Enter your choice "))
    if ch==1:
        n= int(input("Enter number of elements "))
        for i in range (n):
            c = int(input("Enter value of "+ str(i)+"th element "))
            a[i] = c
    elif ch==2:
        print("Elements are ")
        j=0
        print(m)
        while (j<n+m):
            print (a[j],end=" ")
            j=j+1
        print("\n")
    elif ch==3:
        val = int(input("Enter value "))
        pos = int(input("Enter position at which we have to insert "))
        if(pos>=len(a)):
            print("Out of Bounds index ")
        else:
            k= len(a)
            a[k]=0
            j=len(a)-1
            while (j>pos):
                a[j] = a[j-1]
                j=j-1
            a[pos]=val
            print("\n")
    elif ch==4:
        m=m-1
        pos = int(input("Enter position at which we have to delete "))
        j=pos
        if(pos>=len(a)):
            print("Out of Bounds index ")
        else:
            while (j<(len(a))-1):
                a[j] = a[j+1]
                j=j+1
    elif ch==5:
        pos = int(input("Enter element to be searched "))
        j=0
        result=-1
        while(j<(len(a)+m)):
            if(pos==a[j]):
                result =j
                break
            j=j+1
        if result != -1: 
            print("Element is present at index", str(result)) 
        else: 
            print("Element is not present in array") 
        print("\n")
    elif ch==6:
        print("We are done ")
        break
    else:
        print("Not an option \n")



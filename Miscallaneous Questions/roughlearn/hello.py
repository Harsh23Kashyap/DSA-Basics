t=int(input())
while(t):
    n,k=map(int,input().split())
    c=0
    a=list(map(int,input().split()))
    for i in range(n):
        if a[i]>k:
            c=c+(a[i]-k)
    print(c)
    t=t-1

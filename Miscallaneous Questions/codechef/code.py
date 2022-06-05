test=int(input())
while(test>0):
    test=test-1
    aa=int(input())
    bstick= [int(x) for x in input().split]
    if 0 in bstick:
        print(len(set(bstick)))
    else:
        print(len(set(bstick))-1)



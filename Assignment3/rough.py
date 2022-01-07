import copy
def check_goal(q,goal_state):
    return q==goal_state
def move1(q):
    q1=copy.deepcopy(q)
    if q1[0]==0:
        q1[0]=4
    return q1
def move2(q):
    q1=copy.deepcopy(q)
    if q1[1]==0:
        q1[1]=3
    return q1
def move3(q):
    q1=copy.deepcopy(q)
    if q1[0]!=0:
        q1[0]=0
    return q1
def move4(q):
    q1=copy.deepcopy(q)
    if q1[1]!=0:
        q1[1]=0
    return q1
def move5(q):
    q1=copy.deepcopy(q)
    if q1[0]!=4:
        extra=min(q1[1],4-q1[0])
        q1[0]+=extra
        q1[1]-=extra
    return q1
def move6(q):
    q1=copy.deepcopy(q)
    if q1[1]!=3:
        extra=min(q1[0],3-q1[1])
        q1[1]+=extra
        q1[0]-=extra
    return q1

state=[0,0]
goal_state=[2,0]
queue=[] 
visited=[] #check for repetition a queue is maintained
queue.append(state)
while(1):
    print(queue)
    q=queue.pop(0) #print q
    visited.append(q) #print visited
    if check_goal(q,goal_state):
        print('Goal state:') 
        print(q)
        break
    
    q1=move1(q)
    if q1 not in visited:
        queue.append(q1)
    q2=move2(q)
    if q2 not in visited:
        queue.append(q2)
    q3=move3(q)
    if q3 not in visited:
        queue.append(q3)
    q4=move4(q)
    if q4 not in visited:
        queue.append(q4)
    q5=move5(q)
    if q5 not in visited:
        queue.append(q5)
    q6=move6(q)
    if q6 not in visited:
        queue.append(q6)
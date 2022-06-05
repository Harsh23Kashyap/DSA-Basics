
Dict = { 5 : 'Welcome', 6 : 'To', 7 : 'Geeks', 
        'A' : {1 : 'Geeks', 2 : 'For', 3 : 'Geeks'}, 
        'B' : {1 : 'Geeks', 2 : 'Life'}} 
print("Initial Dictionary: ") 
print(Dict)
Dict[5] = 'Not Welcome'
for i in Dict.keys():
        print(i)
for i in Dict.values():
        print(i)
for x,y in Dict.items():
        print(str(x)+" and "+str(y))
if 'Geeks' not in Dict:
        print ("found")
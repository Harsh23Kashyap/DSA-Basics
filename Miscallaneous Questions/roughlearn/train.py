s= input("Are you travelling\n")
s= s.lower()
if ( s=='yes'):
    n= int(input("Enter number of passengers - "))
    list = []
    while(n>0):
        name = input("Enter name - ")
        age = int(input("Enter age - "))
        gender = input("Enter gender - ")
        gender= gender.upper()
        li = [name, age, gender]
        list.append(li)
        n-=1
    for i in list:
        print(i)

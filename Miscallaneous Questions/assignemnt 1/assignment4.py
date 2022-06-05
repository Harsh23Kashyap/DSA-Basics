#PYTHON ASSIGNMENT 4 2D Matrix Multiplication
#Implement the logic to Find the matrix multiplication

# A basic code for matrix input from user 

R = int(input("Enter the number of rows for both the matrix: ")) 
C = int(input("Enter the number of columns for both the matrix: ")) 

# Initialize matrix 
multiplied = []
matrixA = []
matrixB = []  
print("Enter the entries rowwise: for first matrix") 

# For user input 
for i in range(R):		 # A for loop for row entries 
	a =[] 
	for j in range(C):	 # A for loop for column entries 
		a.append(int(input())) 
	matrixA.append(a) 

print(" ") 
print("Enter the entries rowwise: for second matrix") 
for i in range(R):		 # A for loop for row entries 
	a =[] 
	for j in range(C):	 # A for loop for column entries 
		a.append(int(input())) 
	matrixB.append(a) 


for i in range(R):		 # A for loop for row entries 
	a =[] 
	for j in range(C):	 # A for loop for column entries 
		a.append(0) 
	multiplied.append(a) 

for i in range(len(matrixA)):
   # iterate through columns of Y
   for j in range(len(matrixB[0])):
       # iterate through rows of Y
       for k in range(len(matrixB)):
           multiplied[i][j] += matrixA[i][k] * matrixB[k][j]

print("\n The final answer is ") 

for i in range (R):
    for j in range (C):
        print(multiplied[i][j], end="  ")
    print("")


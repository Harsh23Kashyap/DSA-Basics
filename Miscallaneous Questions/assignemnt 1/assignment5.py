#PYTHON ASSIGNMENT 4 2D Matrix TRANSPOSE
#Implement the logic to Find the Transpose of a Matrix

# A basic code for matrix input from user 

R = int(input("Enter the number of rows for both the matrix: ")) 
C = int(input("Enter the number of columns for both the matrix: ")) 

# Initialize matrix 
transpose = []
matrixA = [] 
print("Enter the entries rowwise: for first matrix") 

# For user input 
for i in range(R):		 # A for loop for row entries 
	a =[] 
	for j in range(C):	 # A for loop for column entries 
		a.append(int(input())) 
	matrixA.append(a) 

for i in range(C):		 # A for loop for row entries 
	a =[] 
	for j in range(R):	 # A for loop for column entries 
		a.append(0) 
	transpose.append(a) 

for i in range(C):		 # A for loop for row entries 
	for j in range(R):	 # A for loop for column entries 
		transpose[i][j]=matrixA[j][i]
print("\n The transpose is ") 

for i in range (C):
    for j in range (R):
        print(transpose[i][j], end="  ")
    print("")
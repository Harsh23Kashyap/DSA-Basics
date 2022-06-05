# 3. Write a program to find sum of every row and every column in a two-dimensional array.

# Function to calculate sum of each row  
def row_sum(arr) : 
  
    sum = 0
  
    print("\nFinding Sum of each row:\n") 
  
    # finding the row sum  
    for i in range(len(arr)) : 
        for j in range(len(arr[0])) : 
  
            # Add the element  
            sum += arr[i][j] 
  
        # Print the row sum  
        print("Sum of the row",i,"=",sum) 
  
        # Reset the sum  
        sum = 0
  
  
# Function to calculate sum of each column  
def column_sum(arr) : 
  
    sum = 0
  
    print("\nFinding Sum of each column:\n") 
  
    # finding the column sum  
    for i in range(len(arr)) : 
        for j in range(len(arr[0])) : 
  
            # Add the element  
            sum += arr[j][i] 
  
        # Print the column sum 
        print("Sum of the column",i,"=",sum) 
  
        # Reset the sum  
        sum = 0
  
          
  
# Driver code      
if __name__ == "__main__" :  
  
    # Get the matrix elements  
    n = int(input("Enter rows and columns for matrix (mXn) : "))
    arr= []
    for i in range (n):
        ax= []
        for j in range (n):
            x= int(input("Enter value for "+str(i)+"th row "+str(j)+"th column : "))
            ax.append(x)
        arr.append(ax)       
    # Get each row sum  
    row_sum(arr) 
  
    # Get each column sum  
    column_sum(arr) 
  
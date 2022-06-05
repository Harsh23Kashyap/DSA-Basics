# Python3 program to print 
# given matrix in spiral form 
def spiralPrint(m, n, a) : 
	k = 0; l = 0
	c=1
	while (k < m and l < n) : 
		
		# Print the first row from 
		# the remaining rows 
		for i in range(l, n) : 
			a[k][i]=c
			c = c+1 
			
		k += 1

		# Print the last column from 
		# the remaining columns 
		for i in range(k, m) : 
			a[i][n - 1]=c
			c+=1 
			
		n -= 1

		# Print the last row from 
		# the remaining rows 
		if ( k < m) : 
			
			for i in range(n - 1, (l - 1), -1) : 
				a[m - 1][i]=c
				c+=1
			
			m -= 1
		
		# Print the first column from 
		# the remaining columns 
		if (l < n) : 
			for i in range(m - 1, k - 1, -1) : 
				a[i][l]=c
				c+=1
			
			l += 1

# Driver code      
if __name__ == "__main__" :  
    R= int(input("Enter no. ")
	arr = []
    arr=  [[0] * R] * R

    for i in range (R):
        ax= []
        for j in range (C):
            x= int(input("Enter value for "+str(i)+"th row "+str(j)+"th column : "))
            ax.append(x)
        arr.append(ax)  

    spiralPrint(R, C, arr) 

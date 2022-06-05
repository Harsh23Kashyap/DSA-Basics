// Java program to calculate Nth root of a number 
import java.util.*;
class Root
{ 
    static Scanner scr=new Scanner(System.in);
	
	// method returns Nth power of A 
	static double nthRoot(int A, int N) 
	{ 
		
		// intially guessing a random number between 
		// 0 and 9 
		double xPre = Math.random() % 10; 
	
		// smaller eps, denotes more accuracy 
		double eps = 0.001; 
	
		// initializing difference between two 
		// roots by INT_MAX 
		double delX = 2147483647; 
	
		// xK denotes current value of x 
		double xK = 0.0; 
	
		// loop untill we reach desired accuracy 
		while (delX > eps) 
		{ 
			// calculating current value from previous 
			// value by newton's method 
			xK = ((N - 1.0) * xPre +(double)A / Math.pow(xPre, N - 1)) / (double)N; 
			delX = Math.abs(xK - xPre); 
			xPre = xK; 
		} 
	
		return xK; 
	} 
	
	// Driver code 
	public static void main (String[] args) 
	{ 
        System.out.print("Enter value whose rooth is to be found : " );
        int A=scr.nextInt();
        System.out.print("Enter the root to be of : " );
        int N=scr.nextInt();
	
		double nthRootValue = nthRoot(A, N); 
		System.out.println("Nth root is "
		+ Math.round(nthRootValue*1000.0)/1000.0); 
	
		/* 
			double Acalc = pow(nthRootValue, N); 
			cout << "Error in difference of powers " 
				<< abs(A - Acalc) << endl; 
		*/
	} 
}
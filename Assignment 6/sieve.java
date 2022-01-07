// Java program to print all primes smaller than or equal to 
// n using Sieve of Eratosthenes 

class SieveOfEratosthenes 
{ 
	void sieveOfEratosthenes(int n) 
	{ 
        boolean prime[]= new boolean[n+1];
        for (int i=0;i<prime.length;i++)
        prime[i]=true;
        for (int p=2;p*p<=n;p++)
        {
            if (!prime[p])
            continue;
            else
            for (int c=2,i=p*c;i<=n;i=p*(++c))
            prime[i]=false;
        }
        for (int i=2;i<prime.length;i++)
        if (prime[i])
        System.out.print(i+"  ");
        
	} 
	
	// Driver Program to test above function  
	public static void main(String args[]) 
	{ 
		int n = 30; 
		System.out.print("Following are the prime numbers "); 
		System.out.println("smaller than or equal to " + n); 
		SieveOfEratosthenes g = new SieveOfEratosthenes(); 
		g.sieveOfEratosthenes(n); 
	} 
} 

// This code has been contributed by Amit Khandelwal. 




// Java program to find index of 
// an element in N elements 
import java.util.List; 
import com.google.common.primitives.Ints; 
public class index { 
	// Function to find the index of an element using 
	public static int findIndex(int arr[], int t) 
	{ 
		return Ints.indexOf(arr, t); 
	} 
	// Driver Code 
	public static void main(String[] args) 
	{ 
		int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 }; 
		System.out.println("Index position of 5 is: "
						+ findIndex(my_array, 5)); 
		System.out.println("Index position of 7 is: "
						+ findIndex(my_array, 7)); 
	} 
} 

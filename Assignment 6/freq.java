public class Char_frequency 
{
    static int[][] freq = new int[26][2]; 
    static int[][] copy = new int[26][2]; 
    static String str;
    static void CharFreq() 
    { 
        int n = str.length();  
        for (int i = 0; i < n; i++)
        {
            freq[i][1]=str.charAt(i) - 'a';
            freq[i][1]++;
        }
        display(freq);
    } 

    // Driver program to test above 
    public static void main(String args[]) 
    { 
        str = "nomatterhowbusyyoumaythinkyouareyoumustfindtimeforreadingorsurrenderyourselftoselfchosenignorance"; 
        str.toLowerCase();
        CharFreq(); 
    } 

    static void display(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) 
        { 
            System.out.print(arr[i][0]+" "+arr[i][1]);
        } 
        System.out.println();
    }
}
 
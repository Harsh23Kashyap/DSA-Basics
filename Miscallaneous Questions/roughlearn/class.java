/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
class Main
{ 
    static Scanner scr = new Scanner(System.in);
    // Method to sort a string alphabetically 
    public static String sortString(String inputString) 
    { 
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray(); 

        // sort tempArray 
        Arrays.sort(tempArray); 

        // return new sorted string 
        return new String(tempArray); 
    } 

    // Driver method 
    public static void main(final String[] args) 
    { 
        int n=0;
        String inputString="",sub="";
        try{
        n=scr.nextInt();
    } catch(Exception e) {

    }

        String answer[] = new String[n];
        String str[]= new String[n];
        for(int i=0; i<n; i++)
        {
            try{
            inputString = scr.next();
            sub= scr.next();
        } catch(Exception e) {

        }
            str[i] = sortString(inputString);
            char ch= sub.charAt(0);
            for (int j=0;j<sub.length();j++)
            {
                int f=str[i].indexOf(sub.charAt(j));
                str[i]=str[i].substring(0,f)+str[i].substring(f+1);
            } 
            for (int j=0;j<str[i].length();j++)
            {
                if(str[i].charAt(j)>ch)
                {
                    if()
                    str[i]=str[i].substring(0,j)+sub+str[i].substring(j);
                    break;
                }
                
            } 
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        } 
    }
}
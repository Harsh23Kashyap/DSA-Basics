import java.util.*;
public class Main
{
    static Scanner scr=new Scanner(System.in);
    public static void main(String[] args) 
    {
        int n=0,x=0,t=0;
        try 
        {
            t=scr.nextInt();
        } 
        catch (Exception e) 
        {
        }
        int test[]=new int[t];
        for (int i=0;i<t;i++)
        {
            try 
            {
                n=scr.nextInt();
                x=scr.nextInt();
            } 
            catch (Exception e) 
            {
            }
            if(n==1 || n==2)
                test[i]=1;
            else if (n>2)
                test[i]=((int)Math.ceil(((n-2)*1.0)/(x*1.0)))+1;
            else
                test[i]=-1;

        }
        for (int i=0;i<t;i++)
        {
            System.out.println(test[i]);

        }
    }
}
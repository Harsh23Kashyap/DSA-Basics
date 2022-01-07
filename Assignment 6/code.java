import java.util.Scanner;
class CodeChef 
{
    static int[][] freq = new int[52][2]; 
    static String str;
    static int n;
    static Scanner scr=new Scanner(System.in);
    
    // Driver program to test above 
    public static void main(final String args[]) 
    {  
        try
        {
            str=scr.nextLine();
            n=str.length();
        }
        catch(Exception e)
        {
        }
        int c=0;
        try
        {
            c=scr.nextInt();
        }
        catch(Exception e)
        {
        }
        int count[]=new int[c];
        for(int i=0;i<c;i++)
        {
            try
            {
                count[i]=scr.nextInt();
            }
            catch(Exception e)
            {
            }
        }
        CharFreq(); 
        for(int i=0;i<c;i++)
        {
            work(count[i]);
        }
    } 
    static void CharFreq() 
    { 
        int ind=0;
            for (int i = 0; i < n; i++)
            {
                final int val= found(i,ind);
                if(val==-1)
                {
                    freq[ind][0]=str.charAt(i) - 'a';
                    freq[ind][1]++;
                    ind++;
                }
                else
                {
                    freq[val][1]++;
                }
            }
            display(freq);
    } 

    static int found(final int m,final int ind)
    {
        final int ch=str.charAt(m)-'a';
            for(int i=0;i<ind;i++)
            {
                if (freq[i][0]==ch)
                    return i;
            }
            return -1;
       
    }
    
    static void work(int val)
    {
        int first=str.indexOf(" "+val+" ");
            int last=str.lastIndexOf(" "+val+" ");
            if(first==last || first==-1)
            {
                System.out.println(str);
                return;
            }

            first=first+3;
            last--;
            String initial=" "+str.substring(0, first);
            String end=" "+str.substring(last,str.length()-1);
            String op= " "+str.substring(first,last)+" ";
            String mid="";
            for(int i=3;i<op.length();i+=4)
            {
                char a=op.charAt(i);
                char b=op.charAt(i+1);
                char c=op.charAt(i+2);
                int temp,p;
                if(Character.isDigit(a) && Character.isDigit(b) && Character.isDigit(c))
                {
                    temp=Integer.valueOf(String.valueOf(a)+String.valueOf(b)+String.valueOf(c));
                    i++;
                }
                else if(Character.isDigit(a) && Character.isDigit(b))
                {
                    temp=Integer.valueOf(String.valueOf(a)+String.valueOf(b));
                    i++;
                }
                else
                {
                    temp=(int)op.charAt(i)-'0';
                }
                if(temp>99)
                p=5;
                else if(temp>9)
                p=4;
                else
                p=3;
                if(temp<val)
                {
                    initial=op.substring(i-p, i+1)+initial;
                }
                else if (temp>val)
                {
                    end+=op.substring(i-p, i+1);
                }
                else
                {
                    mid+=op.substring(i-p, i+1);
                }
            }
            initial=initial.substring(1);
            if(mid!="")
                mid=mid.substring(1)+" ";
            if(end!="")
                end=end.substring(1);
            
            str=initial+mid+end;
            str=str+" ";
            System.out.println(str);

    }
    static void display(final int arr[][])
    {
         str="";
            for (int i = 0; i < arr.length; i++) 
            { 
                if (arr[i][1]!=0)
                    str=str+((char)('a'+arr[i][0]))+" "+arr[i][1]+" ";
                else
                    break;
            } 
            System.out.println(str);
       
    }
}
 
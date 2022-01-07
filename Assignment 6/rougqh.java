import java.lang.*;

import sun.awt.www.content.image.png;
class Rough
{
    static String str="k 1 b 1 w 1 n 8 o 11 m 4 a 5 t 6 e 10 r 10 h 3 d 3 g 2 l 2 c 2 u 7 s 6 y 6 i 5 f 4 ";
    public static void main(String[] args) 
    {
        work(6);
    }
    static void work(int val)
    {
        int first=str.indexOf(" "+val+" ");
        int last=str.lastIndexOf(" "+val+" ");
        first=first+3;
        last--;
        String initial=" "+str.substring(0, first);
        String end=" "+str.substring(last,str.length()-1);
        String op= " "+str.substring(first,last);
        String mid="";
        for(int i=3;i<op.length();i+=4)
        {
            char a=op.charAt(i);
            char b=op.charAt(i+1);
            int temp,p;
            if(Character.isDigit(a) && Character.isDigit(b))
            {
                temp=Integer.valueOf(String.valueOf('6')+String.valueOf('6'));
                i++;
            }
            else
            {
                temp=(int)op.charAt(i)-'0';
            }
            p=(temp>9)?4:3;
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
        System.out.println(str);

    }
}
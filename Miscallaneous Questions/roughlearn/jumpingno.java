/*
Given a positive number X. Find all Jumping Numbers smaller than or equal to X. 
Jumping Number: A number is called Jumping Number if all adjacent digits in it differ by only 1. All single digit numbers are considered as Jumping Numbers. For example 7, 8987 and 4343456 are Jumping numbers but 796 and 89098 are not.

Input:
The first line of the input contains T denoting the number of testcases. Each testcase contain a positive number X.

Output:
Output all the jumping numbers less than X in sorted order. Jump to example for better understanding.

*/

import java.util.*;
import java.lang.*;
class JumpingNumber
{
    static Scanner scr=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter no. : ");
        int n=scr.nextInt();
        System.out.print("Jumping numbers from 1 to "+n+" are : ");
        for(int i=0;i<n;i++)
        {
            if(i<=9)
                System.out.print(i+", ");
            else
                jump(i);
        }
    }
    static void jump(int n)
    {
        for (int i=n;i>9;i/=10)
        {
            if(!((Math.abs((i%10)-((i%100)/10)))==1))
            return;
        }
        System.out.print(n+", ");
    }
}

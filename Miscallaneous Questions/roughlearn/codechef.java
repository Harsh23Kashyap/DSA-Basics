
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scr= new Scanner(System.in);
    public static void solve()
    {
        int n=0;
        try{
        n=scr.nextInt();
        }
        catch (Exception e){}
        int arr[][]=new int [n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                {
                    try{
                    arr[i][j]=scr.nextInt();
                    }
                    catch (Exception e){}

                }
        int v1[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[0][i]!=i+1)
                v1[k++]=-1;
            else 
                v1[k++]=1;
        }
        int ans=0;
        if(v1[1]==-1)
            ans=1;
        for(int i=2;i<n;i++)
        {
            if(v1[i]!=v1[i-1] && v1[i]!=1)
            ans+=2;
        }
        System.out.println(ans);
    }
    public static void main (String[] args) throws java.lang.Exception
	{
        int t=0;
        try{
        t=scr.nextInt();
        }        catch (Exception e){}

        while(t>0)
        {
            solve();
        }
    }
}
/*
#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void solve()
{
    int n;
    cin >> n;
    int input;
    vector<int> a[n];
    for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
            {
                cin >> input;
                a[i].push_back(input);
            }
    vector<int> b;
    for(int i=0;i<n;i++)
    {
        if(a[0][i]!=i+1)
            b.push_back(-1);
        else 
            b.push_back(1);
    }
    int ans=0;
    if(b[1]==-1)
        ans=1;
    for(int i=2;i<n;i++)
    {
        if(b[i]!=b[i-1] && b[i]!=1)
        ans+=2;
    }
    cout << ans << endl;
}
int main()
{
    int test;
    cin >> test;
    while(test--)
    {
        solve();
    }
    return 0;
}
*/
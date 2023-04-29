//to find the palindrome of integer eg 131 is palindrome and 331 is !palindrome

import java.util.*;

class palin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		    int a=sc.nextInt();
		    int r,temp,sum=0;
		    temp=a;
		    while(a>0)
		    {
		        r=a%10;
		        sum=(sum*10)+r;
		        a=a/10;
		    }
		    
		    if(temp==sum)
		    {
		        System.out.println("wins");
		    }
		    else
		    {
		        System.out.println("loses");
		    }
		    t--;
		}   
	}
}


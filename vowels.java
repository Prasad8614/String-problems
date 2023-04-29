/* if string contains more than 2 (==3)vowels continuesly the print happ else print sad
    eg:- aeiou    ans is happy
        aeipsg      ans is happy
        aepsg       ans is sad
*/

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		int c=0;
		while(t!=0)
		{
		    String str=sc.next();
		    for(int i=0;i<str.length();i++)
		    {
		        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
		        {
		            c++;
		            if(c==3)
		            {
		                System.out.println("happy");
		                break;
		            }
		        }
		        else
		        {
		            c=0;
		        }
		    }
		    
		   if(c!=3)
		   {
		       System.out.println("sad");
		   }
		    t--;
		}
	}
}

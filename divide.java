/* the given string is a="abcabc"
break the string and check whether the two string are equal or not 
if equals the print "YES" else print "NO"
"abcabc" ans is "YES"
"abcdef" ans is "NO"
 */


import java.util.Scanner;

class divide
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		    int n=sc.nextInt();
            String s=sc.next();
            int flag=0;
            for(int i=0;i<(n/2);i++)
            {
                if(s.charAt(i)==s.charAt((n/2)+i))
                {
                    flag=0;
                }
                else
                {
                    flag=1;
                    break;
                }
            }
		    
		    if(flag==0)
		    {
		        System.out.println("yes");
		    }
		    else
		        System.out.println("no");
		    t--;
		}
	}
}


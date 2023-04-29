import java.lang.reflect.Array;
import java.util.Arrays;

// sort the character in alphabetical order

public class sortstr {
    public static void main(String[] args) {
        String str="prasdhv";
        System.out.println(str);
        //approach-1 without sort method
        char[] ch=str.toCharArray();
        char temp;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(ch[i]>ch[j])
                {
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
       System.out.println(new String(ch));

       //approach-2 with sort method
       String str1="abhishek";
       char[] ch1=str1.toCharArray();
       Arrays.sort(ch1);
       System.out.println(new String(ch1));
       
    }
}

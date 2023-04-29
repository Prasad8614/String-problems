//to replace char by its occurance 
//eg str="prasad" ans must be pr1s2d

public class charocc {
    public static void main(String[] args) {
        String str="prasad";
        char ch[]=str.toCharArray();
        char c='a';
        int cnt=1;

        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==c)
            {
                ch[i]=String.valueOf(cnt).charAt(0);
                cnt++;
            }
        }
        System.out.println(new String(ch));
    }   
}

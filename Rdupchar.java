import java.util.HashSet;

// to Remove duplicate character in string

public class Rdupchar {
    public static void main(String[] args) {
        String str="prasadd";
        StringBuilder sb=new StringBuilder();
        HashSet<Character> map=new HashSet<Character>(); //hashset is used to remove duplicate element from string
        for(int i=0;i<str.length();i++)
        {
            map.add(str.charAt(i));
        }

        //below for is to conver char array to string 
        for(char c:map)
        {
            sb.append(c);
        }
        System.out.println(sb);
    }
}

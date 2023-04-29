import java.util.HashMap;

//to find occurance of each character in string

public class findocc {
    public static void main(String[] args) {
        String str="hello all";
        char[] ch=str.toCharArray();
        HashMap<Character,Integer> map =new HashMap<>();
        for(char c:ch)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }   
}

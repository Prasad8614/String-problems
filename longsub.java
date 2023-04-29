import java.util.HashMap;

// to find longest substring 
//eg  "aabbcc" then ans should be "abc"

public class longsub {
    public static void main(String[] args) {
        String str = "abbacc";
        String lsub = null;
        int lss = 0;
        char ch[] = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            char a = ch[i];
            if (map.containsKey(a)) {
                i = map.get(a);
                map.clear();
            } else {
                map.put(a, i);                
            }
            if (map.size() > lss) {
                lss = map.size();
                lsub = map.keySet().toString();
            }
        }
        System.out.println(lsub);
    }
}

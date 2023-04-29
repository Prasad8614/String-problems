// this code calculates the first non repeating character from the given string

public class nonrec {
    public static void main(String[] args) {
        String str = "aabcdbc";
        

        for (int i = 0; i < str.length(); i++) {  
            boolean flag = true;  
            for (int j = 0; j < str.length(); j++) {
                if (i!=j && str.charAt(i) == str.charAt(j)) {
                    flag = false;
                }

            }
            if (flag) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
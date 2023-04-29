//to check wheater the string is palindrome or not

import java.util.*;

public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        boolean flag = true;
        for (int i = 0; i < n / 2; ++i) {
            if (str.charAt(i) == str.charAt(n - i - 1))
                continue;
            else {
                System.out.println("no");
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("yes");
    }
}

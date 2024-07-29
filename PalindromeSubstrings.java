import java.util.*;
public class PalindromeSubstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String string = in.next();
        findAllPalindromes(string);
    }

    public static void findAllPalindromes(String string) {
        int n = string.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String subStr = string.substring(i,j);
                if (isPalindrome(subStr)) {
                    if(subStr.length()>2)
                    System.out.println(subStr);
                }
            }
        }
    }
    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }
}

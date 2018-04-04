package simon.leetcode.p125;

/**
 * https://leetcode-cn.com/problems/valid-palindrome/description/
 *
 * @author lsm2333
 */
public class ValidPalindrome1 {
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder(" ");
        System.out.println(SolutionP125.validPalindrome1(input.toString()));
    }
}

class SolutionP125 {
    public static boolean validPalindrome1(String s) {
        if (s.length() == 0) {
            return true;
        }
        s = format(s);
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    private static String format(String input) {
        input = input.toLowerCase().replaceAll("[^0-9a-zA-Z]", "");
        return input;
    }

}
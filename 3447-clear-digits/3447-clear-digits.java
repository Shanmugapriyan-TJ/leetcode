import java.util.*;

public class Solution {
    public String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // when encountering a digit, remove the closest non-digit to the left if exists
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                // non-digit, just keep it
                stack.append(c);
            }
        }
        return stack.toString();
    }

    // For local testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        Solution sol = new Solution();
        System.out.println(sol.clearDigits(s));
    }
}

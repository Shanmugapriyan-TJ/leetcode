class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res = longer(res, expand(s, i, i));
            res = longer(res, expand(s, i, i + 1));
        }
        return res;
    }

    private String expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--; r++;
        }
        return s.substring(l + 1, r);
    }

    private String longer(String a, String b) {
        return a.length() > b.length() ? a : b;
    }
}
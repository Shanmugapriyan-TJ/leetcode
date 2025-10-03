class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        int freq[]=new int[26];
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            int ch1=s.charAt(i)-'a';
           // int ch2=t.charAt(i)-'a';
            sum+=Math.abs(i-freq[ch1]);
        }
        return sum;
    }
}
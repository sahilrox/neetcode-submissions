class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l=0, maxFreq = 0, maxWindow = 0;

        for (int r=0; r<s.length(); r++) {
            freq[s.charAt(r)-'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(r)-'A']);
            int window = r-l+1;
            if (window - maxFreq > k) {
                freq[s.charAt(l)-'A']--;
                l++;
            }
            window = r-l+1;
            maxWindow = Math.max(window, maxWindow);
        }
        return maxWindow;
    }
}

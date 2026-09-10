class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128];
        Arrays.fill(lastSeen, -1);
        int maxLength = 0;
        int start = 0;
        for(int i=0; i<s.length(); i++) {
            if(lastSeen[s.charAt(i)] >= start) {
                start = lastSeen[s.charAt(i)] + 1;
            }
            lastSeen[s.charAt(i)] = i;
            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}

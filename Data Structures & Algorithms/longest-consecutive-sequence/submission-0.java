class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        int maxLength = 0;
        for(int i : set) {
            if(set.contains(i-1)) {
                continue;
            }
            int j=i+1;
            while(set.contains(j)) {
                j++;
            }
            int length = j-i;
            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }
}

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            System.out.println(i + ":" + nums[i]);
            if(countMap.containsKey(nums[i])) {
                System.out.println(i + ":" + nums[i]);
                return true;
            }
            countMap.put(nums[i], 1);
        }
        return false;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            map.put(target - nums[i], i);
        }
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                continue;
            }
            if(map.get(nums[i]) == i) {
                continue;
            }
            result[0] = Math.min(i, map.get(nums[i]));
            result[1] = Math.max(i, map.get(nums[i]));
            return result;
        }
        return result;
    }
}

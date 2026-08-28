class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int pivot=0; pivot<nums.length - 2; pivot++) {
            if (pivot != 0 && nums[pivot-1] == nums[pivot]) {
                continue;
            }
            int leftPointer = pivot + 1;
            int rightPointer = nums.length - 1;
            while(leftPointer < rightPointer) {
                int sum = nums[leftPointer] + nums[rightPointer] + nums[pivot];
                if(sum < 0) {
                    leftPointer++;
                } else if(sum > 0) {
                    rightPointer--;
                } else {
                    List<Integer> result = new ArrayList<Integer>();
                    result.add(nums[pivot]);
                    result.add(nums[leftPointer]);
                    result.add(nums[rightPointer]);
                    resultList.add(result);
                    leftPointer++;
                    rightPointer--;
                    while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer - 1]) {
                        ++leftPointer;
                    }
                }
            }
        }
        return resultList;
    }
}

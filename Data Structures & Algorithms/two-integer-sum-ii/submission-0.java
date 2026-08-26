class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        while(leftPointer < rightPointer) {
            int sum = numbers[leftPointer] + numbers[rightPointer];
            if(sum == target) {
                result[0] = leftPointer + 1;
                result[1] = rightPointer + 1;
                return result;
            }
            if (sum < target) {
                leftPointer++;
                continue;
            }
            if (sum > target) {
                rightPointer--;
                continue;
            }
        }
        return result;
    }
}

class Solution {
    public int trap(int[] height) {
        int water = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        while(rightPointer > leftPointer) {
            leftMax = Math.max(leftMax, height[leftPointer]);
            rightMax = Math.max(rightMax, height[rightPointer]);
            if(leftMax > rightMax) {
                water += rightMax - height[rightPointer];
                rightPointer--;
            } else {
                water += leftMax - height[leftPointer];
                leftPointer++;
            }
        }
        return water;
    }
}
